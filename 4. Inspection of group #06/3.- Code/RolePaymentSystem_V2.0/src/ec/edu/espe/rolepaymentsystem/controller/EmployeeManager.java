/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import ec.edu.espe.rolepaymentsystem.model.Employee;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Code Masters
 */
public class EmployeeManager {
    private static final String employeesFile = "employees.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private List<Employee> employees;

    public EmployeeManager() {
        employees = loadEmployees();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        saveEmployees();
    }

    public void updateEmployee(int index, Employee employee) {
        employees.set(index, employee);
        saveEmployees();
    }

    public void removeEmployee(int index) {
        employees.remove(index);
        saveEmployees();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    private List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (FileReader fileReader = new FileReader(employeesFile)) {
            JsonArray jsonArray = JsonParser.parseReader(fileReader).getAsJsonArray();
            for (int i = 0; i < jsonArray.size(); i++) {
                Employee employee = GSON.fromJson(jsonArray.get(i), Employee.class);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los empleados.");
        }
        return employees;
    }

    private void saveEmployees() {
        JsonArray jsonArray = new JsonArray();
        for (Employee employee : employees) {
            jsonArray.add(GSON.toJsonTree(employee));
        }

        try (FileWriter fileWriter = new FileWriter(employeesFile)) {
            GSON.toJson(jsonArray, fileWriter);
        } catch (IOException e) {
            System.out.println("Error al guardar los empleados.");
        }
    }
}