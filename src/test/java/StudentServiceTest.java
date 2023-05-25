import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.example.StudentDTO;
import org.example.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class StudentServiceTest {
    @Mock
    private StudentService studentService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        studentService = new StudentService();
    }

    @Test
    public void testCreateStudent() {
        StudentDTO createdStudent = studentService.createStudent("John", "Doe", 3, "ABCD1234", "S12345");
        assertNotNull(createdStudent);
        assertEquals("John", createdStudent.getStudentName());
        assertEquals("Doe", createdStudent.getSurname());
        assertEquals(3, createdStudent.getYearOfStudy());
        assertEquals("ABCD1234", createdStudent.getPassportId());
        assertEquals("S12345", createdStudent.getStudentId());
    }
    
    @Test
    @Disabled
    public void testUpdateStudent() {
        // Mocking existing student data
        StudentDTO existingStudent = StudentDTO.builder()
                .studentName("John")
                .surname("Doe")
                .yearOfStudy(3)
                .passportId("ABCD1234")
                .studentId("S12345")
                .build();

        // Setting up mock behavior
        when(studentService.updateStudent(eq("S12345"), eq("Jane"), eq("Smith"), eq(4), eq("WXYZ5678"))).thenReturn(existingStudent);

        // Calling the updateStudent method
        StudentDTO updatedStudent = studentService.updateStudent("S12345", "Jane", "Smith", 4, "WXYZ5678");

        // Verifying the results
        assertNotNull(updatedStudent);
        assertEquals("Jane", updatedStudent.getStudentName());
        assertEquals("Smith", updatedStudent.getSurname());
        assertEquals(4, updatedStudent.getYearOfStudy());
        assertEquals("WXYZ5678", updatedStudent.getPassportId());
        assertEquals("S12345", updatedStudent.getStudentId());

        // Verifying that the mock behavior was called
        verify(studentService, times(1)).updateStudent(eq("S12345"), eq("Jane"), eq("Smith"), eq(4), eq("WXYZ5678"));
    }

    @Test
    public void testDeleteStudent() {
        // Mocking existing student data
        StudentDTO existingStudent = StudentDTO.builder()
                .studentName("John")
                .surname("Doe")
                .yearOfStudy(3)
                .passportId("ABCD1234")
                .studentId("S12345")
                .build();

        // Adding the student to the service
        studentService.createStudent("John", "Doe", 3, "ABCD1234", "S12345");

        // Deleting the student
        studentService.deleteStudent("S12345");

        // Verifying that the student was removed
        assertNull(studentService.updateStudent("S12345", "Jane", "Smith", 4, "WXYZ5678"));
    }
}