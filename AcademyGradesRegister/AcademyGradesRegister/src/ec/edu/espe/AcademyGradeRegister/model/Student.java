/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private String course;
    private Map<String, Double> grades;
    private double gpa;
    private String dateOfBirth;
    private String address;

    //contructor
    public Student(String studentID, String firstName, String lastName, 
            String email, String course, Map<String, Double> grades1, 
            double gpa1, String dateOfBirth, String address) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to calculate GPA
    public void calculateGpa() {
        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }
        this.gpa = total / grades.size();
    }

    // toString method for displaying student information
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n" +
               "Course: " + course + "\n" +
               "GPA: " + gpa + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Address: " + address;
    }
}
    
