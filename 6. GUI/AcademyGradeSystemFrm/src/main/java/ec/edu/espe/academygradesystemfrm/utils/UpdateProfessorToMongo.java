/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */
public class UpdateProfessorToMongo {
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    public UpdateProfessorToMongo(){
        mongoClient = MongoClients.create("mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/");
        database = mongoClient.getDatabase("AcademyGradeRegister");
        
    }
    public MongoDatabase getDatabase(){
        return database;
    }
    public void close(){
        mongoClient.close();
    }
}
