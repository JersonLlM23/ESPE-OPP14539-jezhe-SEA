package ec.edu.espe.AcademyGradeRegister.model;

import java.util.List;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class Administrator {
    private String adminID;
    private String firstName;
    private String lastName;
    private String email;
    private String department;

    // Constructor
    public Administrator(String adminID, String firstName, String lastName, String email, String department) {
        this.adminID = adminID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
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

    // Method to generate report based on student's grades
    public String generateReport(Student student) {
        double averageGrade = student.calculateAverageGrade();
        String status;
        
        if (averageGrade < 7) {
            status = "Reprobado";
        } else if (averageGrade == 7) {
            status = "Supletorios";
        } else {
            status = "Aprobado";
        }
        
        return "Student ID: " + student.getStudentID() + "\n" +
               "Name: " + student.getFirstName() + " " + student.getLastName() + "\n" +
               "Average Grade: " + averageGrade + "\n" +
               "Status: " + status;
    }
    
    // Method to display administrator's information
    @Override
    public String toString() {
        return "Admin ID: " + adminID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n" +
               "Department: " + department;
    }
}

class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private List<Double> grades;

    // Constructor
    public Student(String studentID, String firstName, String lastName, List<Double> grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
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

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
