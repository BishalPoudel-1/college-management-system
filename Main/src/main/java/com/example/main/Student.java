package com.example.main;

import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty email;
    private SimpleStringProperty contact;
    private SimpleStringProperty location;
    private SimpleStringProperty course;
    private SimpleStringProperty marks;
    private SimpleStringProperty startDate;

    public Student(String id, String name, String email, String contact, String location, String course, String marks, String startDate) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.contact = new SimpleStringProperty(contact);
        this.location = new SimpleStringProperty(location);
        this.course = new SimpleStringProperty(course);
        this.marks = new SimpleStringProperty(marks);
        this.startDate = new SimpleStringProperty(startDate);
    }

    // Getters and setters for each property
    public String getId() { return id.get(); }
    public void setId(String id) { this.id.set(id); }
    public String getName() { return name.get(); }
    public void setName(String name) { this.name.set(name); }
    public String getEmail() { return email.get(); }
    public void setEmail(String email) { this.email.set(email); }
    public String getContact() { return contact.get(); }
    public void setContact(String contact) { this.contact.set(contact); }
    public String getLocation() { return location.get(); }
    public void setLocation(String location) { this.location.set(location); }
    public String getCourse() { return course.get(); }
    public void setCourse(String course) { this.course.set(course); }
    public String getMarks() { return marks.get(); }
    public void setMarks(String marks) { this.marks.set(marks); }
    public String getStartDate() { return startDate.get(); }
    public void setStartDate(String startDate) { this.startDate.set(startDate); }
}
