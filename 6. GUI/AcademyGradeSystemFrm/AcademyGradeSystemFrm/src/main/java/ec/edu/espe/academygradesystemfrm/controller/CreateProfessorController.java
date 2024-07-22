/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.academygradesystemfrm.model.CreateProfessor;
import ec.edu.espe.academygradesystemfrm.utils.ProfessorToMongo;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class CreateProfessorController {
    private ProfessorToMongo mongoDBConnection;
    
    public CreateProfessorController(){
        mongoDBConnection = new ProfessorToMongo();
    }
    
    public void insertProfessor(CreateProfessor professor){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("professors");
        try{
            collection.insertOne(professor.toDocument());
            mongoDBConnection.closeConnection();
        }catch(MongoException e){
            e.printStackTrace();
        }
        
    }
}
