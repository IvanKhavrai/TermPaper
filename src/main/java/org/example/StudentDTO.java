package org.example;

import org.jetbrains.annotations.NotNull;

import lombok.Builder;

@Builder
public class StudentDTO {
    @NotNull
    private String studentName;

    @NotNull
    private String surname;

    private int yearOfStudy;

    @NotNull
    private String passportId;

    @NotNull
    private String studentId;
//vvvvvv
}
