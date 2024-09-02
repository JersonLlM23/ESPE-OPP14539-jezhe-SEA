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
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */
public class UpdateStudentToMongo {

    public UpdateStudentToMongo(String studentId, String newData){
        MongoDatabase database = MongoDBConnectionManager.getInstance().getDatabase();
        MongoCollection<Document> collection = database.getCollection("students");
    }
    
    Document query = new Document("id", studentId);
        Document updateOperation = new Document("$set", updatedData);

        try {
            collection.updateOne(query, updateOperation);
            System.out.println("Estudiante actualizado exitosamente!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
