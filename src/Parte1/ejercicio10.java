
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio10;
import java.awt.Color;
import javax.swing.JOptionPane;
import zCodeEjercicios.exercise10;
public class ejercicio10 extends javax.swing.JFrame {
    int xMouse, yMouse;
    public ejercicio10() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title_ejercicio10 = new javax.swing.JLabel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_estrato = new javax.swing.JLabel();
        lbl_numinscripcion = new javax.swing.JLabel();
        txt_numinscripcion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        panel_calcular = new javax.swing.JPanel();
        lbl_analizar = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_patrimonio = new javax.swing.JLabel();
        txt_patrimonio = new javax.swing.JTextField();
        txt_estrato = new javax.swing.JTextField();
        lbl_numinscripcion1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(211, 208, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title_ejercicio10.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio10.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio10.setText("Ejercicio 10");
        jPanel1.add(lbl_title_ejercicio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 146, -1));

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
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        lbl_estrato.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_estrato.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estrato.setText("Ingrese el estrato: ");
        jPanel1.add(lbl_estrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lbl_numinscripcion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion.setText("Liquidacion pago de matrícula");
        jPanel1.add(lbl_numinscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        txt_numinscripcion.setBackground(new java.awt.Color(255, 255, 255));
        txt_numinscripcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_numinscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_numinscripcion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_numinscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_numinscripcionMousePressed(evt);
            }
        });
        txt_numinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numinscripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_numinscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 20));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_nombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, 20));

        panel_calcular.setBackground(new java.awt.Color(142, 57, 70));
        panel_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_calcularMouseEntered(evt);
            }
        });

        lbl_analizar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_analizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_analizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_analizar.setText("Analizar");
        lbl_analizar.setToolTipText("");
        lbl_analizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_analizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_analizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_analizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_analizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_calcularLayout = new javax.swing.GroupLayout(panel_calcular);
        panel_calcular.setLayout(panel_calcularLayout);
        panel_calcularLayout.setHorizontalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_calcularLayout.setVerticalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 40));

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

        jPanel1.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, 40));

        lbl_nombre.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setText("Digite su nombre: ");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_patrimonio.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_patrimonio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_patrimonio.setText("Ingrese su patrimonio: ");
        jPanel1.add(lbl_patrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_patrimonio.setBackground(new java.awt.Color(255, 255, 255));
        txt_patrimonio.setForeground(new java.awt.Color(0, 0, 0));
        txt_patrimonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_patrimonio.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_patrimonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_patrimonioMousePressed(evt);
            }
        });
        txt_patrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patrimonioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_patrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 20));

        txt_estrato.setBackground(new java.awt.Color(255, 255, 255));
        txt_estrato.setForeground(new java.awt.Color(0, 0, 0));
        txt_estrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_estrato.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_estrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_estratoMousePressed(evt);
            }
        });
        txt_estrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estratoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_estrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 100, 20));

        lbl_numinscripcion1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion1.setText("Digite su número de inscripción: ");
        jPanel1.add(lbl_numinscripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, 20));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 3));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        Mejercicio10 = false; // regresa el valor a false para poder volver a abrir la ventana     
        this.dispose();      //esta ventana se cierra

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

    private void txt_numinscripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numinscripcionMousePressed
     
    }//GEN-LAST:event_txt_numinscripcionMousePressed

    private void txt_numinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numinscripcionActionPerformed

    }//GEN-LAST:event_txt_numinscripcionActionPerformed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
      
    }//GEN-LAST:event_txt_nombreMousePressed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void lbl_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseClicked
       
        String titles = "Ejercicio 10";
        int NumInscrip,estrato;
        double patrimonio, matricula;
        String nombre;
        try{
            NumInscrip = Integer.parseInt(txt_numinscripcion.getText());    //captura de variables y ejecucion del programa
            nombre = txt_nombre.getText();
            patrimonio = Double.parseDouble(txt_patrimonio.getText());
            estrato = Integer.parseInt(txt_estrato.getText());
            matricula = exercise10.pago_matricula(patrimonio, estrato);
            JOptionPane.showMessageDialog(null, 
                    "Número de inscripción: "+ NumInscrip +
                    "\nNombre: " + nombre+
                    "\nPago de matrícula: " + matricula , titles, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(java.lang.NumberFormatException s){
            s.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido", "Error de variable", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_lbl_analizarMouseClicked

    private void lbl_analizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseEntered
        panel_calcular.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_analizarMouseEntered

    private void lbl_analizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_analizarMouseExited

    private void panel_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcularMouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_calcularMouseEntered

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        //borrar contenido de las cajas de texto
        txt_numinscripcion.setText("");
        txt_nombre.setText("");
        txt_patrimonio.setText("");
        txt_estrato.setText("");
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

    private void txt_patrimonioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_patrimonioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patrimonioMousePressed

    private void txt_patrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patrimonioActionPerformed

    private void txt_estratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_estratoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estratoMousePressed

    private void txt_estratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estratoActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_analizar;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_estrato;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_numinscripcion;
    private javax.swing.JLabel lbl_numinscripcion1;
    private javax.swing.JLabel lbl_patrimonio;
    private javax.swing.JLabel lbl_title_ejercicio10;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txt_estrato;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numinscripcion;
    private javax.swing.JTextField txt_patrimonio;
    // End of variables declaration//GEN-END:variables

}
