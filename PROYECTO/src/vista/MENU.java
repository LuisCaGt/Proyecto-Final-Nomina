/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Usuarios;

/**
 *
 */
public class MENU extends javax.swing.JFrame {

    Usuarios mod;

    public MENU() {
        initComponents();
    }

    MENU(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            MANTENIMIENTO.setVisible(true);
            jMenuItem1.setVisible(true);
            jMenuItem2.setVisible(true);
            jMenuItem3.setVisible(true);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
         if (mod.getIdTipo() == 2) {
            jMenuItem4.setVisible(true);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
          if (mod.getIdTipo() == 3) {
            jMenuItem5.setVisible(true);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
           if (mod.getIdTipo() < 1 || mod.getIdTipo() > 3) {
            MANTENIMIENTO.setVisible(false);
            jMenuItem1.setVisible(false);
            jMenuItem2.setVisible(false);
            jMenuItem3.setVisible(false);
            jMenuItem4.setVisible(false);
            jMenuItem5.setVisible(false);
            SALIR.setVisible(false);
            AYUDA.setVisible(false);
            HERRAMIENTAS.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        FuncionUsuarioMantenimiento = new javax.swing.JMenuBar();
        MANTENIMIENTO = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        AYUDA = new javax.swing.JMenu();
        HERRAMIENTAS = new javax.swing.JMenu();
        SALIR = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        MANTENIMIENTO.setText("MANTENIMIENTO");

        jMenuItem1.setText("jMenuItem1");
        MANTENIMIENTO.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        MANTENIMIENTO.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        MANTENIMIENTO.add(jMenuItem3);

        FuncionUsuarioMantenimiento.add(MANTENIMIENTO);

        jMenu1.setText("FUNCIONES");

        jMenuItem5.setText("jMenuItem5");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jMenu1.add(jMenuItem6);

        FuncionUsuarioMantenimiento.add(jMenu1);

        AYUDA.setText("AYUDA");
        FuncionUsuarioMantenimiento.add(AYUDA);

        HERRAMIENTAS.setText("HERRAMIENTAS");
        FuncionUsuarioMantenimiento.add(HERRAMIENTAS);

        SALIR.setText("SALIR");

        jMenuItem4.setText("jMenuItem4");
        SALIR.add(jMenuItem4);

        FuncionUsuarioMantenimiento.add(SALIR);

        setJMenuBar(FuncionUsuarioMantenimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AYUDA;
    private javax.swing.JMenuBar FuncionUsuarioMantenimiento;
    private javax.swing.JMenu HERRAMIENTAS;
    private javax.swing.JMenu MANTENIMIENTO;
    private javax.swing.JMenu SALIR;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}