/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.model;

/**
 *
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */

public class CreateStudent {
    private int id;
    private String name;
    private String degree;
    private int age;
    
    public CreateStudent(int id, String name, String degree, int age) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CreateStudent{" + "id=" + id + ", name=" + name + ", degree=" + degree + ", age=" + age + '}';
    }
}
