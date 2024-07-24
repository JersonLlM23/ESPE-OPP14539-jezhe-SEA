/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.academygradesystemfrm.model.CreateUser;
import ec.edu.espe.academygradesystemfrm.utils.UserToMongo;
import org.bson.Document;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class CreateUserController {
      private UserToMongo mongoDBConnection;
    
    public CreateUserController(){
        mongoDBConnection = new UserToMongo();
    }
    
    public void insertUser(CreateUser user){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("users");
        try{
            collection.insertOne(user.toDocument());
            mongoDBConnection.closeConnection();
        }catch(MongoException e){
            e.printStackTrace();
        }
        
    }  
}
