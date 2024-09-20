package com.example.main;

public class TeacherCsvReader {

        private String uniqueId;
        private String email;
        private String password;
        private String role;
        private String contactNumber;
        private String location;
        private String lecturer;
        private String specialization;
        private String degree;
        private String startDate;

        public TeacherCsvReader(String uniqueId, String email, String password, String role, String contactNumber, String location,
                       String lecturer, String specialization, String degree, String startDate) {
            this.uniqueId = uniqueId;
            this.email = email;
            this.password = password;
            this.role = role;
            this.contactNumber = contactNumber;
            this.location = location;
            this.lecturer = lecturer;
            this.specialization = specialization;
            this.degree = degree;
            this.startDate = startDate;
        }

        // Getters and setters for each field
        public String getUniqueId() { return uniqueId; }
        public void setUniqueId(String uniqueId) { this.uniqueId = uniqueId; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getContactNumber() { return contactNumber; }
        public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }

        public String getLecturer() { return lecturer; }
        public void setLecturer(String lecturer) { this.lecturer = lecturer; }

        public String getSpecialization() { return specialization; }
        public void setSpecialization(String specialization) { this.specialization = specialization; }

        public String getDegree() { return degree; }
        public void setDegree(String degree) { this.degree = degree; }

        public String getStartDate() { return startDate; }
        public void setStartDate(String startDate) { this.startDate = startDate; }
    }

