package com.example.studentmanagement;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class StudentManagementApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        studentRepository.deleteAll(); // Clear the database before each test
    }

    @Test
    void contextLoads() {
        // This test checks if the application context loads successfully
    }

    @Test
    void testAddStudent() throws Exception {
        mockMvc.perform(post("/students")
                .param("name", "John Doe")
                .param("email", "john.doe@example.com"))
                .andExpect(status().is3xxRedirection()); // Expect a redirect after adding a student
    }

    // Additional tests can be added here
}