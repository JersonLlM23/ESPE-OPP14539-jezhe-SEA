/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.controller;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class StudentValidator {
    public static boolean validateId(String idText, JTextField idField) {
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(null, "El ID no debe tener más de 10 dígitos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            idField.setForeground(Color.RED);
            idField.requestFocus();
            return false;
        }
        return true;
    }
 public static boolean validateName(String name, JTextField nameField) {
        if (!name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre completo solo debe contener letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            nameField.setForeground(Color.RED);
            nameField.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validateBirthDate(java.util.Date birthDate) {
        if (birthDate == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha de nacimiento", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}

