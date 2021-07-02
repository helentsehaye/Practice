package edu.miu.cs.cs425.demos.model;

import java.time.LocalDate;

public class Student {
    private int studentId;
    private String name;
    private LocalDate dateOfadmission;


    public Student(int studentId, String name, LocalDate dateOfadmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfadmission = dateOfadmission;
    }

    public Student(){
        super();
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfadmission() {
        return dateOfadmission;
    }

    public void setDateOfadmission(LocalDate dateOfadmission) {
        this.dateOfadmission = dateOfadmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfadmission=" + dateOfadmission +
                '}';
    }
}
