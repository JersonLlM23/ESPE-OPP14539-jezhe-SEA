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
import ec.edu.espe.academygradesystemfrm.model.CreateStudent;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class StudentToMongo {
    private static MongoClient createMongoClient() {
    String connectionString = "mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/";
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();
        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
     
        return MongoClients.create(settings);
    }
    
    public static void uploadSudentData(CreateStudent student){
        try(MongoClient mongoClient = createMongoClient()){
            MongoDatabase database = mongoClient.getDatabase("AcademyGradeRegister");
            
            saveStudentToDatabase(student, database);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private static void saveStudentToDatabase(CreateStudent student, MongoDatabase database){
        MongoCollection<Document> collection = database.getCollection("students");
        Document studentDocument = new Document("id", student.getId())
                .append("nombre", student.getName())
                .append("grado", student.getDegree())
                .append("edad", student.getAge());
                
        try{
            collection.insertOne(studentDocument);
            System.out.println("student guardado exitosamente!!");
        }catch(MongoException e){
            e.printStackTrace();
        }
        
    }
    
}
