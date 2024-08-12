package com.assignment.Student;

public class StudentModel {

    private final String studentID;
    private final String firstName;
    private final String lastName;
    private final String gradeLevel;
    private final String email;
    private final String guardianEmail1;
    private final String guardianEmail2;
    private final String isArchived;
    private final String isDeleted;

    public StudentModel(String studentID, String firstName, String lastName, String gradeLevel, String email, String guardianEmail1, String guardianEmail2,
                        String isArchived, String isDeleted) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.email = email;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }
    @Override
    public String toString() {
        return studentID +
                firstName + '\'' +
                lastName + '\'' +
                gradeLevel +
                email + '\'' +
                guardianEmail1 + '\'' +
                guardianEmail2 + '\'' +
                isArchived + '\'' +
                isDeleted + '\'';
    }
}
