
package Parte1;

//@author Cristian_Marin
import static Parte1.UIpart1.Mejercicio18;
import java.awt.Color;
import javax.swing.JOptionPane;
import login.loginClass; 
import zCodeEjercicios.exercise18;


public class ejercicio18 extends javax.swing.JFrame {
    int xMouse, yMouse;
    public ejercicio18() {
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
        lbl_estrato1 = new javax.swing.JLabel();
        lbl_numinscripcion2 = new javax.swing.JLabel();
        txt_numinscripcion1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_nombre1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        panel_calcular1 = new javax.swing.JPanel();
        lbl_analizar1 = new javax.swing.JLabel();
        panel_borrar1 = new javax.swing.JPanel();
        lbl_borrar1 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_patrimonio1 = new javax.swing.JLabel();
        txt_patrimonio1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txt_estrato1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lbl_numinscripcion3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lbl_bourder1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        barraUP1 = new javax.swing.JPanel();
        exit1 = new javax.swing.JPanel();
        lbl_exit1 = new javax.swing.JLabel();
        lbl_title_ejercicio11 = new javax.swing.JLabel();
        lbl_estrato2 = new javax.swing.JLabel();
        lbl_numinscripcion4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txt_nombre = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        lbl_nombre2 = new javax.swing.JLabel();
        lbl_patrimonio2 = new javax.swing.JLabel();
        txt_numhorastrab = new javax.swing.JTextField();
        txt_valrohoras = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        lbl_numinscripcion5 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        lbl_estrato3 = new javax.swing.JLabel();
        panel_calcular = new javax.swing.JPanel();
        lbl_analizar = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        txt_retencion = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        lbl_bourder = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        lbl_estrato1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_estrato1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estrato1.setText("Ingrese el estrato: ");
        jPanel1.add(lbl_estrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lbl_numinscripcion2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion2.setText("Liquidacion pago de matrícula");
        jPanel1.add(lbl_numinscripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        txt_numinscripcion1.setBackground(new java.awt.Color(255, 255, 255));
        txt_numinscripcion1.setForeground(new java.awt.Color(204, 204, 204));
        txt_numinscripcion1.setText("12345....");
        txt_numinscripcion1.setBorder(null);
        txt_numinscripcion1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_numinscripcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_numinscripcion1MousePressed(evt);
            }
        });
        txt_numinscripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numinscripcion1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_numinscripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 20));

        txt_nombre1.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre1.setForeground(new java.awt.Color(204, 204, 204));
        txt_nombre1.setText("nombre");
        txt_nombre1.setBorder(null);
        txt_nombre1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombre1MousePressed(evt);
            }
        });
        txt_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, 20));

        panel_calcular1.setBackground(new java.awt.Color(142, 57, 70));
        panel_calcular1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_calcular1MouseEntered(evt);
            }
        });

        lbl_analizar1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_analizar1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_analizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_analizar1.setText("Analizar");
        lbl_analizar1.setToolTipText("");
        lbl_analizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_analizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_analizar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_analizar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_analizar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_calcular1Layout = new javax.swing.GroupLayout(panel_calcular1);
        panel_calcular1.setLayout(panel_calcular1Layout);
        panel_calcular1Layout.setHorizontalGroup(
            panel_calcular1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_calcular1Layout.setVerticalGroup(
            panel_calcular1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_analizar1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_calcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 40));

        panel_borrar1.setBackground(new java.awt.Color(142, 57, 70));
        panel_borrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_borrar1MouseEntered(evt);
            }
        });

        lbl_borrar1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_borrar1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_borrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_borrar1.setText("Borrar");
        lbl_borrar1.setToolTipText("");
        lbl_borrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_borrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_borrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_borrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_borrar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_borrar1Layout = new javax.swing.GroupLayout(panel_borrar1);
        panel_borrar1.setLayout(panel_borrar1Layout);
        panel_borrar1Layout.setHorizontalGroup(
            panel_borrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_borrar1Layout.setVerticalGroup(
            panel_borrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panel_borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, 40));

        lbl_nombre1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_nombre1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre1.setText("Digite su nombre: ");
        jPanel1.add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_patrimonio1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_patrimonio1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_patrimonio1.setText("Ingrese su patrimonio: ");
        jPanel1.add(lbl_patrimonio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_patrimonio1.setBackground(new java.awt.Color(255, 255, 255));
        txt_patrimonio1.setForeground(new java.awt.Color(204, 204, 204));
        txt_patrimonio1.setText("$$$");
        txt_patrimonio1.setBorder(null);
        txt_patrimonio1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_patrimonio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_patrimonio1MousePressed(evt);
            }
        });
        txt_patrimonio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patrimonio1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_patrimonio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 100, 20));

        txt_estrato1.setBackground(new java.awt.Color(255, 255, 255));
        txt_estrato1.setForeground(new java.awt.Color(204, 204, 204));
        txt_estrato1.setText("1 - 6");
        txt_estrato1.setBorder(null);
        txt_estrato1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_estrato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_estrato1MousePressed(evt);
            }
        });
        txt_estrato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estrato1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_estrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 90, 20));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 100, 20));

        lbl_numinscripcion3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion3.setText("Digite su número de inscripción: ");
        jPanel1.add(lbl_numinscripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, 20));

        lbl_bourder1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 3));
        jPanel1.add(lbl_bourder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 410));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(211, 208, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        exit1.setBackground(new java.awt.Color(142, 57, 70));

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

        javax.swing.GroupLayout exit1Layout = new javax.swing.GroupLayout(exit1);
        exit1.setLayout(exit1Layout);
        exit1Layout.setHorizontalGroup(
            exit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exit1Layout.setVerticalGroup(
            exit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exit1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraUP1Layout = new javax.swing.GroupLayout(barraUP1);
        barraUP1.setLayout(barraUP1Layout);
        barraUP1Layout.setHorizontalGroup(
            barraUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraUP1Layout.createSequentialGroup()
                .addGap(0, 410, Short.MAX_VALUE)
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUP1Layout.setVerticalGroup(
            barraUP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUP1Layout.createSequentialGroup()
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(barraUP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 30));

        lbl_title_ejercicio11.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio11.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio11.setText("Ejercicio 18");
        jPanel2.add(lbl_title_ejercicio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 146, -1));

        lbl_estrato2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_estrato2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estrato2.setText("Retencion de la fuente: ");
        jPanel2.add(lbl_estrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lbl_numinscripcion4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion4.setText("Información de empleado");
        jPanel2.add(lbl_numinscripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 30));

        txt_codigo.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_codigo.setForeground(new java.awt.Color(0, 0, 0));
        txt_codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_codigo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_codigoMousePressed(evt);
            }
        });
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 100, 20));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 100, 20));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
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
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 100, 20));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 100, 20));

        lbl_nombre2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_nombre2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre2.setText("nombre:");
        jPanel2.add(lbl_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_patrimonio2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_patrimonio2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_patrimonio2.setText("numero de horas trabajadas al mes: ");
        jPanel2.add(lbl_patrimonio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txt_numhorastrab.setBackground(new java.awt.Color(255, 255, 255));
        txt_numhorastrab.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_numhorastrab.setForeground(new java.awt.Color(0, 0, 0));
        txt_numhorastrab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_numhorastrab.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_numhorastrab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_numhorastrabMousePressed(evt);
            }
        });
        txt_numhorastrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numhorastrabActionPerformed(evt);
            }
        });
        jPanel2.add(txt_numhorastrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, 20));

        txt_valrohoras.setBackground(new java.awt.Color(255, 255, 255));
        txt_valrohoras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_valrohoras.setForeground(new java.awt.Color(0, 0, 0));
        txt_valrohoras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_valrohoras.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_valrohoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_valrohorasMousePressed(evt);
            }
        });
        txt_valrohoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valrohorasActionPerformed(evt);
            }
        });
        jPanel2.add(txt_valrohoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 100, 20));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 20));

        lbl_numinscripcion5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_numinscripcion5.setForeground(new java.awt.Color(0, 0, 0));
        lbl_numinscripcion5.setText("Codigo:");
        jPanel2.add(lbl_numinscripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, 20));

        lbl_estrato3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_estrato3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estrato3.setText("Valor de horas:");
        jPanel2.add(lbl_estrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

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

        jPanel2.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

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

        jPanel2.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        txt_retencion.setBackground(new java.awt.Color(255, 255, 255));
        txt_retencion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_retencion.setForeground(new java.awt.Color(0, 0, 0));
        txt_retencion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_retencion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_retencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_retencionMousePressed(evt);
            }
        });
        txt_retencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_retencionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_retencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 20));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 100, 20));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 440));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizarMouseClicked
       String nombre, codigo, titles;
       titles = "Ejercicio18";
        try{
            codigo = txt_codigo.getText();
        nombre = txt_nombre.getText();
        
        double horas, vhora, porcentaje_retencion, salario_bruto, salario_neto;
        horas = Double.parseDouble(txt_numhorastrab.getText());
        vhora = Double.parseDouble(txt_valrohoras.getText());
        porcentaje_retencion = Double.parseDouble(txt_retencion.getText());
        salario_bruto = (exercise18.metodo_salario_bruto(horas, vhora));
        salario_neto = (exercise18.metodo_salario_neto(horas, vhora, porcentaje_retencion));
        
        JOptionPane.showMessageDialog(null, 
                ("Codigo: " + codigo +
                "\nNombre: " + nombre+ 
                "\nSalario bruto: " + salario_bruto +
                "\nSalario neto: " + salario_neto ),
                titles , JOptionPane.INFORMATION_MESSAGE );
        }
        catch(java.lang.NumberFormatException s){
            s.printStackTrace();
            JOptionPane.showMessageDialog(null, "hay valores erroneos", "Error de variable", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
       //JOptionPane.showInternalMessageDialog(rootPane, xMouse, titles, HEIGHT, icon);
        
        
        
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
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_numhorastrab.setText("");
        txt_valrohoras.setText("");
        txt_retencion.setText("");
        
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

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        
       // this.dispose();
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        //exit.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
      //  exit.setBackground(new Color(142, 57, 70));
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

    private void txt_numinscripcion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numinscripcion1MousePressed
        
    }//GEN-LAST:event_txt_numinscripcion1MousePressed

    private void txt_numinscripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numinscripcion1ActionPerformed

    }//GEN-LAST:event_txt_numinscripcion1ActionPerformed

    private void txt_nombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre1MousePressed
       
    }//GEN-LAST:event_txt_nombre1MousePressed

    private void txt_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre1ActionPerformed

    private void lbl_analizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizar1MouseClicked
        //al hacer clip ejecutara la interface UIpart1 y esta ventana se cerrara.
    }//GEN-LAST:event_lbl_analizar1MouseClicked

    private void lbl_analizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizar1MouseEntered
        panel_calcular.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_analizar1MouseEntered

    private void lbl_analizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_analizar1MouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_analizar1MouseExited

    private void panel_calcular1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcular1MouseEntered
        // panel_part1.setBackground(new Color(100,42, 50));
    }//GEN-LAST:event_panel_calcular1MouseEntered

    private void lbl_borrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrar1MouseClicked
        
    }//GEN-LAST:event_lbl_borrar1MouseClicked

    private void lbl_borrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrar1MouseEntered
        panel_borrar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_lbl_borrar1MouseEntered

    private void lbl_borrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrar1MouseExited
        panel_borrar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_lbl_borrar1MouseExited

    private void panel_borrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_borrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_borrar1MouseEntered

    private void txt_patrimonio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_patrimonio1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patrimonio1MousePressed

    private void txt_patrimonio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patrimonio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patrimonio1ActionPerformed

    private void txt_estrato1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_estrato1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estrato1MousePressed

    private void txt_estrato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estrato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estrato1ActionPerformed

    private void lbl_exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseClicked
        Mejercicio18 = false;   // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();      //esta ventana se cierra
    }//GEN-LAST:event_lbl_exit1MouseClicked

    private void lbl_exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseEntered
        exit1.setBackground(new Color(111,45,54));
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exit1MouseEntered

    private void lbl_exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit1MouseExited
        exit1.setBackground(new Color(142, 57, 70));
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

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
       
    }//GEN-LAST:event_txt_nombreMousePressed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_valrohorasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_valrohorasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valrohorasMousePressed

    private void txt_valrohorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valrohorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valrohorasActionPerformed

    private void txt_numhorastrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numhorastrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numhorastrabActionPerformed

    private void txt_numhorastrabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numhorastrabMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numhorastrabMousePressed

    private void txt_retencionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_retencionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_retencionMousePressed

    private void txt_retencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_retencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_retencionActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
       
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_codigoMousePressed

    }//GEN-LAST:event_txt_codigoMousePressed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel barraUP1;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel exit1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_analizar;
    private javax.swing.JLabel lbl_analizar1;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_borrar1;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_bourder1;
    private javax.swing.JLabel lbl_estrato1;
    private javax.swing.JLabel lbl_estrato2;
    private javax.swing.JLabel lbl_estrato3;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_exit1;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_nombre2;
    private javax.swing.JLabel lbl_numinscripcion2;
    private javax.swing.JLabel lbl_numinscripcion3;
    private javax.swing.JLabel lbl_numinscripcion4;
    private javax.swing.JLabel lbl_numinscripcion5;
    private javax.swing.JLabel lbl_patrimonio1;
    private javax.swing.JLabel lbl_patrimonio2;
    private javax.swing.JLabel lbl_title_ejercicio10;
    private javax.swing.JLabel lbl_title_ejercicio11;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_borrar1;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JPanel panel_calcular1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_estrato1;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextField txt_numhorastrab;
    private javax.swing.JTextField txt_numinscripcion1;
    private javax.swing.JTextField txt_patrimonio1;
    private javax.swing.JTextField txt_retencion;
    private javax.swing.JTextField txt_valrohoras;
    // End of variables declaration//GEN-END:variables

}
