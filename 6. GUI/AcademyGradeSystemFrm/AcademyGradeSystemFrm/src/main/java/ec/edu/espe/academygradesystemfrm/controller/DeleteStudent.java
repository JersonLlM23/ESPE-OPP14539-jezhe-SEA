/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import ec.edu.espe.academygradesystemfrm.utils.DeleteStudentToMongo;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class DeleteStudent {
    private DeleteStudentToMongo mongoDBConnection;

    public DeleteStudent(){
        mongoDBConnection = new DeleteStudentToMongo();
    }
    public void deleteStudent(int id){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("students");
        collection.deleteOne(Filters.eq("id", id));
        System.out.println("estudiante con " + id + "ha sido eliminado");
        mongoDBConnection.closeConnection();
    }
    
}
