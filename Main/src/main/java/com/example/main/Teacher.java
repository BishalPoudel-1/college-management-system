package com.example.main;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Teacher {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty email;
    private final StringProperty password;
    private final StringProperty contact;
    private final StringProperty location;
    private final StringProperty course;
    private final StringProperty specialization;
    private final StringProperty startDate;

    public Teacher(String id, String name, String email, String password, String contact, String location, String course, String specialization, String startDate) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.contact = new SimpleStringProperty(contact);
        this.location = new SimpleStringProperty(location);
        this.course = new SimpleStringProperty(course);
        this.specialization = new SimpleStringProperty(specialization);
        this.startDate = new SimpleStringProperty(startDate);
    }

    public String getId() { return id.get(); }
    public String getName() { return name.get(); }
    public String getEmail() { return email.get(); }
    public String getPassword() { return password.get(); }
    public String getContact() { return contact.get(); }
    public String getLocation() { return location.get(); }
    public String getCourse() { return course.get(); }
    public String getSpecialization() { return specialization.get(); }
    public String getStartDate() { return startDate.get(); }

    // Setters
    public void setId(String id) { this.id.set(id); }
    public void setName(String name) { this.name.set(name); }
    public void setEmail(String email) { this.email.set(email); }
    public void setPassword(String password) { this.password.set(password); }
    public void setContact(String contact) { this.contact.set(contact); }
    public void setLocation(String location) { this.location.set(location); }
    public void setCourse(String course) { this.course.set(course); }
    public void setSpecialization(String specialization) { this.specialization.set(specialization); }
    public void setStartDate(String startDate) { this.startDate.set(startDate); }
}
