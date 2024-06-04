/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import ec.edu.espe.AcademyGradeRegister.model.Student;

public class StudentInfoManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la información del estudiante:");

        System.out.print("ID del estudiante: ");
        String studentID = scanner.nextLine();

        System.out.print("Nombre del estudiante: ");
        String firstName = scanner.nextLine();

        System.out.print("Apellido del estudiante: ");
        String lastName = scanner.nextLine();

        System.out.print("Correo electrónico del estudiante: ");
        String email = scanner.nextLine();
        
        System.out.print("Fecha de nacimiento del estudiante: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Dirección del estudiante: ");
        String address = scanner.nextLine();

        System.out.print("Curso del estudiante: ");
        String course = scanner.nextLine();

        Map<String, Double> grades = new HashMap<>();
        while (true) {
            System.out.print("Ingrese la asignatura (o 'fin' para terminar): ");
            String subject = scanner.nextLine();
            if (subject.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Ingrese la nota para " + subject + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades.put(subject, grade);
        }

        System.out.print("Promedio del estudiante: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        Student student = new Student(studentID, firstName, lastName, email, course, grades, gpa, dateOfBirth, address);

        // Convertir el objeto Student a JSON
        Gson gson = new Gson();
        String json = gson.toJson(student);

        // Guardar el JSON en un archivo
        try (FileWriter writer = new FileWriter("student_info.json")) {
            writer.write(json);
            System.out.println("Información del estudiante guardada exitosamente en student_info.json");
        } catch (IOException e) {
            System.err.println("Error al guardar la información del estudiante: " + e.getMessage());
        }

        scanner.close();
    }
}

