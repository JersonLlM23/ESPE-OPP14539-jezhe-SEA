/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import ec.edu.espe.academygradesystemfrm.model.CreateProfessor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class ProfessorValidator {
    public static boolean validateProfessorId(String idText, JTextField idField) {
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(null, "El ID no debe tener más de 10 dígitos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            idField.setForeground(java.awt.Color.RED);
            idField.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validateProfessorName(String name, JTextField nameField) {
        if (!name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre completo solo debe contener letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            nameField.setForeground(java.awt.Color.RED);
            nameField.requestFocus();
            return false;
        }
        return true;
    }

    public static CreateProfessor createProfessor(int id, String name, String department) {
        return new CreateProfessor(id, name, department);
    }

    public static boolean validateIdIsInteger(String idText, JTextField idField) {
        try {
            Integer.parseInt(idText);
            idField.setForeground(java.awt.Color.BLACK);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            idField.setForeground(java.awt.Color.RED);
            idField.setText("");
            idField.requestFocus();
            return false;
        }
    }
}
