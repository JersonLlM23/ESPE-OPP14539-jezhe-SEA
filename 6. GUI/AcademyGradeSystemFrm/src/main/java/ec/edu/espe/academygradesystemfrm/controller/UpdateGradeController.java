/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.academygradesystemfrm.utils.UpdateGradeToMongo;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author IAEN
 */
public class UpdateGradeController {
    private MongoDatabase database;
    
    public UpdateGradeController(UpdateGradeToMongo connection){
        this.database = connection.getDatabase();
    }
    
    public void updateStudentId(int id, String name, String deparment){
        MongoCollection<Document> collection = database.getCollection("grades");
        
        Bson filter = Filters.eq("studentId",id);
        Bson updates = Updates.combine(
                Updates.set("materia", name), 
                Updates.set("primerParcial", deparment),
                Updates.set("segundoParcial", name), 
                Updates.set("tercerParcial", deparment),
                Updates.set("promedio", name), 
                Updates.set("estado", deparment));
        collection.updateOne(filter,updates);        
    }
}
