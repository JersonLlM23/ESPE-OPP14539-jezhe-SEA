/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygraderegister.model;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class StudentName {
    private int id;
    private String firstName;
    private String middleName;
    private String surname;
    private String middleSurname;

    /** Temporalmente, luego irá a Student
     * @return t*/
    @Override
    public String toString() {
        return "StudentName{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", surname=" + surname + ", middleSurname=" + middleSurname + '}';
    }
    
    
    
    public StudentName(int id, String firstName, String middleName, String surname, String middleSurname){
        this.id=id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.middleSurname = middleSurname;
    }
    public StudentName(int id, String firstName, String surname) {
        this(id, firstName, "", surname, "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleSurname() {
        return middleSurname;
    }

    public void setMiddleSurname(String middleSurname) {
        this.middleSurname = middleSurname;
    }
    
   
     
}
