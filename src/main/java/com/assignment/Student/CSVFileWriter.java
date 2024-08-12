package com.assignment.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {


    public static void writeToNewCSVFile(List<StudentModel> students){

        String desktopPath = System.getProperty("user.home") + "/IdeaProjects/Week04_Task/src/main/resources/student";
        try{
            FileWriter fileWriter = new FileWriter(desktopPath + "/outputAssignment4.csv");
            for(StudentModel student : students){
                fileWriter.write(student.getStudentID() + ",");
                fileWriter.write(student.getFirstName() + ",");
                fileWriter.write(student.getLastName() + ",");
                fileWriter.write(student.getGradeLevel() + ",");
                fileWriter.write(student.getEmail() + ",");
                fileWriter.write(student.getGuardianEmail1() + ",");
                fileWriter.write(student.getGuardianEmail2() + ",");
                fileWriter.write(student.getIsArchived() + ",");
                fileWriter.write(student.getIsDeleted() + "\n");
            }
            fileWriter.close();
            System.out.println("DAta written");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
