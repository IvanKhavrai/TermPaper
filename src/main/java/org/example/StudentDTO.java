package org.example;

import org.jetbrains.annotations.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
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

}
