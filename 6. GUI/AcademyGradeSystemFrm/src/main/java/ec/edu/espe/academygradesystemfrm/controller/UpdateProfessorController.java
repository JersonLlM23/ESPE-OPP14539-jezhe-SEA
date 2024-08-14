/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.academygradesystemfrm.utils.UpdateProfessorToMongo;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */
public class UpdateProfessorController {
    private MongoDatabase database;
    
    public UpdateProfessorController(UpdateProfessorToMongo connection){
        this.database = connection.getDatabase();
    }
    
    public void updateProfessorId(int id, String name, String deparment){
        MongoCollection<Document> collection = database.getCollection("professors");
        
        Bson filter = Filters.eq("id",id);
        Bson updates = Updates.combine(
                Updates.set("Nombre", name), 
                Updates.set("Departamento", deparment));
        collection.updateOne(filter,updates);
        
    }
    
}
