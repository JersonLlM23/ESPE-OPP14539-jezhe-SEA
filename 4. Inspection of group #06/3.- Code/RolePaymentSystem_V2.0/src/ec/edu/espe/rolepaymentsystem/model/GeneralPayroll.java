/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.model;

/**
 *
 * @author Code Masters
 */
public class GeneralPayroll {
    private String name;
    private String lastName;
    private double hoursWorked;
    private double daysWorked;
    private double salary;
    private double reserveFunds;
    private double bonuses;
    private double overtimeHours;
    private double overtimePayment;
    private double nightShiftSurcharge;
    private double totalIncome;
    private double iessContribution;
    private double iessLoans;
    private double fines;
    private double biweeklyAdvance;
    private double foodDeduction;
    private double salaryAdvances;
    private double totalExpenses;
    private double netPayment;
    private double employerContribution;
    private double totalEmployeeCost;
    private String observations;

    public GeneralPayroll(String name, String lastName, double hoursWorked, double daysWorked, double salary, double reserveFunds, double bonuses, double overtimeHours) {
        this.name = name;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.daysWorked = daysWorked;
        this.salary = salary;
        this.reserveFunds = reserveFunds;
        this.bonuses = bonuses;
        this.overtimeHours = overtimeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(double daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getReserveFunds() {
        return reserveFunds;
    }

    public void setReserveFunds(double reserveFunds) {
        this.reserveFunds = reserveFunds;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimePayment() {
        return overtimePayment;
    }

    public void setOvertimePayment(double overtimePayment) {
        this.overtimePayment = overtimePayment;
    }

    public double getNightShiftSurcharge() {
        return nightShiftSurcharge;
    }

    public void setNightShiftSurcharge(double nightShiftSurcharge) {
        this.nightShiftSurcharge = nightShiftSurcharge;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getIessContribution() {
        return iessContribution;
    }
    
    public void setIessContribution(double iessContribution) {
    this.iessContribution = iessContribution;
    }
    
    public double getIessLoans() {
    return iessLoans;
    }

    public void setIessLoans(double iessLoans) {
        this.iessLoans = iessLoans;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getBiweeklyAdvance() {
        return biweeklyAdvance;
    }

    public void setBiweeklyAdvance(double biweeklyAdvance) {
        this.biweeklyAdvance = biweeklyAdvance;
    }

    public double getFoodDeduction() {
        return foodDeduction;
    }

    public void setFoodDeduction(double foodDeduction) {
        this.foodDeduction = foodDeduction;
    }

    public double getSalaryAdvances() {
        return salaryAdvances;
    }

    public void setSalaryAdvances(double salaryAdvances) {
        this.salaryAdvances = salaryAdvances;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(double netPayment) {
        this.netPayment = netPayment;
    }

    public double getEmployerContribution() {
        return employerContribution;
    }

    public void setEmployerContribution(double employerContribution) {
        this.employerContribution = employerContribution;
    }

    public double getTotalEmployeeCost() {
        return totalEmployeeCost;
    }

    public void setTotalEmployeeCost(double totalEmployeeCost) {
        this.totalEmployeeCost = totalEmployeeCost;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
