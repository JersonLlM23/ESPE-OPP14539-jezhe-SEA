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
 * @author WINDOWS
 */
public class ProfessorToMongo {
    private MongoDatabase database;
    private MongoClient mongoClient;
    
    public ProfessorToMongo(){
        mongoClient = MongoClients.create("mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/");
        database = mongoClient.getDatabase("AcademyGradeRegister");
        
    }
    
    public MongoCollection<Document> getCollection(String collectionName){
        return database.getCollection(collectionName);
    }
    
    public void closeConnection(){
        mongoClient.close();
    }
    
}
