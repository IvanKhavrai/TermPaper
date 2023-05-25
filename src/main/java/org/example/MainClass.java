package org.example;


import java.util.List;

public class MainClass{ public static void main(String[] args) {
    // Creating an instance of StudentService
    StudentService studentService = new StudentService();

    // Creating a new student using the createStudent method
    StudentDTO student1 = studentService.createStudent("John", "Doe", 2, "123456789", "S12345");
    System.out.println("Created student: " + student1);

    // Updating a student using the updateStudent method
    StudentDTO updatedStudent = studentService.updateStudent("S12345", "John", "Smith", 3, "987654321");
    if (updatedStudent != null) {
        System.out.println("Updated student: " + updatedStudent);
    } else {
        System.out.println("Student not found");
    }

    // Deleting a student using the deleteStudent method
    studentService.deleteStudent("S12345");
    System.out.println("Student deleted");

    List<StudentDTO> students = studentService.getStudents();
    System.out.println("Total students: " + students.size());
    for (StudentDTO student : students) {
        System.out.println(student);
    }
   System.out.println("Welcome");
}
}

        System.out.println("Welcome");


