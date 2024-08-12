package com.assignment.Teacher;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriterForTeacher {

    public static void writeToNewCSVFile(List<TeacherModel> teachers){

        String desktopPath = System.getProperty("user.home") + "/IdeaProjects/Week04_Task/src/main/resources/teacher";
        try{
            FileWriter fileWriter = new FileWriter(desktopPath + "/outputAssignment.csv");
            for(TeacherModel teacher : teachers){
                fileWriter.write(teacher.getTeacherID() + ",");
                fileWriter.write(teacher.getEmail() + ",");
                fileWriter.write(teacher.getFirstName() + ",");
                fileWriter.write(teacher.getLastName() + "\n");
            }
            fileWriter.close();
            System.out.println("Data Successfully written!!");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
