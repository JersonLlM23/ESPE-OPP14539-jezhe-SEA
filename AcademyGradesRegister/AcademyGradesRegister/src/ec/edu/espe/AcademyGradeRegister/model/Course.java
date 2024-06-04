/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AcademyGradeRegister.model;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class Course {
    private String courseName;
    private Subject subject;
    private Professor professor;
    private List<Student> students;
    private Map<Student, Double> grades;

    public Course(String courseName, Subject subject, Professor professor, List<Student> students, Map<Student, Double> grades) {
        this.courseName = courseName;
        this.subject = subject;
        this.professor = professor;
        this.students = students; //new?
        this.grades = grades; //new?
    }

    //getters and setters of attributes
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Student, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<Student, Double> grades) {
        this.grades = grades;
    }
    
    //methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        grades.remove(student);
    }
    
    public void assignGrade(Student student, double grade) {
        if (students.contains(student)) {
            grades.put(student, grade);
        } else {
            System.out.println("el estudiante no esta en el curso.");
        }
    }
    
    
}
