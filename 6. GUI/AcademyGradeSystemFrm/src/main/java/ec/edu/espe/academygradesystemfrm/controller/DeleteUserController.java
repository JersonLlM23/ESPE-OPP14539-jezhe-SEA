/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import ec.edu.espe.academygradesystemfrm.utils.DeleteUserToMongo;
import org.bson.Document;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class DeleteUserController {
    private DeleteUserToMongo mongoDBConnection;
    
    public DeleteUserController(){
        mongoDBConnection = new DeleteUserToMongo();
        
    }
    
    public void deleteProfessor(int id){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("users");
        collection.deleteOne(Filters.eq("id", id));
        System.out.println("El usuario con " + id + " ha sido eliminado. ");
        mongoDBConnection.closeConnection();
    }
        
}
