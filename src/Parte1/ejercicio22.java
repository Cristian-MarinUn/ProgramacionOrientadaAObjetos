
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio22;
import java.awt.Color;
import javax.swing.JOptionPane;
import zCodeEjercicios.exercise22;
public class ejercicio22 extends javax.swing.JFrame {
    int xMouse, yMouse;
    public ejercicio22() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl_title_ejercicio11 = new javax.swing.JLabel();
        barraUP1 = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit1 = new javax.swing.JLabel();
        lbl_title_basedatosempleados = new javax.swing.JLabel();
        txt_nomEmpleado = new javax.swing.JTextField();
        txt_salariobasico = new javax.swing.JTextField();
        lbl_salarioB = new javax.swing.JLabel();
        lbl_numhoras = new javax.swing.JLabel();
        txt_numhoras = new javax.swing.JTextField();
        lbl_nombEmpleado = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        panel_calcular = new javax.swing.JPanel();
        lbl_analizar = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        lbl_print2 = new javax.swing.JLabel();
        lbl_print = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(211, 208, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title_ejercicio11.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio11.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio11.setText("Ejercicio 22");
        jPanel2.add(lbl_title_ejercicio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 146, -1));

        barraUP1.setBackground(new java.awt.Color(142, 57, 70));
        barraUP1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUP1MouseDragged(evt);
            }
        });
        barraUP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUP1MousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));

        lbl_exit1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit1.setText("X");
        lbl_exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exit1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraUP1Layout = new javax.swing.GroupLayout(barraUP1);
        barraUP1.setLayout(barraUP1Layout);
        barraUP1Layout.setHorizontalGroup(
            barraUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUP1Layout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUP1Layout.setVerticalGroup(
            barraUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUP1Layout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(barraUP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        lbl_title_basedatosempleados.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_title_basedatosempleados.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_basedatosempleados.setText("base de datos de empleados");
        jPanel2.add(lbl_title_basedatosempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 30));

        txt_nomEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_nomEmpleado.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        txt_nomEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        txt_nomEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_nomEmpleado.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nomEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nomEmpleadoMousePressed(evt);
            }
        });
        txt_nomEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 160, 20));

        txt_salariobasico.setBackground(new java.awt.Color(255, 255, 255));
        txt_salariobasico.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        txt_salariobasico.setForeground(new java.awt.Color(0, 0, 0));
        txt_salariobasico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_salariobasico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_salariobasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_salariobasicoMousePressed(evt);
            }
        });
        txt_salariobasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salariobasicoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_salariobasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 160, 20));

        lbl_salarioB.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_salarioB.setForeground(new java.awt.Color(0, 0, 0));
        lbl_salarioB.setText("salario básico:");
        jPanel2.add(lbl_salarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_numhoras.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numhoras.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numhoras.setText("numero de horas trabajadas en el mes: ");
        jPanel2.add(lbl_numhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_numhoras.setBackground(new java.awt.Color(255, 255, 255));
        txt_numhoras.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        txt_numhoras.setForeground(new java.awt.Color(0, 0, 0));
        txt_numhoras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_numhoras.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_numhoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_numhorasMousePressed(evt);
            }
        });
        txt_numhoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numhorasActionPerformed(evt);
            }
        });
        jPanel2.add(txt_numhoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 160, 20));

        lbl_nombEmpleado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_nombEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombEmpleado.setText("nombre del empleado: ");
        jPanel2.add(lbl_nombEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 270, 20));

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

        jPanel2.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

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

        jPanel2.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        lbl_print2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_print2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_print2.setToolTipText("");
        lbl_print2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbl_print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 220, 20));

        lbl_print.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_print.setForeground(new java.awt.Color(0, 0, 0));
        lbl_print.setToolTipText("");
        lbl_print.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbl_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 220, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 230, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseClicked
        Mejercicio22 = false; // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();       //esta ventana se cierra
    }//GEN-LAST:event_lbl_exit1MouseClicked

    private void lbl_exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseEntered
        exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exit1MouseEntered

    private void lbl_exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseExited
        exit.setBackground(new Color(142, 57, 70));
        // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exit1MouseExited

    private void barraUP1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUP1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUP1MouseDragged

    private void barraUP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUP1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraUP1MousePressed

    private void txt_nomEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nomEmpleadoMousePressed
       
    }//GEN-LAST:event_txt_nomEmpleadoMousePressed

    private void txt_nomEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomEmpleadoActionPerformed

    }//GEN-LAST:event_txt_nomEmpleadoActionPerformed

    private void txt_salariobasicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_salariobasicoMousePressed
       
    }//GEN-LAST:event_txt_salariobasicoMousePressed

    private void txt_salariobasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salariobasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salariobasicoActionPerformed

    private void txt_numhorasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numhorasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numhorasMousePressed

    private void txt_numhorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numhorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numhorasActionPerformed

    private void lbl_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseClicked
       String titles = "Ejercicio 22";
       String nombre;
       double salarioBasico, numeroHoras, salario;
        try{
           nombre = txt_nomEmpleado.getText();
           salarioBasico = Double.parseDouble(txt_salariobasico.getText());
           numeroHoras = Double.parseDouble(txt_numhoras.getText());
           salario = exercise22.salario_mesual(salarioBasico, numeroHoras);
           
           lbl_print2.setText("");
           lbl_print.setText("");
           
           if(salario > 450000){
              lbl_print2.setText("Nombre: " + nombre );
              lbl_print.setText("Salario: " + salario);
              
           }
           else{
               lbl_print2.setText("Nombre: " + nombre);
           }
           
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
        txt_nomEmpleado.setText("");
        txt_salariobasico.setText("");
        txt_numhoras.setText("");
        lbl_print2.setText("");
        lbl_print.setText("");
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

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP1;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JLabel lbl_analizar;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_exit1;
    private javax.swing.JLabel lbl_nombEmpleado;
    private javax.swing.JLabel lbl_numhoras;
    private javax.swing.JLabel lbl_print;
    private javax.swing.JLabel lbl_print2;
    private javax.swing.JLabel lbl_salarioB;
    private javax.swing.JLabel lbl_title_basedatosempleados;
    private javax.swing.JLabel lbl_title_ejercicio11;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txt_nomEmpleado;
    private javax.swing.JTextField txt_numhoras;
    private javax.swing.JTextField txt_salariobasico;
    // End of variables declaration//GEN-END:variables

}
