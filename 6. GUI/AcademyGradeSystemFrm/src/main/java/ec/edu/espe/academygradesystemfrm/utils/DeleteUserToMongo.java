/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class DeleteUserToMongo {
    private MongoDatabase database;
    private MongoClient mongoClient;
    
    public DeleteUserToMongo(){
        mongoClient = MongoClients.create("mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/");
        database = mongoClient.getDatabase("AcademyGradeRegister");      
    }
    public MongoCollection<Document> getCollection(String collectionName){
        return database.getCollection(collectionName);
    }
    public void closeConnection(){
        mongoClient.close();
    }   
}
