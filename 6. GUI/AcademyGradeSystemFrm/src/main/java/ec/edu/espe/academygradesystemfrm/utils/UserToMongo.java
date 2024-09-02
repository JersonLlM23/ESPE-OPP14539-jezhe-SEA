/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.academygradesystemfrm.model.CreateUser;
import org.bson.Document;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */

public class UserToMongo {
    public static void uploadUserData(CreateUser user){
        MongoDatabase database = MongoDBConnectionManager.getInstance().getDatabase();
        saveUserToDatabase(user, database);
    }
     private static void saveUserToDatabase(CreateUser user, MongoDatabase database){
        MongoCollection<Document> collection = database.getCollection("users");
        Document professorsDocument = new Document("id", user.getId())
                .append("Nombre de usuario", user.getUsername())
                .append("Contraseña", encryptPassword(user.getPassword()));
                
        try{
            collection.insertOne(professorsDocument);
            System.out.println("Usuario guardado exitosamente!!");
        }catch(MongoException e){
            e.printStackTrace();
        }
        
    }
    private static String encryptPassword(String password) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : password.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    } 
}
