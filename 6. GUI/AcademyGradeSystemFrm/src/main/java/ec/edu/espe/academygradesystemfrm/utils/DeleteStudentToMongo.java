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
public class DeleteStudentToMongo {
    private MongoDatabase database;
    private MongoClient mongoClient;
    
    public DeleteStudentToMongo(){
        mongoClient = MongoClients.create("mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/");
        database = mongoClient.getDatabase("AcademyGradeRegister");      
    }
    public MongoCollection<Document> getCollection(String collectionName){
        return database.getCollection(collectionName);
    }
    public void closeConnection(){
        mongoClient.close();
    }
}
