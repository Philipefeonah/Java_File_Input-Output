package com.assignment.Teacher;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVFileReaderForTeacher {
    public static void readFromCSVFile(List<TeacherModel> teachers, String filePath){

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",", -1);
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = "null";
                    }
                }
                TeacherModel teacher = new TeacherModel(fields[0], fields[1], fields[2], (fields[3]));
                teachers.add(teacher);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (TeacherModel teacher : teachers) {
            System.out.println(teacher);
        }

    }
}
