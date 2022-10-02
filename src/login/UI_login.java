
package login;

//@author Cristian_Marin

import java.awt.Color;
import Parte1.UIpart1;
import java.util.HashSet;
import java.util.Set;
import parte2.figurasGeometricas; 
public class UI_login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    
    
    
    public UI_login() {
        initComponents();
        this.setLocationRelativeTo(null);   //centrar panel en la pantalla
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_panel = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        panel_part1 = new javax.swing.JPanel();
        lbl_part1 = new javax.swing.JLabel();
        panel_part2 = new javax.swing.JPanel();
        lbl_part2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img_backgound = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg_panel.setBackground(new java.awt.Color(255, 255, 255));
        bg_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        bg_panel.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        panel_part1.setBackground(new java.awt.Color(142, 57, 70));
        panel_part1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_part1MouseEntered(evt);
            }
        });

        lbl_part1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbl_part1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_part1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_part1.setText("Parte 1");
        lbl_part1.setToolTipText("");
        lbl_part1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_part1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_part1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_part1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_part1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_part1Layout = new javax.swing.GroupLayout(panel_part1);
        panel_part1.setLayout(panel_part1Layout);
        panel_part1Layout.setHorizontalGroup(
            panel_part1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_part1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_part1Layout.setVerticalGroup(
            panel_part1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_part1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg_panel.add(panel_part1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 130, 50));

        panel_part2.setBackground(new java.awt.Color(142, 57, 70));
        panel_part2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_part2MouseEntered(evt);
            }
        });

        lbl_part2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lbl_part2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_part2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_part2.setText("Parte 2");
        lbl_part2.setToolTipText("");
        lbl_part2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_part2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_part2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_part2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_part2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_part2Layout = new javax.swing.GroupLayout(panel_part2);
        panel_part2.setLayout(panel_part2Layout);
        panel_part2Layout.setHorizontalGroup(
            panel_part2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_part2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_part2Layout.setVerticalGroup(
            panel_part2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_part2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg_panel.add(panel_part2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 130, 50));

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        bg_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 230));

        img_backgound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edificio41.png"))); // NOI18N
        bg_panel.add(img_backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 200));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static boolean MostrarUIpart1 = false, MostrarfigurasGeometricas = false;
    
    
    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked
//new Color(142, 57, 70
    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
         exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142, 57, 70));
       // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void panel_part1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_part1MouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_part1MouseEntered

    private void lbl_part1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part1MouseExited
        panel_part1.setBackground(new Color(142, 57, 70));
        
    }//GEN-LAST:event_lbl_part1MouseExited

    private void lbl_part1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part1MouseEntered
        panel_part1.setBackground(new Color(111,45,54));
        
    }//GEN-LAST:event_lbl_part1MouseEntered

    private void lbl_part2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part2MouseEntered
        panel_part2.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_part2MouseEntered

    private void lbl_part2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part2MouseExited
        
        panel_part2.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_part2MouseExited

    private void panel_part2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_part2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_part2MouseEntered

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_barraUPMousePressed

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUPMouseDragged

    private void lbl_part1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part1MouseClicked

       UIpart1 parte1 = new UIpart1();
       //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
       if(MostrarUIpart1 == false){
           parte1.setVisible(true);
           MostrarUIpart1 = true;
       }
       
    }//GEN-LAST:event_lbl_part1MouseClicked

    private void lbl_part2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_part2MouseClicked
       figurasGeometricas geo = new figurasGeometricas();
       //condicional para verificar si la ventana esta abierta no pueda abrir se otra vez
       if(MostrarfigurasGeometricas == false){
           geo.setVisible(true);
           MostrarfigurasGeometricas = true;
       }
    }//GEN-LAST:event_lbl_part2MouseClicked

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel bg_panel;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel img_backgound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_part1;
    private javax.swing.JLabel lbl_part2;
    private javax.swing.JPanel panel_part1;
    private javax.swing.JPanel panel_part2;
    // End of variables declaration//GEN-END:variables

}
