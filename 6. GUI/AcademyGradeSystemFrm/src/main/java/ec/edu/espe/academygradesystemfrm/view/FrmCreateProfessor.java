package ec.edu.espe.academygradesystemfrm.view;

import ec.edu.espe.academygradesystemfrm.model.CreateProfessor;
import ec.edu.espe.academygradesystemfrm.utils.ProfessorToMongo;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author WINDOWS
 */
public class FrmCreateProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FrmCreateProfessor
     */
    public FrmCreateProfessor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblIdProfessor = new javax.swing.JLabel();
        lblFullNameProfessor = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        txtFullNameProfessor = new javax.swing.JTextField();
        txtDeparment = new javax.swing.JTextField();
        btnCrearProfesor = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAcademyGradeRegister = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CREAR PROFESOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblIdProfessor.setText("Id:");

        lblFullNameProfessor.setText("Apellidos y Nombres:");

        lblDepartment.setText("Departamento:");

        txtFullNameProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameProfessorActionPerformed(evt);
            }
        });

        btnCrearProfesor.setText("Crear Profesor");
        btnCrearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProfesorActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearProfesor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(txtDeparment, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFullNameProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullNameProfessor)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDepartment)
                        .addComponent(lblIdProfessor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullNameProfessor)
                    .addComponent(txtFullNameProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProfessor)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(txtDeparment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(btnCrearProfesor))
        );

        btnAcademyGradeRegister.setText("Regresar al menú");
        btnAcademyGradeRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcademyGradeRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcademyGradeRegister)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(btnAcademyGradeRegister))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcademyGradeRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcademyGradeRegisterActionPerformed
        FrmAcademyGradeRegister frmAcademyGradeRegister = new FrmAcademyGradeRegister();
        this.setVisible(false);
        frmAcademyGradeRegister.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcademyGradeRegisterActionPerformed

    private void btnCrearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProfesorActionPerformed
        try {
        CreateProfessor professor;
        
        String name;
        int id;
        String deparment;

        String idTextProfessor = txtId.getText();
        // Verificación de longitud del ID
        if (idTextProfessor.length() > 10) {
            JOptionPane.showMessageDialog(this, "El ID no debe tener más de 10 dígitos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            txtId.setForeground(Color.RED);  // Cambiar el color del texto a rojo
            txtId.requestFocus();  // Regresar el foco al campo de texto
            return;
            }

        id = Integer.parseInt(idTextProfessor);
        name = txtFullNameProfessor.getText();

        // Validación de que el nombre completo no contenga números
        if (!name.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "El nombre completo solo debe contener letras y espacios.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            txtFullNameProfessor.setForeground(Color.RED);  // Cambiar el color del texto a rojo
            txtFullNameProfessor.requestFocus();  // Regresar el foco al campo de texto
            return;
        }

        deparment = txtDeparment.getText();
        professor = new CreateProfessor(id, name, deparment);

        ProfessorToMongo.uploadProfessorData(professor);

        JOptionPane.showMessageDialog(this, "Profesor registrado exitosamente");
        txtId.setForeground(Color.BLACK);  // Restaurar el color del texto a negro
        txtFullNameProfessor.setForeground(Color.BLACK);  // Restaurar el color del texto a negro

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número entero.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        txtId.setForeground(Color.RED);  // Cambiar el color del texto a rojo
        txtId.setText("");
        txtId.requestFocus();  // Regresar el foco al campo de texto
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al registrar datos del profesor: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCrearProfesorActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        String idTextProfessor = txtId.getText();
        try {
            int idProfessor = Integer.parseInt(idTextProfessor);
            txtId.setForeground(Color.BLACK);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número entero.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            txtId.setForeground(Color.RED);
            txtId.setText("");
            txtId.requestFocus();
        }
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtFullNameProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameProfessorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCreateProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcademyGradeRegister;
    private javax.swing.JButton btnCrearProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblFullNameProfessor;
    private javax.swing.JLabel lblIdProfessor;
    private javax.swing.JTextField txtDeparment;
    private javax.swing.JTextField txtFullNameProfessor;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
