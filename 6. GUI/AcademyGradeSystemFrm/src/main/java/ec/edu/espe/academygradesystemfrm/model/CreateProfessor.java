/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.model;

import org.bson.Document;

/**
 *
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */
public class CreateProfessor {
    private int id;
    private String name;
    private String department;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String deparment) {
        this.department = deparment;
    }

    @Override
    public String toString() {
        return "CreateProfessor{" + "id=" + id + ", name=" + name + ", department=" + department + '}';
    }

    public CreateProfessor(int id, String name, String deparment) {
        this.id = id;
        this.name = name;
        this.department = deparment;
    }
    
    public Document toDocument(){
        return new Document("id", id).append("Nombre", name).append("Departamento", department);
    }

}
