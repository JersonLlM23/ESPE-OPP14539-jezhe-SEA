/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.academygradesystemfrm.utils.UpdateStudentToMongo;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author WINDOWS
 */
public class UpdateStudentController {
    private MongoDatabase database;
    
    public UpdateStudentController(UpdateStudentToMongo connection){
        this.database = connection.getDatabase();
        
    }
    
    public void updataStudentId(int id, String name, String degree, String age){
        MongoCollection<Document> collection = database.getCollection("students");
        Bson filter = Filters.eq("id", id);
        Bson updates = Updates.combine(
                Updates.set("nombre", name),
                Updates.set("grado", degree),
                Updates.set("edad", age));
        collection.updateOne(filter, updates);
    }
}
