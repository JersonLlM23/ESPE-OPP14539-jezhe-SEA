package ec.edu.espe.academygradesystemfrm.controller;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */

public class StudentGradeValidator {
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
