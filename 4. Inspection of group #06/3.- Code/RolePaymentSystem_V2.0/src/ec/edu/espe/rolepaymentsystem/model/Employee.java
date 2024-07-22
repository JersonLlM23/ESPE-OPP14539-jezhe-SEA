/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.model;

import java.util.Date;

/**
 *
 * @author Code Masters
 */
public class Employee {
    
    private String name;
    private String lastName;
    private String idNumber;
    private Date hireDate;
    private double basicSalary;
    private double overtimeHours;
    private double absentDays;
    private double bonuses;
    private double iessLoans;
    private double companyLoans;
    private double fines;
    private boolean bringOwnFood;

    public Employee(String name, String lastName, String idNumber, Date hireDate, double basicSalary, double overtimeHours, double absentDays, double bonuses, double iessLoans, double companyLoans, double fines, boolean bringOwnFood) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.hireDate = hireDate;
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
        this.absentDays = absentDays;
        this.bonuses = bonuses;
        this.iessLoans = iessLoans;
        this.companyLoans = companyLoans;
        this.fines = fines;
        this.bringOwnFood = bringOwnFood;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the overtimeHours
     */
    public double getOvertimeHours() {
        return overtimeHours;
    }

    /**
     * @param overtimeHours the overtimeHours to set
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    /**
     * @return the absentDays
     */
    public double getAbsentDays() {
        return absentDays;
    }

    /**
     * @param absentDays the absentDays to set
     */
    public void setAbsentDays(double absentDays) {
        this.absentDays = absentDays;
    }

    /**
     * @return the bonuses
     */
    public double getBonuses() {
        return bonuses;
    }

    /**
     * @param bonuses the bonuses to set
     */
    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    /**
     * @return the iessLoans
     */
    public double getIessLoans() {
        return iessLoans;
    }

    /**
     * @param iessLoans the iessLoans to set
     */
    public void setIessLoans(double iessLoans) {
        this.iessLoans = iessLoans;
    }

    /**
     * @return the companyLoans
     */
    public double getCompanyLoans() {
        return companyLoans;
    }

    /**
     * @param companyLoans the companyLoans to set
     */
    public void setCompanyLoans(double companyLoans) {
        this.companyLoans = companyLoans;
    }

    /**
     * @return the fines
     */
    public double getFines() {
        return fines;
    }

    /**
     * @param fines the fines to set
     */
    public void setFines(double fines) {
        this.fines = fines;
    }

    /**
     * @return the bringOwnFood
     */
    public boolean isBringOwnFood() {
        return bringOwnFood;
    }

    /**
     * @param bringOwnFood the bringOwnFood to set
     */
    public void setBringOwnFood(boolean bringOwnFood) {
        this.bringOwnFood = bringOwnFood;
    }

    
}
