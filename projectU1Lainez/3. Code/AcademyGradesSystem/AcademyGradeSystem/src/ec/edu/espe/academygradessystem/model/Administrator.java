/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class Administrator {
    private String id;
    private String name;

    public Administrator(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void generateReport(Student student) {
        System.out.println("Generating report for Student ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
        System.out.println("Grades: " + student.getGrades());

        double gpa = calculateGPA(student.getGrades());
        System.out.println("GPA: " + gpa);
    }

    private double calculateGPA(List<Double> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    public String evaluateStudent(Student student) {
        double gpa = calculateGPA(student.getGrades());
        if (gpa < 7) {
            return "The student is at risk of failing.";
        } else if (gpa == 7) {
            return "The student needs reinforcement.";
        } else {
            return "The student has passed.";
        }
    }
    
    public void saveData(Object object, String fileName) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(object, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> T loadData(String fileName, Type type) {
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // CRUD methods for Student
    public void createStudent(List<Student> students, Student student) {
        students.add(student);
    }

    public Student readStudent(List<Student> students, String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(List<Student> students, String studentId, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(studentId)) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    public void deleteStudent(List<Student> students, String studentId) {
        students.removeIf(student -> student.getId().equals(studentId));
    }

    // CRUD methods for Professor
    public void createProfessor(List<Professor> professors, Professor professor) {
        professors.add(professor);
    }

    public Professor readProfessor(List<Professor> professors, String professorId) {
        for (Professor professor : professors) {
            if (professor.getId().equals(professorId)) {
                return professor;
            }
        }
        return null;
    }

    public void updateProfessor(List<Professor> professors, String professorId, Professor updatedProfessor) {
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId().equals(professorId)) {
                professors.set(i, updatedProfessor);
                break;
            }
        }
    }

    public void deleteProfessor(List<Professor> professors, String professorId) {
        professors.removeIf(professor -> professor.getId().equals(professorId));
    }

    // CRUD methods for Grades
    public void createGrade(Student student, double grade) {
        student.addGrade(grade);
    }

    public void readGrade(Student student) {
        List<Double> grades = student.getGrades();
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades.get(i));
        }
    }

    public void updateGrade(Student student, int index, double grade) {
        student.updateGrade(index, grade);
    }

    public void deleteGrade(Student student, int index) {
        student.deleteGrade(index);
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Administrator{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
}
