/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.model;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
import java.util.List;

public class Professor {
    private String professorID;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private List<String> coursesTaught;
    private String officeNumber;
    private String phoneNumber;
    private String dateOfHire;

    // Constructor
    public Professor(String professorID, String firstName, String lastName, String email, 
                     String department, List<String> coursesTaught, String officeNumber, 
                     String phoneNumber, String dateOfHire) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.coursesTaught = coursesTaught;
        this.officeNumber = officeNumber;
        this.phoneNumber = phoneNumber;
        this.dateOfHire = dateOfHire;
    }

    // Getters and Setters
    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    // Method to display professor's information
    @Override
    public String toString() {
        return "Professor ID: " + professorID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n" +
               "Department: " + department + "\n" +
               "Courses Taught: " + String.join(", ", coursesTaught) + "\n" +
               "Office Number: " + officeNumber + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Date of Hire: " + dateOfHire;
    }
}