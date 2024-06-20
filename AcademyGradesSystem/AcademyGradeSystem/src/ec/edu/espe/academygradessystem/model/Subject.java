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

public class Subject {
    @Expose
    private String code;
    @Expose
    private String name;
    @Expose
    private int credits;

    public Subject(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    // Getters and setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" + "code=" + code + ", name=" + name + ", credits=" + credits + '}';
    }
    
    
}

