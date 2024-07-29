/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.view;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class FrmGenerateStudentReport extends javax.swing.JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public FrmGenerateStudentReport() {
    initComponents();
    initializeTable();
    loadStudentReport();
}

private void initializeTable() {
    tableModel = new DefaultTableModel(
        new Object [][] {},
        new String [] {
            "ID estudiante", "Nombre","Materia", "Promedio Final", "Estado"
        }
    );
    table = new JTable(tableModel);
    jScrollPane1.setViewportView(table);
}


private void loadStudentReport() {
    MongoClient mongoClient = createMongoClient();
    MongoDatabase database = mongoClient.getDatabase("AcademyGradeRegister");

    MongoCollection<Document> gradesCollection = database.getCollection("grades");
    MongoCollection<Document> studentsCollection = database.getCollection("students");

    List<Document> grades = gradesCollection.find().into(new ArrayList<>());

    // Clear the table before loading new data
    tableModel.setRowCount(0);

    for (Document grade : grades) {
        String studentId = grade.getString("studentId");
        String materia = grade.getString("materia");
       
        Double promedio = grade.getDouble("promedio");
        String estado = grade.getString("estado");

        // Convert studentId to integer if necessary
        int studentIdInt = Integer.parseInt(studentId);
        System.out.println("Buscando estudiante con ID: " + studentIdInt);

        // Find the corresponding student document using "id"
        Document student = studentsCollection.find(Filters.eq("id", studentIdInt)).first();
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student.getString("nombre"));
        } else {
            System.out.println("No se encontró estudiante con ID: " + studentIdInt);
        }
        String studentName = student != null ? student.getString("nombre") : "N/A";

        // Add row to table model
        tableModel.addRow(new Object[]{studentId, studentName, materia, promedio, estado});
    }

    mongoClient.close();
}


    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://jezhe:jezheoop@cluster0.6vuzzwl.mongodb.net/";
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                .build();
        return MongoClients.create(settings);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar al menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID ", "Nombre ", "Materia", "Promedio Final", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmAcademyGradeRegister frmAcademyGradeRegister = new FrmAcademyGradeRegister();
        this.setVisible(false);
        frmAcademyGradeRegister.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

  public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new FrmGenerateStudentReport().setVisible(true);
        });
    }
}