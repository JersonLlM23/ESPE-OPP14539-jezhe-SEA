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
    private String deparment;

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

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "CreateProfessor{" + "id=" + id + ", name=" + name + ", deparment=" + deparment + '}';
    }

    public CreateProfessor(int id, String name, String deparment) {
        this.id = id;
        this.name = name;
        this.deparment = deparment;
    }
    
    public Document toDocument(){
        return new Document("id", id).append("Nombre", name).append("Departamento", deparment);
    }
    
}
