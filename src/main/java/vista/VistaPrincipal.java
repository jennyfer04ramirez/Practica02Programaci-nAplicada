/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JLabel;
import javax.swing.JSlider;
import observer.ObservadorConcreto;
import observer.SujetoConcreto;

/**
 *
 * @author casa
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private ObservadorConcreto observadorConcreto;
    private SujetoConcreto sujetoConcreto;
            
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        observadorConcreto = new ObservadorConcreto();
        sujetoConcreto = new SujetoConcreto();
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
        lblMensaje1 = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        lblMensaje3 = new javax.swing.JLabel();
        lblMensaje5 = new javax.swing.JLabel();
        lblMensaje4 = new javax.swing.JLabel();
        rbSubs1 = new javax.swing.JRadioButton();
        lblTermometro = new javax.swing.JLabel();
        rbSubs3 = new javax.swing.JRadioButton();
        rbSubs2 = new javax.swing.JRadioButton();
        rbSubs4 = new javax.swing.JRadioButton();
        rbSubs5 = new javax.swing.JRadioButton();
        sldTemperatura = new javax.swing.JSlider();
        lblValorTemp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema de Monitoreo Meteorológico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(153, 153, 0))); // NOI18N

        lblMensaje1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMensaje1.setText("Aquí se mostrara si tiene un mensaje o no");
        lblMensaje1.setToolTipText("");
        lblMensaje1.setEnabled(false);

        lblMensaje2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMensaje2.setText("Aquí se mostrara si tiene un mensaje o no");
        lblMensaje2.setToolTipText("");
        lblMensaje2.setEnabled(false);

        lblMensaje3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMensaje3.setText("Aquí se mostrara si tiene un mensaje o no");
        lblMensaje3.setToolTipText("");
        lblMensaje3.setEnabled(false);

        lblMensaje5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMensaje5.setText("Aquí se mostrara si tiene un mensaje o no");
        lblMensaje5.setToolTipText("");
        lblMensaje5.setEnabled(false);

        lblMensaje4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblMensaje4.setText("Aquí se mostrara si tiene un mensaje o no");
        lblMensaje4.setToolTipText("");
        lblMensaje4.setEnabled(false);

        rbSubs1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbSubs1.setText("Suscrito");
        rbSubs1.setEnabled(false);
        rbSubs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubs1ActionPerformed(evt);
            }
        });

        lblTermometro.setForeground(new java.awt.Color(255, 255, 255));
        lblTermometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTermometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/termometroo.png"))); // NOI18N

        rbSubs3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbSubs3.setText("Suscrito");
        rbSubs3.setEnabled(false);
        rbSubs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubs3ActionPerformed(evt);
            }
        });

        rbSubs2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbSubs2.setText("Suscrito");
        rbSubs2.setEnabled(false);
        rbSubs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubs2ActionPerformed(evt);
            }
        });

        rbSubs4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbSubs4.setText("Suscrito");
        rbSubs4.setEnabled(false);
        rbSubs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubs4ActionPerformed(evt);
            }
        });

        rbSubs5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rbSubs5.setText("Suscrito");
        rbSubs5.setEnabled(false);
        rbSubs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSubs5ActionPerformed(evt);
            }
        });

        sldTemperatura.setMajorTickSpacing(10);
        sldTemperatura.setOrientation(javax.swing.JSlider.VERTICAL);
        sldTemperatura.setPaintLabels(true);
        sldTemperatura.setPaintTicks(true);

        lblValorTemp.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblValorTemp.setToolTipText("");
        lblValorTemp.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lblValorTempComponentAdded(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/personaA.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/personaB.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/personaC.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/personaD.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/personaE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(rbSubs2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(rbSubs1)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje1)
                            .addComponent(lblMensaje2)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbSubs5)
                                .addGap(66, 66, 66)
                                .addComponent(lblMensaje5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbSubs4)
                                .addGap(66, 66, 66)
                                .addComponent(lblMensaje4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbSubs3)
                                .addGap(66, 66, 66)
                                .addComponent(lblMensaje3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblTermometro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblValorTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSubs1)
                            .addComponent(lblMensaje1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSubs2)
                            .addComponent(lblMensaje2))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSubs3)
                            .addComponent(lblMensaje3))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSubs4)
                            .addComponent(lblMensaje4))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbSubs5)
                            .addComponent(lblMensaje5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTermometro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sldTemperatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblValorTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSubs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubs1ActionPerformed
        if (suscripcion()== false) {
            rbSubs1.setSelected(true);
        } else {
            rbSubs1.setSelected(false);
        }
    }//GEN-LAST:event_rbSubs1ActionPerformed

    private void rbSubs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubs3ActionPerformed
        if (suscripcion()== false) {
            rbSubs2.setSelected(true);
        } else {
            rbSubs2.setSelected(false);
        }
    }//GEN-LAST:event_rbSubs3ActionPerformed

    private void rbSubs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubs2ActionPerformed
        if (suscripcion()== false) {
            rbSubs3.setSelected(true);
        } else {
            rbSubs3.setSelected(false);
        }
    }//GEN-LAST:event_rbSubs2ActionPerformed

    private void rbSubs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubs4ActionPerformed
        if (suscripcion()== false) {
            rbSubs4.setSelected(true);
        } else {
            rbSubs5.setSelected(false);
        }
    }//GEN-LAST:event_rbSubs4ActionPerformed

    private void rbSubs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSubs5ActionPerformed
        if (suscripcion()== false) {
            rbSubs5.setSelected(true);
        } else {
            rbSubs5.setSelected(false);
        }
    }//GEN-LAST:event_rbSubs5ActionPerformed

    private void lblValorTempComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lblValorTempComponentAdded
        cambiarEstadoTermometro(lblValorTemp, sldTemperatura);
    }//GEN-LAST:event_lblValorTempComponentAdded

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
    
    public void cambiarEstadoTermometro(JLabel lblValorTemp, JSlider sldTemperatura){
        lblValorTemp.setText("El valor del deslizador es: " + sldTemperatura.getValue());
    }
    
    public boolean suscripcion(){
        sujetoConcreto.suscribirObservador(observadorConcreto);
        if (sujetoConcreto == null) {
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblMensaje2;
    private javax.swing.JLabel lblMensaje3;
    private javax.swing.JLabel lblMensaje4;
    private javax.swing.JLabel lblMensaje5;
    private javax.swing.JLabel lblTermometro;
    private javax.swing.JLabel lblValorTemp;
    private javax.swing.JRadioButton rbSubs1;
    private javax.swing.JRadioButton rbSubs2;
    private javax.swing.JRadioButton rbSubs3;
    private javax.swing.JRadioButton rbSubs4;
    private javax.swing.JRadioButton rbSubs5;
    private javax.swing.JSlider sldTemperatura;
    // End of variables declaration//GEN-END:variables
}
