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
public class Expenses {
    private double iessContribution;
    private double biweeklyAdvance;
    private double iessLoans;
    private double companyLoans;
    private double fines;
    private double foodDeduction;
    private double totalExpenses;
    
    public Expenses(Employee employee, double totalIncome) {
        double reserveFunds = Calculator.calculateReserveFunds(employee.getBasicSalary());
        this.iessContribution = Calculator.calculateIessContribution(totalIncome, reserveFunds);
        this.biweeklyAdvance = Calculator.calculateBiweeklyAdvance(employee.getBasicSalary());
        this.iessLoans = employee.getIessLoans();
        this.companyLoans = employee.getCompanyLoans();
        this.fines = employee.getFines();
        this.foodDeduction = Calculator.calculateFoodDeduction(employee.isBringOwnFood(), 0); // Valor de la deducción por comida se solicita al usuario
        this.totalExpenses = calculateTotalExpenses();
    }


    private double calculateTotalExpenses() {
        double totalExpenses = iessContribution + biweeklyAdvance + iessLoans + companyLoans + fines + foodDeduction;
        return totalExpenses;
    }

    public double getIessContribution() {
        return iessContribution;
    }

    public void setIessContribution(double iessContribution) {
        this.iessContribution = iessContribution;
    }

    public double getBiweeklyAdvance() {
        return biweeklyAdvance;
    }

    public void setBiweeklyAdvance(double biweeklyAdvance) {
        this.biweeklyAdvance = biweeklyAdvance;
    }

    public double getIessLoans() {
        return iessLoans;
    }

    public void setIessLoans(double iessLoans) {
        this.iessLoans = iessLoans;
    }

    public double getCompanyLoans() {
        return companyLoans;
    }

    public void setCompanyLoans(double companyLoans) {
        this.companyLoans = companyLoans;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getFoodDeduction() {
        return foodDeduction;
    }

    public void setFoodDeduction(double foodDeduction) {
        this.foodDeduction = foodDeduction;
    }

    public double getTotalExpenses() {
        return calculateTotalExpenses();
    }
}
