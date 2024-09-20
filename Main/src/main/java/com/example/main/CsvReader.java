package com.example.main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class CsvReader {
        public static ObservableList<Student> readCsvStudent(String filePath) {
            ObservableList<Student> students = FXCollections.observableArrayList();
            String line;
            String csvSplitBy = ",";

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    System.out.println(data);
                    students.add(new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(students);
            return students;
        }
        public static ObservableList<Teacher> readCsvTeacher(String filePath) {
            ObservableList<Teacher> teachers = FXCollections.observableArrayList();
            String line;
            String csvSplitBy = ",";

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                // Skip header line
                br.readLine();

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    // Ensure there are enough columns to avoid ArrayIndexOutOfBoundsException
                    if (data.length >= 9) {
                        teachers.add(new Teacher(
                                data[0],  // ID
                                data[1],  // Name
                                data[2],  // Email
                                data[3],  // Password
                                data[4],  // Contact
                                data[5],  // Location
                                data[6],  // Course
                                data[7],  // Specialization
                                data[8]   // Start Date
                        ));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(teachers);  // Debug print to verify data
            return teachers;
        }


    }


