
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio7;
import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import zCodeEjercicios.exercise7;
public class ejercicio7 extends javax.swing.JFrame {
    int xMouse, yMouse;    
    
    public ejercicio7() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title_ejercicio7 = new javax.swing.JLabel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_valoB = new javax.swing.JLabel();
        lbl_valorA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        panel_calcular = new javax.swing.JPanel();
        lbl_calcular = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(211, 208, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title_ejercicio7.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio7.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio7.setText("Ejercicio 7");
        jPanel1.add(lbl_title_ejercicio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 140, -1));

        barraUP.setBackground(new java.awt.Color(142, 57, 70));
        barraUP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUPMouseDragged(evt);
            }
        });
        barraUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUPMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        lbl_valoB.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valoB.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valoB.setText("Ingrese el valor de B:");
        jPanel1.add(lbl_valoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lbl_valorA.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorA.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorA.setText("Ingrese el valor de A:");
        jPanel1.add(lbl_valorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        txtA.setBackground(new java.awt.Color(255, 255, 255));
        txtA.setForeground(new java.awt.Color(0, 0, 0));
        txtA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAMousePressed(evt);
            }
        });
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, 30));

        txtB.setBackground(new java.awt.Color(255, 255, 255));
        txtB.setForeground(new java.awt.Color(0, 0, 0));
        txtB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtB.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBMousePressed(evt);
            }
        });
        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 130, 30));

        panel_calcular.setBackground(new java.awt.Color(142, 57, 70));
        panel_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_calcularMouseEntered(evt);
            }
        });

        lbl_calcular.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_calcular.setForeground(new java.awt.Color(255, 255, 255));
        lbl_calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_calcular.setText("Calcular");
        lbl_calcular.setToolTipText("");
        lbl_calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_calcularLayout = new javax.swing.GroupLayout(panel_calcular);
        panel_calcular.setLayout(panel_calcularLayout);
        panel_calcularLayout.setHorizontalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_calcularLayout.setVerticalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 40));

        panel_borrar.setBackground(new java.awt.Color(142, 57, 70));
        panel_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_borrarMouseEntered(evt);
            }
        });

        lbl_borrar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_borrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_borrar.setText("Borrar");
        lbl_borrar.setToolTipText("");
        lbl_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_borrarLayout = new javax.swing.GroupLayout(panel_borrar);
        panel_borrar.setLayout(panel_borrarLayout);
        panel_borrarLayout.setHorizontalGroup(
            panel_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_borrarLayout.setVerticalGroup(
            panel_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 100, 40));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        Mejercicio7 = false;    // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();           // esta ventana se cierra
        
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54)); // cambio de color cuando el cursor sale del recuadro de la x
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142, 57, 70));     // cambio de color cuando el cursor entra del recuadro de la x
        // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();        //registra las coordenadas del cursor con el click sostenido
        int y = evt.getYOnScreen();        //para trasladar la ventana junto con el

        this.setLocation(x - xMouse, y - yMouse);       //fluides al arraste de ventana
    }//GEN-LAST:event_barraUPMouseDragged

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
        xMouse = evt.getX();        //registra el click del cursor en la barra 
        yMouse = evt.getY();
    }//GEN-LAST:event_barraUPMousePressed

    private void txtAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAMousePressed
      
    }//GEN-LAST:event_txtAMousePressed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed

    }//GEN-LAST:event_txtAActionPerformed

    private void txtBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBMousePressed
      
    }//GEN-LAST:event_txtBMousePressed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void lbl_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseClicked
        //ejecucion de la clase exercise7
        double ladoA, ladoB;
        String titles = "Ejercicio 7", resultado;   //titulo de ventana
        try{
            ladoA = Double.parseDouble(txtA.getText());     //captura el valor de A
            ladoB = Double.parseDouble(txtB.getText());     //captura el valor de B
            resultado = exercise7.calcular_mayor(ladoA, ladoB);
            JOptionPane.showMessageDialog(null, "el numero mayor es: "+resultado , titles, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(java.lang.NumberFormatException s){
            s.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido", "Error de variable", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_lbl_calcularMouseClicked

    private void lbl_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseEntered
        panel_calcular.setBackground(new Color(111,45,54));     // cambio de color cuando el cursor entra del recuadro

    }//GEN-LAST:event_lbl_calcularMouseEntered

    private void lbl_calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));      // cambio de color cuando el cursor sale del recuadro

    }//GEN-LAST:event_lbl_calcularMouseExited

    private void panel_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcularMouseEntered
        
    }//GEN-LAST:event_panel_calcularMouseEntered

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txtA.setText("");   //borra los cajas de texto
        txtB.setText("");
    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        panel_borrar.setBackground(new Color(111,45,54));       // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        panel_borrar.setBackground(new Color(142, 57, 70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void panel_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_borrarMouseEntered
        
    }//GEN-LAST:event_panel_borrarMouseEntered

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_calcular;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_title_ejercicio7;
    private javax.swing.JLabel lbl_valoB;
    private javax.swing.JLabel lbl_valorA;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    // End of variables declaration//GEN-END:variables

}
