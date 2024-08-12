package com.assignment.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "/Users/gamp/Desktop/student_data.csv.csv"; //Path to file in desktop
        List<StudentModel> students = new ArrayList<>();
        CSVFileReader.readFromCSVFile(students, filePath);
        CSVFileWriter.writeToNewCSVFile(students);
    }

}