/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygraderegister.view;

import ec.edu.espe.academygraderegister.model.StudentName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class AcademyGradeRegister {
     public static void main(String[] args) {
          System.out.println("Bienvenido al Sistema de Registro de Notas Versión 0.0.2");
          
          Scanner scanner = new Scanner(System.in);
          
           for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el ID del Estudiante. " + (i + 1) + ":");
            System.out.println("ID: ");
            int id = scanner.nextInt();
           
            scanner.nextLine(); 
            
            System.out.println("Ingrese el primer nombre del estudiante: ");
            String firstname = scanner.nextLine();
            
            System.out.println("Ingrese el segundo nombre del estudiante: ");
            String middlename = scanner.nextLine();
            
            System.out.println("Ingrese el primer apellido del estudiante: ");
            String surname = scanner.nextLine();
            
            System.out.println("Ingrese el segundo apellido del estudiante: ");
            String middleSurname = scanner.nextLine();
            /* En el futuro, se plenea agregar un catch and try para evitar errores en ID*/
            StudentName studentname = new StudentName(id, firstname, middlename, surname, middleSurname);
            System.out.println(studentname);
            System.out.println ("Los Estudiantes han sido registrados correctamente."); 

                } 

            }
     }
