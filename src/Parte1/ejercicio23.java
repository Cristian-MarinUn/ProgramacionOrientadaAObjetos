
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio23;
import java.awt.Color; 
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import zCodeEjercicios.exercise23;


public class ejercicio23 extends javax.swing.JFrame {
    int xMouse, yMouse;
    public ejercicio23() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_background = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_subtitle = new javax.swing.JLabel();
        lbl_valorB = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        lbl_valorC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        panel_calcular = new javax.swing.JPanel();
        lbl_calcular = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        lbl_title_ejercicio23 = new javax.swing.JLabel();
        lbl_valorA1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panel_background.setBackground(new java.awt.Color(211, 208, 201));
        panel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_background.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        lbl_subtitle.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_subtitle.setForeground(new java.awt.Color(0, 0, 0));
        lbl_subtitle.setText("Ecuación de segundo grado");
        panel_background.add(lbl_subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        lbl_valorB.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorB.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorB.setText("Ingrese el valor de b:");
        panel_background.add(lbl_valorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtA.setBackground(new java.awt.Color(255, 255, 255));
        txtA.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
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
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });
        panel_background.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 140, 30));

        txtB.setBackground(new java.awt.Color(255, 255, 255));
        txtB.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
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
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });
        panel_background.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 30));

        lbl_valorC.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorC.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorC.setText("Ingrese el valor de c:");
        panel_background.add(lbl_valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtC.setBackground(new java.awt.Color(255, 255, 255));
        txtC.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtC.setForeground(new java.awt.Color(0, 0, 0));
        txtC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtC.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCMousePressed(evt);
            }
        });
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        panel_background.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 30));

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

        panel_background.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, 40));

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

        panel_background.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 100, 40));

        lbl_title_ejercicio23.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio23.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio23.setText("Ejercicio 23");
        panel_background.add(lbl_title_ejercicio23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 146, -1));

        lbl_valorA1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorA1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorA1.setText("Ingrese el valor de a:");
        panel_background.add(lbl_valorA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));
        panel_background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 270, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/formulageneral.png"))); // NOI18N
        panel_background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, -1));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_background.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        Mejercicio23 = false;   // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();       //esta ventana se cierra

    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142, 57, 70));
        // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUPMouseDragged

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraUPMousePressed

    private void txtAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAMousePressed
        
            
            txtA.setForeground(Color.black);
    }//GEN-LAST:event_txtAMousePressed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed

    }//GEN-LAST:event_txtAActionPerformed

    private void txtBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBMousePressed
       //al dar click las letras se cambian a color negro
       txtB.setForeground(Color.black);
    }//GEN-LAST:event_txtBMousePressed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCMousePressed
       //al dar click las letras se cambian a color negro
       txtC.setForeground(Color.black);
    }//GEN-LAST:event_txtCMousePressed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void lbl_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseClicked
        //solucion de la eccuacion de segundo grado
        String titles = "Ejercicio 23";
        int A,B,C;
        try{
            A = Integer.parseInt(txtA.getText());
            B = Integer.parseInt(txtB.getText());
            C = Integer.parseInt(txtC.getText());
            double determinante = (Math.pow(B, 2) - (4 * A * C));
            double[] X = exercise23.ecuacion2Grado(A, B, C);
            
            if (determinante >= 0){
                if(determinante == 0){
                    //solucion unica
                    JOptionPane.showMessageDialog(null,"-X : " + X[0], titles, JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    //dos soluciones
                    JOptionPane.showMessageDialog(null, 
                    "+ X : " + X[0] +
                    "\n- X : " + X[1], titles, JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,
                    "No tiene solución", titles, JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }
        catch(java.lang.NumberFormatException s){
            s.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido", "Error de variable", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_lbl_calcularMouseClicked

    private void lbl_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseEntered
        panel_calcular.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_calcularMouseEntered

    private void lbl_calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_calcularMouseExited

    private void panel_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcularMouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_calcularMouseEntered

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        panel_borrar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        panel_borrar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void panel_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_borrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_borrarMouseEntered

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        //obligar a escribir solo números y un punto
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '-' || txtA.getText().contains("-"))) {
           
            evt.consume();
    }//GEN-LAST:event_txtAKeyTyped
    }
    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        //obligar a escribir solo números y un punto
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '-' || txtB.getText().contains("-"))) {
            
            evt.consume();
    }//GEN-LAST:event_txtBKeyTyped
    }
    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        //obligar a escribir solo números y un punto
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '-' || txtC.getText().contains("-"))) {
            
            evt.consume();
    }//GEN-LAST:event_txtCKeyTyped
    }
  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_calcular;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_subtitle;
    private javax.swing.JLabel lbl_title_ejercicio23;
    private javax.swing.JLabel lbl_valorA1;
    private javax.swing.JLabel lbl_valorB;
    private javax.swing.JLabel lbl_valorC;
    private javax.swing.JPanel panel_background;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables

}
