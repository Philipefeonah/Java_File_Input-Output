package com.assignment.Teacher;

public class TeacherModel {
    private final String teacherID;
    private final String email;
    private final String firstName;
    private final String lastName;


    public TeacherModel(String teacherID, String email, String firstName, String lastName) {
        this.teacherID = teacherID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return '\'' + teacherID + '\''+ "  " +
                '\'' + email + '\'' + "  " +
                '\'' + firstName + '\'' + "  "+
                '\'' + lastName + '\'' + "  ";
    }
}
