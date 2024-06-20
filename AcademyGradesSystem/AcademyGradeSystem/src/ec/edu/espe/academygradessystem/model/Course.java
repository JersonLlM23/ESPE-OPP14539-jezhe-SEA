/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author Ricardo Lainez JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;

public class Course {
    @Expose
    private Subject subject;
    @Expose
    private Professor professor;
    @Expose
    private List<Student> students;

    public Course(Subject subject, Professor professor) {
        this.subject = subject;
        this.professor = professor;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    // Getters and setters

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

    @Override
    public String toString() {
        return "Course{" + "subject=" + subject + ", professor=" + professor + ", students=" + students + '}';
    }
    
    
}

