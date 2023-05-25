package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<StudentDTO> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public StudentDTO createStudent(String studentName, String surname, int yearOfStudy, String passportId, String studentId) {
        StudentDTO studentDTO = StudentDTO.builder()
                .studentName(studentName)
                .surname(surname)
                .yearOfStudy(yearOfStudy)
                .passportId(passportId)
                .studentId(studentId)
                .build();

        students.add(studentDTO);

        return studentDTO;
    }

    public StudentDTO updateStudent(String studentId, String newStudentName, String newSurname, int newYearOfStudy, String newPassportId) {
        for (StudentDTO student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.setStudentName(newStudentName);
                student.setSurname(newSurname);
                student.setYearOfStudy(newYearOfStudy);
                student.setPassportId(newPassportId);
                return student;
            }
        }

        return null; // Student not found
    }

    public void deleteStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }
}