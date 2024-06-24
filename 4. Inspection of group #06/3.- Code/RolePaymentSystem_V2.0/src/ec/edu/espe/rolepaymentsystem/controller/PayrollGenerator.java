/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import ec.edu.espe.rolepaymentsystem.model.Employee;
import ec.edu.espe.rolepaymentsystem.model.GeneralPayroll;
import ec.edu.espe.rolepaymentsystem.model.IndividualPayroll;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Code Masters
 */
public class PayrollGenerator {
    private static final String payrollsFile = "payrolls.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public void generatePayrolls(List<Employee> employees) {
        JsonArray individualPayrollsJson = new JsonArray();
        JsonArray generalPayrollsJson = new JsonArray();

        System.out.println("Roles de Pago:");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s%n", "Nombre", "Apellido", "Salario Básico", "Ingresos Totales", "Gastos Totales", "Pago Neto");
        System.out.println("---------------------------------------------------------------------------------");

        for (Employee employee : employees) {
            IndividualPayroll individualPayroll = generateIndividualPayroll(employee, new Date(), new Date());
            individualPayrollsJson.add(GSON.toJsonTree(individualPayroll));

            List<Employee> singleEmployeeList = new ArrayList<>();
            singleEmployeeList.add(employee);
            List<GeneralPayroll> generalPayrollList = generateGeneralPayrolls(singleEmployeeList);
            if (!generalPayrollList.isEmpty()) {
                GeneralPayroll generalPayroll = generalPayrollList.get(0);
                generalPayrollsJson.add(GSON.toJsonTree(generalPayroll));
            }

            String nombre = employee.getName();
            String apellido = employee.getLastName();
            double salarioBasico = employee.getBasicSalary();
            double ingresosTotales = individualPayroll.getTotalIncome();
            double gastosTotales = individualPayroll.getTotalExpenses();
            double pagoNeto = individualPayroll.getTotalToPay();

            System.out.printf("%-20s %-20s %-20.2f %-20.2f %-20.2f %-20.2f%n", nombre, apellido, salarioBasico, ingresosTotales, gastosTotales, pagoNeto);
        }

        JsonObject payrollsJson = new JsonObject();
        payrollsJson.add("individualPayrolls", individualPayrollsJson);
        payrollsJson.add("generalPayrolls", generalPayrollsJson);

        savePayrollsToFile(payrollsJson);
    }

    private IndividualPayroll generateIndividualPayroll(Employee employee, Date startDate, Date endDate) {
        double basicSalary = employee.getBasicSalary();
        double overtimeHoursValue = employee.getOvertimeHours() * 1.5 * (basicSalary / 240);
        double bonuses = employee.getBonuses();
        double iessContribution = basicSalary * 0.0935;
        double biweeklyAdvance = basicSalary / 2;
        double iessLoans = employee.getIessLoans();
        double companyLoans = employee.getCompanyLoans();
        double fines = employee.getFines();
        double foodDeduction = employee.isBringOwnFood() ? 0 : 25;

        double totalIncome = basicSalary + overtimeHoursValue + bonuses;
        double totalExpenses = iessContribution + biweeklyAdvance + iessLoans + companyLoans + fines + foodDeduction;
        double netPayment = totalIncome - totalExpenses;

        return new IndividualPayroll(employee, startDate, endDate, totalIncome, totalExpenses, netPayment);
    }

    private List<GeneralPayroll> generateGeneralPayrolls(List<Employee> employees) {
        List<GeneralPayroll> generalPayrollList = new ArrayList<>();

        for (Employee employee : employees) {
            String name = employee.getName();
            String lastName = employee.getLastName();
            double hoursWorked = 0; 
            double daysWorked = 0; 
            double salary = employee.getBasicSalary();
            double reserveFunds = 0; 
            double bonuses = employee.getBonuses();
            double overtimeHours = employee.getOvertimeHours();

            GeneralPayroll generalPayroll = new GeneralPayroll(name, lastName, hoursWorked, daysWorked, salary, reserveFunds, bonuses, overtimeHours);
            generalPayrollList.add(generalPayroll);
        }

        return generalPayrollList;
    }

    private void savePayrollsToFile(JsonObject payrollsJson) {
        try (FileWriter fileWriter = new FileWriter(payrollsFile)) {
            GSON.toJson(payrollsJson, fileWriter);
        } catch (IOException e) {
            System.out.println("Error al guardar los roles de pago.");
        }
    }
}
