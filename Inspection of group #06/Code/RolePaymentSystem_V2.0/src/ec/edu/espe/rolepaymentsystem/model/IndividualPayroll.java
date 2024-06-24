/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Code Masters
 */
public class IndividualPayroll {
    private Employee employee;
    private Date startMonthDate;
    private Date endMonthDate;
    private Income income;
    private Expenses expenses;
    private double totalIncome;
    private double totalExpenses;
    private double totalToPay;

     public IndividualPayroll(Employee employee, Date startMonthDate, Date endMonthDate, double totalIncome, double totalExpenses, double totalToPay) {
        this.employee = employee;
        this.startMonthDate = getStartMonthDate();
        this.endMonthDate = getEndMonthDate();
        this.income = new Income(employee);
        this.expenses = new Expenses(employee, income.getTotalIncome());
        this.totalIncome = income.getTotalIncome();
        this.totalExpenses = expenses.getTotalExpenses();
        this.totalToPay = totalIncome - totalExpenses;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setStartMonthDate(Date startMonthDate) {
        this.startMonthDate = startMonthDate;
    }


    public void setEndMonthDate(Date endMonthDate) {
        this.endMonthDate = endMonthDate;
    }

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }
    
    private static Date getStartMonthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    private static Date getEndMonthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }
}
