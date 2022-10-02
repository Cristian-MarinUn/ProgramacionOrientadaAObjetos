
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio41;
import java.awt.Color;
import java.awt.event.KeyEvent;
public class ejercicio41 extends javax.swing.JFrame {
    int xMouse, yMouse;
    public ejercicio41() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_bourder = new javax.swing.JLabel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_title_ejercicio41 = new javax.swing.JLabel();
        lbl_ingresenum = new javax.swing.JLabel();
        txt_nums = new javax.swing.JTextField();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        panel_analizar = new javax.swing.JPanel();
        lbl_analizar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_print = new javax.swing.JLabel();
        lbl_ingresenum1 = new javax.swing.JLabel();
        lbl_ingresenum2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(211, 208, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 290));

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
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        lbl_title_ejercicio41.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio41.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio41.setText("Ejercicio 41");
        jPanel1.add(lbl_title_ejercicio41, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 146, -1));

        lbl_ingresenum.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lbl_ingresenum.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ingresenum.setText("Ingrese los numero en el cuadro de texto separados por una coma.");
        jPanel1.add(lbl_ingresenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 430, 40));

        txt_nums.setBackground(new java.awt.Color(255, 255, 255));
        txt_nums.setForeground(new java.awt.Color(0, 0, 0));
        txt_nums.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_nums.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nums.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_numsMousePressed(evt);
            }
        });
        txt_nums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numsActionPerformed(evt);
            }
        });
        txt_nums.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numsKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nums, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 180, 20));

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
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_borrarLayout.setVerticalGroup(
            panel_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        panel_analizar.setBackground(new java.awt.Color(142, 57, 70));
        panel_analizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_analizarMouseEntered(evt);
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

        javax.swing.GroupLayout panel_analizarLayout = new javax.swing.GroupLayout(panel_analizar);
        panel_analizar.setLayout(panel_analizarLayout);
        panel_analizarLayout.setHorizontalGroup(
            panel_analizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_analizarLayout.setVerticalGroup(
            panel_analizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 380, 10));

        lbl_print.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lbl_print.setForeground(new java.awt.Color(0, 0, 0));
        lbl_print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 40));

        lbl_ingresenum1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_ingresenum1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ingresenum1.setText("Ingrese números enteros:");
        jPanel1.add(lbl_ingresenum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 30));

        lbl_ingresenum2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lbl_ingresenum2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ingresenum2.setText("El numero mayor ");
        jPanel1.add(lbl_ingresenum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        Mejercicio41 = false;   // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();         //esta ventana se cierra

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

    private void txt_numsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numsMousePressed

    }//GEN-LAST:event_txt_numsMousePressed

    private void txt_numsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numsActionPerformed

    }//GEN-LAST:event_txt_numsActionPerformed

    private void lbl_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseClicked
       
        String cadena;
        cadena = txt_nums.getText();
        
        String[] lista = cadena.split(",");
        
        int[] pasos = new int[lista.length];
        for(int i=0;i < lista.length ;i++){
            
           pasos[i] = Integer.parseInt(lista[i]);     
        }
        int mayor=0;          
        for(int i=0;i < lista.length ;i++){
           
        if(mayor < pasos[i]){
            
            mayor=pasos[i];
            
        }}
        
        lbl_print.setText(Integer.toString(mayor));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_lbl_analizarMouseClicked

    private void lbl_analizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseEntered
        panel_analizar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_analizarMouseEntered

    private void lbl_analizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseExited
        panel_analizar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_analizarMouseExited

    private void panel_analizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_analizarMouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_analizarMouseEntered

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txt_nums.setText("");

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

    private void txt_numsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numsKeyTyped
        //obliga a solo escribir numero y comas en la caja de texto
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != ',')) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txt_numsKeyTyped

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio41().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_analizar;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_ingresenum;
    private javax.swing.JLabel lbl_ingresenum1;
    private javax.swing.JLabel lbl_ingresenum2;
    private javax.swing.JLabel lbl_print;
    private javax.swing.JLabel lbl_title_ejercicio41;
    private javax.swing.JPanel panel_analizar;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JTextField txt_nums;
    // End of variables declaration//GEN-END:variables

}
