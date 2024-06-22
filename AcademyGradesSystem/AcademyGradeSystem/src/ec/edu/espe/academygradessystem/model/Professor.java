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

public class Professor {
    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private String department;
    @Expose
    private List<Course> courses;

    public Professor(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", department=" + department + ", courses=" + courses + '}';
    }

    
    
}
