/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

public class Student {
    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private int age;
    @Expose
    private String major;
    @Expose
    private double gpa;
    @Expose
    private List<Double> grades;

    public Student(String id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
        updateGPA();
    }

    public void updateGrade(int index, double grade) {
        if (index >= 0 && index < grades.size()) {
            grades.set(index, grade);
            updateGPA();
        }
    }

    public void deleteGrade(int index) {
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
            updateGPA();
        }
    }

    private void updateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        this.gpa = grades.size() > 0 ? total / grades.size() : 0;
    }

    public double getGPA() {
        return gpa;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", major=" + major + ", gpa=" + gpa + ", grades=" + grades + '}';
    }
    
    
}
