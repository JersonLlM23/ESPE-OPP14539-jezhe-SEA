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
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author heiso
 */
public class MongoDBConnectionManager {
    private static MongoDBConnectionManager instance;
    private MongoClient mongoClient;
    private MongoDatabase database;

    private MongoDBConnectionManager() {
        String connectionString = "mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/";
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("AcademyGradeRegister");
    }

    public static synchronized MongoDBConnectionManager getInstance() {
        if (instance == null) {
            instance = new MongoDBConnectionManager();
        }
        return instance;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void closeConnection() {
        mongoClient.close();
    }
}
