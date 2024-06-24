/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.model;
import ec.edu.espe.rolepaymentsystem.utils.Calculator;
/**
 *
 * @author Code Masters
 */
public class Income {
    private double basicSalary;
    private OvertimeHours overtimeHours;
    private double bonuses;
    private double totalIncome;
    
   public Income(Employee employee) {
        this.basicSalary = employee.getBasicSalary();
        this.overtimeHours = new OvertimeHours(employee.getOvertimeHours(), Calculator.calculateOvertimeHours(employee.getOvertimeHours(), Constants.regularHoursPerMonth, basicSalary / Constants.regularHoursPerMonth));
        this.bonuses = employee.getBonuses();
        this.totalIncome = calculateTotalIncome();
    }


    private double calculateTotalIncome() {
        double totalIncome = basicSalary + overtimeHours.getValue() + bonuses;
        return totalIncome;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public OvertimeHours getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(OvertimeHours overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public double getTotalIncome() {
        return calculateTotalIncome();
    }
}
