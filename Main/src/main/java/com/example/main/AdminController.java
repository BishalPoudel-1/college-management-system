package com.example.main;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminController {

    @FXML
    private AnchorPane Course;

    @FXML
    private AnchorPane Dashboard;

    @FXML
    private AnchorPane Staff;

    @FXML
    private AnchorPane Student;

    @FXML
    private AnchorPane Teacher;

    @FXML
    private Button course1;

    @FXML
    private Label dateLabel;

    @FXML
    private Button imageButton121;

    @FXML
    private Button imageButton1211;

    @FXML
    private Button imageButton12111;

    @FXML
    private Button imageButton121111;

    @FXML
    private Button imageButton12112;

    @FXML
    private Button imageButton121122;

    @FXML
    private Button imageButton1212;

    @FXML
    private Button imageButton12121;

    @FXML
    private Button imageButton1213;

    @FXML
    private Button roundedButton;

    @FXML
    private Button staff1;

    @FXML
    private Button upload;

    @FXML
    private Button student;

    @FXML
    private Button student1;

    @FXML
    private Button teacher1;

    // Student TableView and Columns
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TableColumn<Student, String> idColumn;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> emailColumn;
    @FXML
    private TableColumn<Student, String> contactColumn;
    @FXML
    private TableColumn<Student, String> locationColumn;
    @FXML
    private TableColumn<Student, String> courseColumn;
    @FXML
    private TableColumn<Student, String> marksColumn;
    @FXML
    private TableColumn<Student, String> startDateColumn;

    // Teacher TableView and Columns
    @FXML
    private TableView<Teacher> tableViewteacher;

    @FXML
    private TableColumn<Teacher, String> idColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> nameColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> emailColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> passwordColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> contactColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> locationColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> courseColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> specializationColumnTeacher;
    @FXML
    private TableColumn<Teacher, String> startDateColumnTeacher;

    @FXML
    void getDashboard(ActionEvent event) {
        visibility(true, false, false, false, false);
    }

    @FXML
    void getCourse(ActionEvent event) {
        visibility(false, true, false, false, false);
    }

    @FXML
    void getStaff(ActionEvent event) {
        visibility(false, false, true, false, false);
    }

    @FXML
    void getStudent(ActionEvent event) {
        visibility(false, false, false, true, false);
    }

    @FXML
    void getTeacher(ActionEvent event) {
        visibility(false, false, false, false, true);
        initializeTeacher();
    }

    public void visibility(boolean b, boolean b1, boolean b2, boolean b3, boolean b4) {
        Dashboard.setVisible(b);
        Course.setVisible(b1);
        Staff.setVisible(b2);
        Student.setVisible(b3);
        Teacher.setVisible(b4);
        if (b4) {
            initializeTeacher();
        }
    }

    public void addStudent(ActionEvent e) throws IOException {
       ErrorController.showAlert(Alert.AlertType.INFORMATION,"Future","Due to time limitation feature will be adding soon");
    }
    public void addteacher(ActionEvent e) throws IOException {
        ErrorController.showAlert(Alert.AlertType.INFORMATION,"Future","Due to time limitation feature will be adding soon");
    }
    public void addstaff(ActionEvent e) throws IOException {
        ErrorController.showAlert(Alert.AlertType.INFORMATION,"Future","Due to time limitation feature will be adding soon");
    }



    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));
        marksColumn.setCellValueFactory(new PropertyValueFactory<>("marks"));
        startDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));

        ObservableList<Student> students = CsvReader.readCsvStudent("csv/StudentDetails.csv");
        System.out.println("Students list: " + students);
        tableView.setItems(students);
    }

    @FXML
    public void initializeTeacher() {
        // Column bindings
        idColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("uniqueId"));
        nameColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("email"));
        passwordColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("password"));
        contactColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("contact"));
        locationColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("location"));
        courseColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("course"));
        specializationColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("specialization"));
        startDateColumnTeacher.setCellValueFactory(new PropertyValueFactory<>("startDate"));

        ObservableList<Teacher> teachers = CsvReader.readCsvTeacher("csv/TeacherDetails.csv");
        System.out.println("Teachers list size: " + teachers.size()); // Debug print
        tableViewteacher.setItems(teachers);
    }
}
