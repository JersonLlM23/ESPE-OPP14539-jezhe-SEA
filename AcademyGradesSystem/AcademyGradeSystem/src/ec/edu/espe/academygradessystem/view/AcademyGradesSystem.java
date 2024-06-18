/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.academygradessystem.model.*;
/**
 *
 * @author JEZHE Software Sssosiation Engineers - DCCO ESPE
 */

public class AcademyGradesSystem {

    private static final String STUDENT_FILE = "students.json";
    private static final String PROFESSOR_FILE = "professors.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrator admin = new Administrator("A001", "Mr. Admin");

        // Ensure JSON files exist or create them if they don't
        ensureFileExists(STUDENT_FILE);
        ensureFileExists(PROFESSOR_FILE);

        List<Student> students = admin.loadData(STUDENT_FILE, new TypeToken<List<Student>>() {}.getType());
        List<Professor> professors = admin.loadData(PROFESSOR_FILE, new TypeToken<List<Professor>>() {}.getType());

        if (students == null) students = new ArrayList<>();
        if (professors == null) professors = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Create Professor");
            System.out.println("6. Read Professor");
            System.out.println("7. Update Professor");
            System.out.println("8. Delete Professor");
            System.out.println("9. Add Grade to Student");
            System.out.println("10. Read Student Grades");
            System.out.println("11. Update Student Grade");
            System.out.println("12. Delete Student Grade");
            System.out.println("13. Generate Student Report");
            System.out.println("14. Evaluate Student");
            System.out.println("15. Save and Exit\n");
            System.out.print("ingrese su opcion: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter Student Name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter Student Age:");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student Major (e.g., Engineering, Biology):");
                    String studentMajor = scanner.nextLine();
                    Student student = new Student(studentId, studentName, studentAge, studentMajor);
                    admin.createStudent(students, student);
                    break;

                case 2:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        System.out.println("Student Info: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        System.out.println("Enter new Student Name:");
                        String updateStudentName = scanner.nextLine();
                        System.out.println("Enter new Student Age:");
                        int UpdateStudentAge = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter new Student Major:");
                        String UpdateStudentMajor = scanner.nextLine();
                        student.setName(updateStudentName);
                        student.setAge(UpdateStudentAge);
                        student.setMajor(UpdateStudentMajor);
                        admin.updateStudent(students, studentId, student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    admin.deleteStudent(students, studentId);
                    break;

                case 5:
                    System.out.println("Enter Professor ID:");
                    String professorId = scanner.nextLine();
                    System.out.println("Enter Professor Name:");
                    String professorName = scanner.nextLine();
                    System.out.println("Enter Professor Department:");
                    String professorDept = scanner.nextLine();
                    Professor professor = new Professor(professorId, professorName, professorDept);
                    admin.createProfessor(professors, professor);
                    break;

                case 6:
                    System.out.println("Enter Professor ID:");
                    professorId = scanner.nextLine();
                    professor = admin.readProfessor(professors, professorId);
                    if (professor != null) {
                        System.out.println("Professor Info: " + professor);
                    } else {
                        System.out.println("Professor not found.");
                    }
                    break;

                case 7:
                    System.out.println("Enter Professor ID:");
                    professorId = scanner.nextLine();
                    professor = admin.readProfessor(professors, professorId);
                    if (professor != null) {
                        System.out.println("Enter new Professor Name:");
                        String newprofessorName = scanner.nextLine();
                        System.out.println("Enter new Professor Department:");
                        String newprofessorDept = scanner.nextLine();
                        professor.setName(newprofessorName);
                        professor.setDepartment(newprofessorDept);
                        admin.updateProfessor(professors, professorId, professor);
                    } else {
                        System.out.println("Professor not found.");
                    }
                    break;

                case 8:
                    System.out.println("Enter Professor ID:");
                    professorId = scanner.nextLine();
                    admin.deleteProfessor(professors, professorId);
                    break;

                case 9:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        System.out.println("Enter Grade:");
                        double grade = scanner.nextDouble();
                        scanner.nextLine();
                        admin.createGrade(student, grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 10:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        admin.readGrade(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 11:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        System.out.println("Enter Grade Index:");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter new Grade:");
                        double grade = scanner.nextDouble();
                        scanner.nextLine();
                        admin.updateGrade(student, index, grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 12:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        System.out.println("Enter Grade Index:");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        admin.deleteGrade(student, index);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 13:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        admin.generateReport(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 14:
                    System.out.println("Enter Student ID:");
                    studentId = scanner.nextLine();
                    student = admin.readStudent(students, studentId);
                    if (student != null) {
                        String evaluation = admin.evaluateStudent(student);
                        System.out.println("Evaluation: " + evaluation);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 15:
                    admin.saveData(students, STUDENT_FILE);
                    admin.saveData(professors, PROFESSOR_FILE);
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void ensureFileExists(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + fileName);
            e.printStackTrace();
        }
    }
}
