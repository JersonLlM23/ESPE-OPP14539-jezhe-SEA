/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.model;

import org.bson.Document;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class CreateUser {
    private int id;
    private String username ;
    private String password;

    public CreateUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CreateUser{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }
    public Document toDocument(){
        return new Document("id", id).append("username", username).append("Password", password);
    }
}
