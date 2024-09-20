package com.example.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateCredentials {
    private static final String FILE_PATH = "csv/Credential.csv"; // Adjust path based on your directory structure

    public boolean validateCredentials(String email, String password, String role) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean isHeader = true; // Flag to skip header row
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip the header row
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 3 &&
                        values[0].trim().equals(email) &&
                        values[1].trim().equals(password) &&
                        values[2].trim().equals(role)) {
                    return true; // Credentials match
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Credentials do not match
    }
}
