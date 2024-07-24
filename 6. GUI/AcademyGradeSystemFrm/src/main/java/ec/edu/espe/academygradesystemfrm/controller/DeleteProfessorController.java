package ec.edu.espe.academygradesystemfrm.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import ec.edu.espe.academygradesystemfrm.utils.DeleteProfessorToMongo;
import org.bson.Document;

/**
 *
 * @author WINDOWS
 */
public class DeleteProfessorController {
    private DeleteProfessorToMongo mongoDBConnection;
    
    public DeleteProfessorController(){
        mongoDBConnection = new DeleteProfessorToMongo();
        
    }
    
    public void deleteProfessor(int id){
        MongoCollection<Document> collection = mongoDBConnection.getCollection("professors");
        collection.deleteOne(Filters.eq("id", id));
        System.out.println("El profesor con " + id + " ha sido eliminado. ");
        mongoDBConnection.closeConnection();
    }
    
}