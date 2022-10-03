
package Parte1;

//@author Cristian_Marin

import java.awt.Color;
import login.UI_login;
import static login.UI_login.MostrarUIpart1;
import java.text.DecimalFormat;
public class UIpart1 extends javax.swing.JFrame  {
    int xMouse, yMouse;
    
    
    
    public UIpart1() {
        initComponents();
        this.setLocation(100,200);   //centrar panel en la pantalla
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        panel_back = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lbl_title_parte1 = new javax.swing.JLabel();
        lbl_logoUnal = new javax.swing.JLabel();
        lbl_capitulo3 = new javax.swing.JLabel();
        panel_ejercicio18 = new javax.swing.JPanel();
        lbl_ejercicio18 = new javax.swing.JLabel();
        panel_ejercicio19 = new javax.swing.JPanel();
        lbl_ejercicio19 = new javax.swing.JLabel();
        lbl_capitulo4 = new javax.swing.JLabel();
        panel_ejercicio7 = new javax.swing.JPanel();
        lbl_ejercicio7 = new javax.swing.JLabel();
        panel_ejercicio10 = new javax.swing.JPanel();
        lbl_ejercicio10 = new javax.swing.JLabel();
        panel_ejercicio22 = new javax.swing.JPanel();
        lbl_ejercicio22 = new javax.swing.JLabel();
        panel_ejercicio23 = new javax.swing.JPanel();
        lbl_ejercicio23 = new javax.swing.JLabel();
        panel_ejercicio41 = new javax.swing.JPanel();
        lbl_ejercicio41 = new javax.swing.JLabel();
        panel_ejercicio40 = new javax.swing.JPanel();
        lbl_ejercicio40 = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(211, 208, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(lbl_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_back.setBackground(new java.awt.Color(142, 57, 70));

        back.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_backLayout = new javax.swing.GroupLayout(panel_back);
        panel_back.setLayout(panel_backLayout);
        panel_backLayout.setHorizontalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_backLayout.setVerticalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 570, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addGroup(barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        lbl_title_parte1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lbl_title_parte1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_parte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title_parte1.setText("Parte 1");
        jPanel1.add(lbl_title_parte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 140, 30));

        lbl_logoUnal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logoUnal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_unal_2.png"))); // NOI18N
        lbl_logoUnal.setText("logo");
        jPanel1.add(lbl_logoUnal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 70));

        lbl_capitulo3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_capitulo3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_capitulo3.setText("Capítulo 3: Estructura secuencial");
        jPanel1.add(lbl_capitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 30));

        panel_ejercicio18.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio18.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio18.setText("Ejercicio 18");
        lbl_ejercicio18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio18Layout = new javax.swing.GroupLayout(panel_ejercicio18);
        panel_ejercicio18.setLayout(panel_ejercicio18Layout);
        panel_ejercicio18Layout.setHorizontalGroup(
            panel_ejercicio18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio18, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio18Layout.setVerticalGroup(
            panel_ejercicio18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio18, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        panel_ejercicio19.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio19.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio19.setText("Ejercicio 19");
        lbl_ejercicio19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio19MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio19Layout = new javax.swing.GroupLayout(panel_ejercicio19);
        panel_ejercicio19.setLayout(panel_ejercicio19Layout);
        panel_ejercicio19Layout.setHorizontalGroup(
            panel_ejercicio19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio19, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio19Layout.setVerticalGroup(
            panel_ejercicio19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 30));

        lbl_capitulo4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_capitulo4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_capitulo4.setText("Capítulo 4: Estructura decisión lógica");
        jPanel1.add(lbl_capitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 390, 30));

        panel_ejercicio7.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio7.setText("Ejercicio 7");
        lbl_ejercicio7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_ejercicio7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio7Layout = new javax.swing.GroupLayout(panel_ejercicio7);
        panel_ejercicio7.setLayout(panel_ejercicio7Layout);
        panel_ejercicio7Layout.setHorizontalGroup(
            panel_ejercicio7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio7Layout.setVerticalGroup(
            panel_ejercicio7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 30));

        panel_ejercicio10.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio10.setText("Ejercicio 10");
        lbl_ejercicio10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio10Layout = new javax.swing.GroupLayout(panel_ejercicio10);
        panel_ejercicio10.setLayout(panel_ejercicio10Layout);
        panel_ejercicio10Layout.setHorizontalGroup(
            panel_ejercicio10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio10, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio10Layout.setVerticalGroup(
            panel_ejercicio10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 90, 30));

        panel_ejercicio22.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio22.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio22.setText("Ejercicio 22");
        lbl_ejercicio22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio22Layout = new javax.swing.GroupLayout(panel_ejercicio22);
        panel_ejercicio22.setLayout(panel_ejercicio22Layout);
        panel_ejercicio22Layout.setHorizontalGroup(
            panel_ejercicio22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio22, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio22Layout.setVerticalGroup(
            panel_ejercicio22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio22, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        panel_ejercicio23.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio23.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio23.setText("Ejercicio 23");
        lbl_ejercicio23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio23MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio23Layout = new javax.swing.GroupLayout(panel_ejercicio23);
        panel_ejercicio23.setLayout(panel_ejercicio23Layout);
        panel_ejercicio23Layout.setHorizontalGroup(
            panel_ejercicio23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio23, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio23Layout.setVerticalGroup(
            panel_ejercicio23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio23, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        panel_ejercicio41.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio41.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio41.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio41.setText("Ejercicio 41");
        lbl_ejercicio41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio41MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio41Layout = new javax.swing.GroupLayout(panel_ejercicio41);
        panel_ejercicio41.setLayout(panel_ejercicio41Layout);
        panel_ejercicio41Layout.setHorizontalGroup(
            panel_ejercicio41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio41, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio41Layout.setVerticalGroup(
            panel_ejercicio41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio41, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        panel_ejercicio40.setBackground(new java.awt.Color(142, 57, 70));
        panel_ejercicio40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_ejercicio40.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ejercicio40.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ejercicio40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ejercicio40.setText("Ejercicio 40");
        lbl_ejercicio40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ejercicio40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ejercicio40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ejercicio40MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_ejercicio40Layout = new javax.swing.GroupLayout(panel_ejercicio40);
        panel_ejercicio40.setLayout(panel_ejercicio40Layout);
        panel_ejercicio40Layout.setHorizontalGroup(
            panel_ejercicio40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio40, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        panel_ejercicio40Layout.setVerticalGroup(
            panel_ejercicio40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ejercicio40, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ejercicio40, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 360));

        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guayacan_rosado.png"))); // NOI18N
        jPanel1.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 260, 360));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 400, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean Mejercicio18 = false, Mejercicio19 = false,
            Mejercicio7 = false, Mejercicio10= false,
            Mejercicio22 = false, Mejercicio23 = false,
            Mejercicio40 = false, Mejercicio41 = false; 
    
    
    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
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

    private void lbl_ejercicio18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio18MouseEntered
         panel_ejercicio18.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio18MouseEntered

    private void lbl_ejercicio18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio18MouseExited
        panel_ejercicio18.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio18MouseExited

    private void lbl_ejercicio19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio19MouseEntered
        panel_ejercicio19.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio19MouseEntered

    private void lbl_ejercicio19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio19MouseExited
        panel_ejercicio19.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio19MouseExited

    private void lbl_ejercicio7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio7MouseEntered
        panel_ejercicio7.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio7MouseEntered

    private void lbl_ejercicio7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio7MouseExited
         panel_ejercicio7.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio7MouseExited

    private void lbl_ejercicio10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio10MouseEntered
       panel_ejercicio10.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio10MouseEntered

    private void lbl_ejercicio10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio10MouseExited
         panel_ejercicio10.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio10MouseExited

    private void lbl_ejercicio22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio22MouseEntered
        panel_ejercicio22.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio22MouseEntered

    private void lbl_ejercicio22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio22MouseExited
         panel_ejercicio22.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio22MouseExited

    private void lbl_ejercicio23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio23MouseEntered
        panel_ejercicio23.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio23MouseEntered

    private void lbl_ejercicio23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio23MouseExited
         panel_ejercicio23.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio23MouseExited

    private void lbl_ejercicio40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio40MouseEntered
       panel_ejercicio40.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio40MouseEntered

    private void lbl_ejercicio40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio40MouseExited
         panel_ejercicio40.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio40MouseExited

    private void lbl_ejercicio41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio41MouseEntered
        panel_ejercicio41.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_ejercicio41MouseEntered

    private void lbl_ejercicio41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio41MouseExited
         panel_ejercicio41.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_ejercicio41MouseExited

    private void lbl_ejercicio7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio7MouseClicked
         ejercicio7 ejer7 = new ejercicio7();
         //ejecuta el jframe ejercicio7
        if(Mejercicio7 == false){
           ejer7.setVisible(true);
           Mejercicio7 = true;
       }
    }//GEN-LAST:event_lbl_ejercicio7MouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        panel_back.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        panel_back.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_backMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       //regresa a la ventana de login y esta se cierra
       MostrarUIpart1 = false; // regresa el valor a false para poder volver a abrir la ventana
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void lbl_ejercicio40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio40MouseClicked
       //ejecuta el jframe ejercicio41
        ejercicio40 ejer40 = new ejercicio40();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
       if(Mejercicio40 == false){
           ejer40.setVisible(true);
           Mejercicio40 = true;
       }
    }//GEN-LAST:event_lbl_ejercicio40MouseClicked

    private void lbl_ejercicio23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio23MouseClicked
        //ejecuta el jframe ejercicio41
        ejercicio23 ejer23 = new ejercicio23();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
       if(Mejercicio23 == false){
           ejer23.setVisible(true);
           Mejercicio23 = true;
       }
    }//GEN-LAST:event_lbl_ejercicio23MouseClicked

    private void lbl_ejercicio22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio22MouseClicked
        //ejecuta el jframe ejercicio41
        ejercicio22 ejer22 = new ejercicio22();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
       if(Mejercicio22 == false){
           ejer22.setVisible(true);
           Mejercicio22 = true;
       }
    }//GEN-LAST:event_lbl_ejercicio22MouseClicked

    private void lbl_ejercicio10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio10MouseClicked
        //ejecuta el jframe ejercicio10
        ejercicio10 ejer10 = new ejercicio10();
        
        
        if(Mejercicio10 == false){
           ejer10.setVisible(true);
           Mejercicio10 = true;
        }   
    }//GEN-LAST:event_lbl_ejercicio10MouseClicked

    private void lbl_ejercicio41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio41MouseClicked
        //ejecuta el jframe ejercicio41
        ejercicio41 ejer41 = new ejercicio41();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
       if(Mejercicio41 == false){
           ejer41.setVisible(true);
           Mejercicio41 = true;
       }
    }//GEN-LAST:event_lbl_ejercicio41MouseClicked

    private void lbl_ejercicio18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio18MouseClicked
        ejercicio18 ejer18 = new ejercicio18();
        //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
        if(Mejercicio18 == false){
           ejer18.setVisible(true);
           Mejercicio18 = true;
       }
        
        
    }//GEN-LAST:event_lbl_ejercicio18MouseClicked

    private void lbl_ejercicio19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ejercicio19MouseClicked
         ejercicio19 ejer19 = new ejercicio19();
         
         //condicional para verificar si la ventana esta abierta no pueda abrir se otra ve
        if(Mejercicio19 == false){
           ejer19.setVisible(true);
           Mejercicio19 = true;
       }
        
    }//GEN-LAST:event_lbl_ejercicio19MouseClicked

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIpart1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIpart1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIpart1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIpart1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIpart1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_capitulo3;
    private javax.swing.JLabel lbl_capitulo4;
    private javax.swing.JLabel lbl_ejercicio10;
    private javax.swing.JLabel lbl_ejercicio18;
    private javax.swing.JLabel lbl_ejercicio19;
    private javax.swing.JLabel lbl_ejercicio22;
    private javax.swing.JLabel lbl_ejercicio23;
    private javax.swing.JLabel lbl_ejercicio40;
    private javax.swing.JLabel lbl_ejercicio41;
    private javax.swing.JLabel lbl_ejercicio7;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_logoUnal;
    private javax.swing.JLabel lbl_title_parte1;
    private javax.swing.JPanel panel_back;
    private javax.swing.JPanel panel_ejercicio10;
    private javax.swing.JPanel panel_ejercicio18;
    private javax.swing.JPanel panel_ejercicio19;
    private javax.swing.JPanel panel_ejercicio22;
    private javax.swing.JPanel panel_ejercicio23;
    private javax.swing.JPanel panel_ejercicio40;
    private javax.swing.JPanel panel_ejercicio41;
    private javax.swing.JPanel panel_ejercicio7;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
