package ec.edu.espe.academygradesystemfrm.controller;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */

public class ValidateData {
      public static boolean validateIdLength(String idText, JTextField textField) {
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(null, "El ID no debe tener más de 10 dígitos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            textField.setForeground(Color.RED);
            textField.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validateIdIsInteger(String idText, JTextField textField) {
        try {
            Integer.parseInt(idText);
            textField.setForeground(Color.BLACK);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            textField.setForeground(Color.RED);
            textField.setText("");
            textField.requestFocus();
            return false;
        }
    }

    public static boolean validateName(String name, JTextField textField) {
        if (!name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(null, "El nombre completo solo debe contener letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            textField.setForeground(Color.RED);
            textField.requestFocus();
            return false;
        }
        textField.setForeground(Color.BLACK);
        return true;
    }
    
    public static boolean validateStudentId(String idText, JTextField idField) {
        if (idText.length() > 10) {
            JOptionPane.showMessageDialog(null, "El ID no debe tener más de 10 dígitos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            idField.setForeground(Color.RED);
            idField.requestFocus();
            return false;
        }
        return true;
    }
    public static String getSelectedSubject(JComboBox<String> comboBox) {
        return comboBox.getSelectedItem().toString();
    }
}
