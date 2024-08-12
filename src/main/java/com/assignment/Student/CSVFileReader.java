package com.assignment.Student;

import java.io.*;
import java.util.List;

public class CSVFileReader {

    public static void readFromCSVFile(List<StudentModel> students, String filePath){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",", -1);
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = "null";
                    }
                }
                StudentModel student = new StudentModel(fields[0], fields[1], fields[2], (fields[3]), fields[4], fields[5],
                        fields[6], (fields[7]), (fields[8]));
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (StudentModel student : students) {
            System.out.println(student);
        }

    }
}
