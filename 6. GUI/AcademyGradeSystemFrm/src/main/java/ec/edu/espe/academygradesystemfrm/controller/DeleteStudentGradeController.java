/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClient;
import org.bson.Document;
import com.mongodb.client.model.Filters;
import ec.edu.espe.academygradesystemfrm.utils.DeleteGradeToMongo;

public class DeleteStudentGradeController {
    private DeleteGradeToMongo mongoDBConnection;

    public DeleteStudentGradeController(){
        mongoDBConnection = new DeleteGradeToMongo();
    }

    public void deleteGrade(String id){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("grades");
        collection.deleteOne(Filters.eq("studentId", id)); // Usar el ID como cadena
        System.out.println("Las notas del estudiante con ID " + id + " han sido eliminadas.");
        mongoDBConnection.closeConnection();
    }
}
