/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class GradeToMongo {
    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/";
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                .build();
        return MongoClients.create(settings);
    }

    public static void uploadGradeData(String studentId, String materia, double primerParcial, double segundoParcial, double tercerParcial, double promedio, String estado) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("AcademyGradeRegister");
            MongoCollection<Document> collection = database.getCollection("grades");

            Document gradeDocument = new Document("studentId", studentId)
                .append("materia", materia)
                .append("primerParcial", primerParcial)
                .append("segundoParcial", segundoParcial)
                .append("tercerParcial", tercerParcial)
                .append("promedio", promedio)
                .append("estado", estado);

            collection.insertOne(gradeDocument);
            System.out.println("Calificaciones guardadas exitosamente en la colección 'grades'.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
