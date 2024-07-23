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
import ec.edu.espe.academygradesystemfrm.model.CreateProfessor;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class ProfessorToMongo {
    private MongoDatabase database;
    private MongoClient mongoClient;
    private static MongoClient createMongoClient() {
    String connectionString = "mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/";
        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();        
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
        return MongoClients.create(settings);
    }
     public static void uploadProfessorData(CreateProfessor professor){
        try(MongoClient mongoClient = createMongoClient()){
            MongoDatabase database = mongoClient.getDatabase("AcademyGradeRegister");
            
            saveProfessorToDatabase(professor, database);
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private static void saveProfessorToDatabase(CreateProfessor professor, MongoDatabase database){
        MongoCollection<Document> collection = database.getCollection("professors");
        Document professorsDocument = new Document("id", professor.getId())
                .append("Nombre", professor.getName())
                .append("Departamento", professor.getDeparment());
                
        try{
            collection.insertOne(professorsDocument);
            System.out.println("student guardado exitosamente!!");
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
