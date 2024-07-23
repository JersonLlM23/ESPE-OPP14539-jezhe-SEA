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
    private MongoDatabase database;
    private MongoClient mongoClient;
    private static MongoClient createMongoClient() {
    String connectionString = "mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/";
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
        return MongoClients.create(settings);
    }
     public static void uploadUserData(CreateUser user){
        try(MongoClient mongoClient = createMongoClient()){
            MongoDatabase database = mongoClient.getDatabase("AcademyGradeRegister");
            
            saveUserToDatabase(user, database);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private static void saveUserToDatabase(CreateUser user, MongoDatabase database){
        MongoCollection<Document> collection = database.getCollection("users");
        Document professorsDocument = new Document("id", user.getId())
                .append("Nombre de usuario", user.getUsername())
                .append("Contraseña", user.getPassword());
                
        try{
            collection.insertOne(professorsDocument);
            System.out.println("Usuario guardado exitosamente!!");
        }catch(MongoException e){
            e.printStackTrace();
        }
        
    }
        public MongoCollection<Document> getCollection(String collectionName){
        return database.getCollection(collectionName);
    }
    
    public void closeConnection(){
        mongoClient.close();
    }
}
