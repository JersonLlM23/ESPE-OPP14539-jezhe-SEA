/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.academygradesystemfrm.view;

/**
 *
 * @author Lainez Ricardo JEZHE SEA - ESPE
 */
public class FrmAcademyGradeRegister extends javax.swing.JFrame {

    /**
     * Creates new form FrmAcademyGradeRegister
     */
    public FrmAcademyGradeRegister() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAcademyGradeRegister = new javax.swing.JMenu();
        itmLogout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        mnuProfessor = new javax.swing.JMenu();
        itmCreateProfessor = new javax.swing.JMenuItem();
        itmReadProfessor = new javax.swing.JMenuItem();
        itmUpdateProfessor = new javax.swing.JMenuItem();
        itmDeleteProfessor = new javax.swing.JMenuItem();
        mnuStudent = new javax.swing.JMenu();
        itmCreateStudent = new javax.swing.JMenuItem();
        itmReadStudent = new javax.swing.JMenuItem();
        itmUpdateStudent = new javax.swing.JMenuItem();
        itmDeleteStudent = new javax.swing.JMenuItem();
        mnuGrade = new javax.swing.JMenu();
        itmAddGradeToStudent = new javax.swing.JMenuItem();
        itmReadStudentGrade = new javax.swing.JMenuItem();
        itmUpdateStudentGrade = new javax.swing.JMenuItem();
        itmDeleteStudentGrade = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        itmGenerateStudentReport = new javax.swing.JMenuItem();
        itmEvaluateStudent = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        mnuAcademyGradeRegister.setText("HOME");

        itmLogout.setText("Cerrar Sesión");
        itmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogoutActionPerformed(evt);
            }
        });
        mnuAcademyGradeRegister.add(itmLogout);

        itmExit.setText("Salir");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuAcademyGradeRegister.add(itmExit);

        jMenuBar1.add(mnuAcademyGradeRegister);

        mnuProfessor.setText("PROFESOR");

        itmCreateProfessor.setText("Registrar Profesor");
        itmCreateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateProfessorActionPerformed(evt);
            }
        });
        mnuProfessor.add(itmCreateProfessor);

        itmReadProfessor.setText("Leer Profesor");
        itmReadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadProfessorActionPerformed(evt);
            }
        });
        mnuProfessor.add(itmReadProfessor);

        itmUpdateProfessor.setText("Actualizar Profesor");
        itmUpdateProfessor.setToolTipText("");
        itmUpdateProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateProfessorActionPerformed(evt);
            }
        });
        mnuProfessor.add(itmUpdateProfessor);

        itmDeleteProfessor.setText("Borrar Profesor");
        itmDeleteProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteProfessorActionPerformed(evt);
            }
        });
        mnuProfessor.add(itmDeleteProfessor);

        jMenuBar1.add(mnuProfessor);

        mnuStudent.setText("ESTUDIANTE");

        itmCreateStudent.setText("Registrar Estudiante");
        itmCreateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCreateStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(itmCreateStudent);

        itmReadStudent.setText("Leer Estudiante");
        itmReadStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(itmReadStudent);

        itmUpdateStudent.setText("Actualizar Estudiante");
        itmUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUpdateStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(itmUpdateStudent);

        itmDeleteStudent.setText("Eliminar Estudiante");
        itmDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteStudentActionPerformed(evt);
            }
        });
        mnuStudent.add(itmDeleteStudent);

        jMenuBar1.add(mnuStudent);

        mnuGrade.setText("NOTAS");

        itmAddGradeToStudent.setText("Agregar Notas a Estudiantes");
        itmAddGradeToStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddGradeToStudentActionPerformed(evt);
            }
        });
        mnuGrade.add(itmAddGradeToStudent);

        itmReadStudentGrade.setText("Leer Notas de Estudiantes");
        itmReadStudentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadStudentGradeActionPerformed(evt);
            }
        });
        mnuGrade.add(itmReadStudentGrade);

        itmUpdateStudentGrade.setText("Actualizar Nota");
        mnuGrade.add(itmUpdateStudentGrade);

        itmDeleteStudentGrade.setText("Eliminar Nota");
        itmDeleteStudentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteStudentGradeActionPerformed(evt);
            }
        });
        mnuGrade.add(itmDeleteStudentGrade);

        jMenuBar1.add(mnuGrade);

        mnuReport.setText("REPORTE");

        itmGenerateStudentReport.setText("Generar Reporte de Notas");
        itmGenerateStudentReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGenerateStudentReportActionPerformed(evt);
            }
        });
        mnuReport.add(itmGenerateStudentReport);

        itmEvaluateStudent.setText("Evaluar Estudiante");
        mnuReport.add(itmEvaluateStudent);

        jMenuBar1.add(mnuReport);

        jMenu1.setText("AYUDA");
        jMenu1.setToolTipText("");
        jMenu1.setAlignmentX(1.0F);

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmCreateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateStudentActionPerformed
        FrmCreateStudent frmCreateStudent = new FrmCreateStudent();
        this.setVisible(false);
        frmCreateStudent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCreateStudentActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmReadStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadStudentActionPerformed
        FrmReadStudent frmReadStudent = new FrmReadStudent();
        this.setVisible(false);
        frmReadStudent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadStudentActionPerformed

    private void itmUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateStudentActionPerformed
        FrmUpdateStudent frmUpdateStudent = new FrmUpdateStudent();
        this.setVisible(false);
        frmUpdateStudent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmUpdateStudentActionPerformed

    private void itmDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteStudentActionPerformed
        FrmDeleteStudent frmDeleteStudent = new FrmDeleteStudent();
        this.setVisible(false);
        frmDeleteStudent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmDeleteStudentActionPerformed

    private void itmCreateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCreateProfessorActionPerformed
        FrmCreateProfessor frmCreateProfessor = new FrmCreateProfessor();
        this.setVisible(false);
        frmCreateProfessor.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCreateProfessorActionPerformed

    private void itmReadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadProfessorActionPerformed
        FrmReadProfessor frmReadProfessor = new FrmReadProfessor();
        this.setVisible(false);
        frmReadProfessor.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadProfessorActionPerformed

    private void itmDeleteProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteProfessorActionPerformed
        FrmDeleteProfessor frmDeleteProfessor = new FrmDeleteProfessor();
        this.setVisible(false);
        frmDeleteProfessor.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmDeleteProfessorActionPerformed

    private void itmUpdateProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUpdateProfessorActionPerformed
        FrmUpdateProfessor frmUpdateProfessor = new FrmUpdateProfessor();
        this.setVisible(false);
        frmUpdateProfessor.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itmUpdateProfessorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAbout frmAbout = new FrmAbout();
        this.setVisible(false);
        frmAbout.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmGenerateStudentReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGenerateStudentReportActionPerformed
        FrmGenerateStudentReport  frmGenerateStudentReport = new  FrmGenerateStudentReport();
        this.setVisible(false);
        frmGenerateStudentReport.setVisible(true);
        // TODO add your handling code here:      
    }//GEN-LAST:event_itmGenerateStudentReportActionPerformed

    private void itmAddGradeToStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddGradeToStudentActionPerformed
        FrmAddGradeToStudent  frmAddGradeToStudent = new  FrmAddGradeToStudent();
        this.setVisible(false);
        frmAddGradeToStudent.setVisible(true);

    }//GEN-LAST:event_itmAddGradeToStudentActionPerformed

    private void itmReadStudentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadStudentGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadStudentGradeActionPerformed

    private void itmDeleteStudentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteStudentGradeActionPerformed
        FrmDeleteStudentGrade  frmDeleteStudentGrade = new  FrmDeleteStudentGrade();
        this.setVisible(false);
        frmDeleteStudentGrade.setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_itmDeleteStudentGradeActionPerformed

    private void itmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogoutActionPerformed
        // TODO add your handling code here:
        FrmLogIn frmLogIn = new FrmLogIn();
        this.setVisible(false);
        frmLogIn.setVisible(true);

    }//GEN-LAST:event_itmLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAcademyGradeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAcademyGradeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAcademyGradeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAcademyGradeRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAcademyGradeRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAddGradeToStudent;
    private javax.swing.JMenuItem itmCreateProfessor;
    private javax.swing.JMenuItem itmCreateStudent;
    private javax.swing.JMenuItem itmDeleteProfessor;
    private javax.swing.JMenuItem itmDeleteStudent;
    private javax.swing.JMenuItem itmDeleteStudentGrade;
    private javax.swing.JMenuItem itmEvaluateStudent;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmGenerateStudentReport;
    private javax.swing.JMenuItem itmLogout;
    private javax.swing.JMenuItem itmReadProfessor;
    private javax.swing.JMenuItem itmReadStudent;
    private javax.swing.JMenuItem itmReadStudentGrade;
    private javax.swing.JMenuItem itmUpdateProfessor;
    private javax.swing.JMenuItem itmUpdateStudent;
    private javax.swing.JMenuItem itmUpdateStudentGrade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuAcademyGradeRegister;
    private javax.swing.JMenu mnuGrade;
    private javax.swing.JMenu mnuProfessor;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenu mnuStudent;
    // End of variables declaration//GEN-END:variables
}
