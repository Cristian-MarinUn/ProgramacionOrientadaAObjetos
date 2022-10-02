

package parte2;

//@author Cristian_Marin
import login.UI_login; 
import java.awt.Color;
import java.awt.event.KeyEvent;
import static login.UI_login.MostrarfigurasGeometricas;
import zCodeEjerciciosPart2.Círculo;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import zCodeEjerciciosPart2.Cuadrado;
import zCodeEjerciciosPart2.Rectángulo;
import zCodeEjerciciosPart2.TriánguloRectángulo;
import zCodeEjerciciosPart2.Rombo;
import zCodeEjerciciosPart2.Trapecio;

public class figurasGeometricas extends javax.swing.JFrame {
    int xMouse, yMouse; 
    DecimalFormat Fdeci =new DecimalFormat("#.00");
    public figurasGeometricas() {
        initComponents();
        this.setLocation(700,200);   //centrar panel en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_backgroud = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        panel_back = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        lbl_title_efigurasGeo = new javax.swing.JLabel();
        lbl_valorLado = new javax.swing.JLabel();
        txt_alturaRectangulo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_valorLado1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_valorLado2 = new javax.swing.JLabel();
        lbl_valorLado3 = new javax.swing.JLabel();
        lbl_valorLado5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lbl_ladoM = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_valorLado7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        lbl_valorLado8 = new javax.swing.JLabel();
        panel_calcular = new javax.swing.JPanel();
        lbl_calcular = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        lbl_cm = new javax.swing.JLabel();
        lbl_cm1 = new javax.swing.JLabel();
        lbl_cm2 = new javax.swing.JLabel();
        lbl_cm3 = new javax.swing.JLabel();
        lbl_cm5 = new javax.swing.JLabel();
        lbl_cm7 = new javax.swing.JLabel();
        lbl_cm8 = new javax.swing.JLabel();
        lbl_area = new javax.swing.JLabel();
        txt_radio = new javax.swing.JTextField();
        txt_areaCirculo = new javax.swing.JTextField();
        lbl_perimetro = new javax.swing.JLabel();
        txt_perimCirculo = new javax.swing.JTextField();
        lbl_areaRectangulo = new javax.swing.JLabel();
        txt_arearectangulo = new javax.swing.JTextField();
        lbl_perimetrorectangulo = new javax.swing.JLabel();
        txt_perimrRectangulo = new javax.swing.JTextField();
        lbl_areacuadrado = new javax.swing.JLabel();
        txt_areacuadrado = new javax.swing.JTextField();
        lbl_perimetrocuadrado = new javax.swing.JLabel();
        txt_perimetrocuadrado = new javax.swing.JTextField();
        lbl_areacuadrado1 = new javax.swing.JLabel();
        txt_areaetrotriangu = new javax.swing.JTextField();
        lbl_perimetrocuadrado1 = new javax.swing.JLabel();
        txt_perimetrotriangulo = new javax.swing.JTextField();
        txt_areaRombo = new javax.swing.JTextField();
        lbl_areaRombo = new javax.swing.JLabel();
        txt_perimetroRombo = new javax.swing.JTextField();
        lbl_perimetrorombo = new javax.swing.JLabel();
        lbl_tipoTriangulo = new javax.swing.JLabel();
        lbl_areaTrapecio = new javax.swing.JLabel();
        txt_areaTrapecio = new javax.swing.JTextField();
        txt_perimetroTrapecio = new javax.swing.JTextField();
        lbl_perimetroTrapecio = new javax.swing.JLabel();
        img_circulo = new javax.swing.JLabel();
        img_circulo1 = new javax.swing.JLabel();
        img_circulo2 = new javax.swing.JLabel();
        img_rectangulo = new javax.swing.JLabel();
        lbl_valorLado4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_cm6 = new javax.swing.JLabel();
        lbl_valorLado9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lbl_cm9 = new javax.swing.JLabel();
        img_circulo4 = new javax.swing.JLabel();
        img_circulo5 = new javax.swing.JLabel();
        lbl_valorLado10 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lbl_cm10 = new javax.swing.JLabel();
        lbl_valorLado11 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        lbl_cm11 = new javax.swing.JLabel();
        lbl_valorLado12 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        lbl_cm12 = new javax.swing.JLabel();
        txt_baseRectangulo = new javax.swing.JTextField();
        txt_ladoCuadrado = new javax.swing.JTextField();
        lbl_cm13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_lado2 = new javax.swing.JTextField();
        txt_basetrian = new javax.swing.JTextField();
        txt_lado1 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        lbl_ladoM1 = new javax.swing.JLabel();
        lbl_cm14 = new javax.swing.JLabel();
        txt_ladoM = new javax.swing.JTextField();
        txt_ladom = new javax.swing.JTextField();
        txt_alturaTrapecio = new javax.swing.JTextField();
        txt_ladoD = new javax.swing.JTextField();
        txt_ladoA = new javax.swing.JTextField();
        txt_ladoB = new javax.swing.JTextField();
        txt_ladoC = new javax.swing.JTextField();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        panel_backgroud.setBackground(new java.awt.Color(255, 255, 255));
        panel_backgroud.setMinimumSize(new java.awt.Dimension(880, 562));
        panel_backgroud.setPreferredSize(new java.awt.Dimension(880, 562));
        panel_backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGroup(exitLayout.createSequentialGroup()
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraUPLayout.createSequentialGroup()
                .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraUPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panel_backgroud.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        lbl_title_efigurasGeo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_efigurasGeo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_efigurasGeo.setText("Figuras geometricas");
        panel_backgroud.add(lbl_title_efigurasGeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 240, 30));

        lbl_valorLado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado.setText("Radio:");
        panel_backgroud.add(lbl_valorLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        txt_alturaRectangulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_alturaRectangulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_alturaRectangulo.setForeground(new java.awt.Color(0, 0, 0));
        txt_alturaRectangulo.setBorder(null);
        txt_alturaRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_alturaRectanguloMousePressed(evt);
            }
        });
        txt_alturaRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alturaRectanguloActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_alturaRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 60, 20));
        panel_backgroud.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, 20));

        lbl_valorLado1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado1.setText("Base:");
        panel_backgroud.add(lbl_valorLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 30));
        panel_backgroud.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 60, 10));
        panel_backgroud.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 60, 10));

        lbl_valorLado2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado2.setText("Altura:");
        panel_backgroud.add(lbl_valorLado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 30));

        lbl_valorLado3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado3.setText("Lado:");
        panel_backgroud.add(lbl_valorLado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, 30));

        lbl_valorLado5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado5.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado5.setText("Base:");
        panel_backgroud.add(lbl_valorLado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, 30));
        panel_backgroud.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 60, 10));

        lbl_ladoM.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_ladoM.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ladoM.setText("Lado mayor:");
        panel_backgroud.add(lbl_ladoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 30));
        panel_backgroud.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 60, 20));

        lbl_valorLado7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado7.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado7.setText("Lado a:");
        panel_backgroud.add(lbl_valorLado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 30));
        panel_backgroud.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 60, 10));
        panel_backgroud.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, 10));

        lbl_valorLado8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado8.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado8.setText("Altura:");
        panel_backgroud.add(lbl_valorLado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, 30));

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
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_calcularLayout.setVerticalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_backgroud.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 90, 40));

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

        panel_backgroud.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 70, 40));

        lbl_cm.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm.setText("cm");
        panel_backgroud.add(lbl_cm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        lbl_cm1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm1.setText("cm");
        panel_backgroud.add(lbl_cm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        lbl_cm2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm2.setText("cm");
        panel_backgroud.add(lbl_cm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        lbl_cm3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm3.setText("cm");
        panel_backgroud.add(lbl_cm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        lbl_cm5.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm5.setText("cm");
        panel_backgroud.add(lbl_cm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        lbl_cm7.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm7.setText("cm");
        panel_backgroud.add(lbl_cm7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        lbl_cm8.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm8.setText("cm");
        panel_backgroud.add(lbl_cm8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        lbl_area.setForeground(new java.awt.Color(0, 0, 0));
        lbl_area.setText("Area:");
        panel_backgroud.add(lbl_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 40, -1));

        txt_radio.setBackground(new java.awt.Color(255, 255, 255));
        txt_radio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_radio.setForeground(new java.awt.Color(204, 204, 204));
        txt_radio.setBorder(null);
        txt_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_radioMousePressed(evt);
            }
        });
        txt_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_radioActionPerformed(evt);
            }
        });
        txt_radio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_radioKeyTyped(evt);
            }
        });
        panel_backgroud.add(txt_radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 60, 20));

        txt_areaCirculo.setBackground(new java.awt.Color(255, 255, 255));
        txt_areaCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_areaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areaCirculoActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_areaCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, -1));

        lbl_perimetro.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetro.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 60, -1));

        txt_perimCirculo.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimCirculoActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, -1));

        lbl_areaRectangulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_areaRectangulo.setText("Area:");
        panel_backgroud.add(lbl_areaRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 40, -1));

        txt_arearectangulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_arearectangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_arearectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arearectanguloActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_arearectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 40, -1));

        lbl_perimetrorectangulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetrorectangulo.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetrorectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 60, -1));

        txt_perimrRectangulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimrRectangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimrRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimrRectanguloActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimrRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 40, -1));

        lbl_areacuadrado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_areacuadrado.setText("Area:");
        panel_backgroud.add(lbl_areacuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 40, -1));

        txt_areacuadrado.setBackground(new java.awt.Color(255, 255, 255));
        txt_areacuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_areacuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areacuadradoActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_areacuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 40, -1));

        lbl_perimetrocuadrado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetrocuadrado.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetrocuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 60, -1));

        txt_perimetrocuadrado.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimetrocuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimetrocuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimetrocuadradoActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimetrocuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 40, -1));

        lbl_areacuadrado1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_areacuadrado1.setText("Area:");
        panel_backgroud.add(lbl_areacuadrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 40, -1));

        txt_areaetrotriangu.setBackground(new java.awt.Color(255, 255, 255));
        txt_areaetrotriangu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_areaetrotriangu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areaetrotrianguActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_areaetrotriangu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 40, -1));

        lbl_perimetrocuadrado1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetrocuadrado1.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetrocuadrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 60, -1));

        txt_perimetrotriangulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimetrotriangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimetrotriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimetrotrianguloActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimetrotriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 40, -1));

        txt_areaRombo.setBackground(new java.awt.Color(255, 255, 255));
        txt_areaRombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_areaRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areaRomboActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_areaRombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 40, -1));

        lbl_areaRombo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_areaRombo.setText("Area:");
        panel_backgroud.add(lbl_areaRombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 40, -1));

        txt_perimetroRombo.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimetroRombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimetroRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimetroRomboActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimetroRombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 40, -1));

        lbl_perimetrorombo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetrorombo.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetrorombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 60, -1));

        lbl_tipoTriangulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tipoTriangulo.setText("tipo triangulo");
        panel_backgroud.add(lbl_tipoTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 80, -1));

        lbl_areaTrapecio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_areaTrapecio.setText("Area:");
        panel_backgroud.add(lbl_areaTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 40, -1));

        txt_areaTrapecio.setBackground(new java.awt.Color(255, 255, 255));
        txt_areaTrapecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_areaTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_areaTrapecioActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_areaTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 40, -1));

        txt_perimetroTrapecio.setBackground(new java.awt.Color(255, 255, 255));
        txt_perimetroTrapecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_perimetroTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_perimetroTrapecioActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_perimetroTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 40, -1));

        lbl_perimetroTrapecio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_perimetroTrapecio.setText("Perimetro:");
        panel_backgroud.add(lbl_perimetroTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 60, -1));

        img_circulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/triangulo_px.png"))); // NOI18N
        img_circulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_circulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 190, 150));

        img_circulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_circulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ciculo_px.png"))); // NOI18N
        img_circulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_circulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 150));

        img_circulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_circulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuadrado_px.png"))); // NOI18N
        img_circulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_circulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 190, 150));

        img_rectangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangulo_px.png"))); // NOI18N
        img_rectangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_rectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 150));

        lbl_valorLado4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado4.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado4.setText("Lado 1:");
        panel_backgroud.add(lbl_valorLado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, 30));
        panel_backgroud.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 60, 10));

        lbl_cm6.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm6.setText("cm");
        panel_backgroud.add(lbl_cm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        lbl_valorLado9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado9.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado9.setText("Lado 2:");
        panel_backgroud.add(lbl_valorLado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, 30));
        panel_backgroud.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 60, 20));

        lbl_cm9.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm9.setText("cm");
        panel_backgroud.add(lbl_cm9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        img_circulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_circulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rombo_px.png"))); // NOI18N
        img_circulo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_circulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 150));

        img_circulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_circulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trapecio_px.png"))); // NOI18N
        img_circulo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_backgroud.add(img_circulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 190, 150));

        lbl_valorLado10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado10.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado10.setText("Lado b:");
        panel_backgroud.add(lbl_valorLado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 30));
        panel_backgroud.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 60, 10));

        lbl_cm10.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm10.setText("cm");
        panel_backgroud.add(lbl_cm10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        lbl_valorLado11.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado11.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado11.setText("Lado c:");
        panel_backgroud.add(lbl_valorLado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 30));
        panel_backgroud.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 60, 20));

        lbl_cm11.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm11.setText("cm");
        panel_backgroud.add(lbl_cm11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        lbl_valorLado12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado12.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado12.setText("Lado d:");
        panel_backgroud.add(lbl_valorLado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, 30));
        panel_backgroud.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 60, 20));

        lbl_cm12.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm12.setText("cm");
        panel_backgroud.add(lbl_cm12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        txt_baseRectangulo.setBackground(new java.awt.Color(255, 255, 255));
        txt_baseRectangulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_baseRectangulo.setForeground(new java.awt.Color(0, 0, 0));
        txt_baseRectangulo.setBorder(null);
        txt_baseRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_baseRectanguloMousePressed(evt);
            }
        });
        txt_baseRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_baseRectanguloActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_baseRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 20));

        txt_ladoCuadrado.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoCuadrado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoCuadrado.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoCuadrado.setBorder(null);
        txt_ladoCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoCuadradoMousePressed(evt);
            }
        });
        txt_ladoCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoCuadradoActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, 20));

        lbl_cm13.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm13.setText("cm");
        panel_backgroud.add(lbl_cm13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));
        panel_backgroud.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 60, 20));

        txt_lado2.setBackground(new java.awt.Color(255, 255, 255));
        txt_lado2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_lado2.setForeground(new java.awt.Color(0, 0, 0));
        txt_lado2.setBorder(null);
        txt_lado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_lado2MousePressed(evt);
            }
        });
        txt_lado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lado2ActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_lado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 60, 20));

        txt_basetrian.setBackground(new java.awt.Color(255, 255, 255));
        txt_basetrian.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_basetrian.setForeground(new java.awt.Color(0, 0, 0));
        txt_basetrian.setBorder(null);
        txt_basetrian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_basetrianMousePressed(evt);
            }
        });
        txt_basetrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_basetrianActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_basetrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 60, 20));

        txt_lado1.setBackground(new java.awt.Color(255, 255, 255));
        txt_lado1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_lado1.setForeground(new java.awt.Color(0, 0, 0));
        txt_lado1.setBorder(null);
        txt_lado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_lado1MousePressed(evt);
            }
        });
        txt_lado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lado1ActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_lado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 60, 20));
        panel_backgroud.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 60, 20));

        lbl_ladoM1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_ladoM1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ladoM1.setText("Lado menor:");
        panel_backgroud.add(lbl_ladoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 30));

        lbl_cm14.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cm14.setText("cm");
        panel_backgroud.add(lbl_cm14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, -1));

        txt_ladoM.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoM.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoM.setBorder(null);
        txt_ladoM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoMMousePressed(evt);
            }
        });
        txt_ladoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoMActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 60, 20));

        txt_ladom.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladom.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladom.setBorder(null);
        txt_ladom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladomMousePressed(evt);
            }
        });
        txt_ladom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladomActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 60, 20));

        txt_alturaTrapecio.setBackground(new java.awt.Color(255, 255, 255));
        txt_alturaTrapecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_alturaTrapecio.setForeground(new java.awt.Color(0, 0, 0));
        txt_alturaTrapecio.setBorder(null);
        txt_alturaTrapecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_alturaTrapecioMousePressed(evt);
            }
        });
        txt_alturaTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alturaTrapecioActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_alturaTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 60, 20));

        txt_ladoD.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoD.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoD.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoD.setBorder(null);
        txt_ladoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoDMousePressed(evt);
            }
        });
        txt_ladoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoDActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 60, 20));

        txt_ladoA.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoA.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoA.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoA.setBorder(null);
        txt_ladoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoAMousePressed(evt);
            }
        });
        txt_ladoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoAActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 60, 20));

        txt_ladoB.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoB.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoB.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoB.setBorder(null);
        txt_ladoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoBMousePressed(evt);
            }
        });
        txt_ladoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoBActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 60, 20));

        txt_ladoC.setBackground(new java.awt.Color(255, 255, 255));
        txt_ladoC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_ladoC.setForeground(new java.awt.Color(0, 0, 0));
        txt_ladoC.setBorder(null);
        txt_ladoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoCMousePressed(evt);
            }
        });
        txt_ladoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoCActionPerformed(evt);
            }
        });
        panel_backgroud.add(txt_ladoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 60, 20));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_backgroud.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);            //se cierra el programa

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

    private void txt_alturaRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alturaRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alturaRectanguloActionPerformed

    private void lbl_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseClicked
        //ejecucion de la clase 
        //circulo
       // Try{
         double radio;
        String Area,Perimetro;
        radio = Double.parseDouble(txt_radio.getText());
        
        Area = String.valueOf(Fdeci.format(Círculo.circuloArea(radio)));
        Perimetro = String.valueOf(Fdeci.format(Círculo.CirculoPerimetro(radio)));
        
        
        txt_areaCirculo.setText(Area);
        txt_perimCirculo.setText(Perimetro);
       // }
        //catch(){
       //         }
       
        
        //Rectangulo
        double baseR,alturaR;
        String AreaRe;
        String PerimetroRe;
        
        alturaR = Double.parseDouble(txt_alturaRectangulo.getText());
        baseR = Integer.parseInt(txt_baseRectangulo.getText());
        AreaRe = String.valueOf(Fdeci.format(Rectángulo.rectanArea(baseR, alturaR)));
        PerimetroRe = String.valueOf(Fdeci.format(Rectángulo.rectanperimetro(baseR, alturaR))); 
        
        txt_arearectangulo.setText(AreaRe);
        txt_perimrRectangulo.setText(PerimetroRe);
        
        //Cuadrado
        double ladoC;
        String AreaC,PerimetroC;
        ladoC = Double.parseDouble(txt_ladoCuadrado.getText());
       
        
        AreaC = String.valueOf(Fdeci.format(Cuadrado.cuadradonArea(ladoC)));
        PerimetroC = String.valueOf(Fdeci.format(Cuadrado.cuadradonperimetro(ladoC)));
        
        txt_areacuadrado.setText(AreaC);
        txt_perimetrocuadrado.setText(PerimetroC);
        
        //Triangulo
        double baseT,alturaT;
        String AreaT,PerimetroT,hipotenusaT;
        baseT = Double.parseDouble(txt_basetrian.getText());
        alturaT = Double.parseDouble(txt_lado1.getText());
        
        AreaT = String.valueOf(Fdeci.format(TriánguloRectángulo.trianArea(baseT,alturaT)));
        PerimetroT = String.valueOf(Fdeci.format(TriánguloRectángulo.trianperimetro(baseT,alturaT)));
        hipotenusaT =String.valueOf(Fdeci.format(TriánguloRectángulo.trianHipo(baseT, alturaT)));
        
        txt_areaetrotriangu.setText(AreaT);
        txt_perimetrotriangulo.setText(PerimetroT);
        
        
        //Rombo
        double ladoM,ladom;
        String AreaRO,PerimetroRO;
        ladoM = Double.parseDouble(txt_ladoM.getText());
        ladom = Double.parseDouble(txt_ladom.getText());
        
        AreaRO = String.valueOf(Fdeci.format(Rombo.RomboArea(ladoM,ladom)));
        PerimetroRO = String.valueOf(Fdeci.format(Rombo.Romboperimetro(ladoM,ladom)));
        
    
        txt_areaRombo.setText(AreaRO);
        txt_perimetroRombo.setText(PerimetroRO);
        
        
        //Trapecio
        double a,b,c,d, alturaTr;
        String AreaTr,PerimetroTr;
        alturaTr = Integer.parseInt(txt_alturaTrapecio.getText());
        a = Double.parseDouble(txt_ladoA.getText());
        b = Double.parseDouble(txt_ladoB.getText());
        c = Double.parseDouble(txt_ladoC.getText());
        d = Double.parseDouble(txt_ladoD.getText());
        
        AreaTr = String.valueOf(Fdeci.format(Trapecio.TrapecioArea(alturaTr,a,c)));
        PerimetroTr = String.valueOf(Fdeci.format(Trapecio.Trapecioperimetro(b, a, c, d)));
        
    
        txt_areaTrapecio.setText(AreaTr);
        txt_perimetroTrapecio.setText(PerimetroTr);
        
        
        
        
        
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
        //borra las cajas de texto
        
        JTextField TxtMenssage;
        for(int i=0;i< panel_backgroud.getComponentCount();i++){
            
            if(panel_backgroud.getComponent(i).getClass().getName().equals("javax.swing.JTextField"))
            {
                TxtMenssage = (JTextField)panel_backgroud.getComponent(i);
                TxtMenssage.setText("");
            }
        }
        txt_alturaRectangulo.setText("");   
        
        
        

    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        panel_borrar.setBackground(new Color(111,45,54));       // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        panel_borrar.setBackground(new Color(142, 57, 70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void panel_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_borrarMouseEntered

    }//GEN-LAST:event_panel_borrarMouseEntered

    private void txt_alturaRectanguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_alturaRectanguloMousePressed
        txt_alturaRectangulo.setText("");
    }//GEN-LAST:event_txt_alturaRectanguloMousePressed

    private void txt_radioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_radioMousePressed
        txt_radio.setText("");
        txt_radio.setForeground(Color.black);
    }//GEN-LAST:event_txt_radioMousePressed

    private void txt_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_radioActionPerformed
        
    }//GEN-LAST:event_txt_radioActionPerformed

    private void txt_areaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areaCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areaCirculoActionPerformed

    private void txt_perimCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimCirculoActionPerformed

    private void txt_arearectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arearectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arearectanguloActionPerformed

    private void txt_perimrRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimrRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimrRectanguloActionPerformed

    private void txt_areacuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areacuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areacuadradoActionPerformed

    private void txt_perimetrocuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimetrocuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimetrocuadradoActionPerformed

    private void txt_areaetrotrianguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areaetrotrianguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areaetrotrianguActionPerformed

    private void txt_perimetrotrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimetrotrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimetrotrianguloActionPerformed

    private void txt_areaRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areaRomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areaRomboActionPerformed

    private void txt_perimetroRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimetroRomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimetroRomboActionPerformed

    private void txt_areaTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_areaTrapecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_areaTrapecioActionPerformed

    private void txt_perimetroTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_perimetroTrapecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_perimetroTrapecioActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       //regresa a la ventana de login y esta se cierra
       MostrarfigurasGeometricas = false; // regresa el valor a false para poder volver a abrir la ventana
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        panel_back.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        panel_back.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_backMouseExited

    private void txt_baseRectanguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_baseRectanguloMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baseRectanguloMousePressed

    private void txt_baseRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_baseRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baseRectanguloActionPerformed

    private void txt_ladoCuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoCuadradoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoCuadradoMousePressed

    private void txt_ladoCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoCuadradoActionPerformed

    private void txt_lado2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_lado2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lado2MousePressed

    private void txt_lado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lado2ActionPerformed

    private void txt_basetrianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_basetrianMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_basetrianMousePressed

    private void txt_basetrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_basetrianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_basetrianActionPerformed

    private void txt_lado1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_lado1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lado1MousePressed

    private void txt_lado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lado1ActionPerformed

    private void txt_ladoMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoMMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoMMousePressed

    private void txt_ladoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoMActionPerformed

    private void txt_ladomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladomMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladomMousePressed

    private void txt_ladomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladomActionPerformed

    private void txt_alturaTrapecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_alturaTrapecioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alturaTrapecioMousePressed

    private void txt_alturaTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alturaTrapecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alturaTrapecioActionPerformed

    private void txt_ladoDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoDMousePressed

    private void txt_ladoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoDActionPerformed

    private void txt_ladoAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoAMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoAMousePressed

    private void txt_ladoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoAActionPerformed

    private void txt_ladoBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoBMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoBMousePressed

    private void txt_ladoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoBActionPerformed

    private void txt_ladoCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoCMousePressed

    private void txt_ladoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ladoCActionPerformed

    private void txt_radioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_radioKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '.' || txt_radio.getText().contains("."))) {
            
            evt.consume();
        }
        
        
        
        
    }//GEN-LAST:event_txt_radioKeyTyped

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(figurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(figurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(figurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(figurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new figurasGeometricas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel img_circulo;
    private javax.swing.JLabel img_circulo1;
    private javax.swing.JLabel img_circulo2;
    private javax.swing.JLabel img_circulo4;
    private javax.swing.JLabel img_circulo5;
    private javax.swing.JLabel img_rectangulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_area;
    private javax.swing.JLabel lbl_areaRectangulo;
    private javax.swing.JLabel lbl_areaRombo;
    private javax.swing.JLabel lbl_areaTrapecio;
    private javax.swing.JLabel lbl_areacuadrado;
    private javax.swing.JLabel lbl_areacuadrado1;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_calcular;
    private javax.swing.JLabel lbl_cm;
    private javax.swing.JLabel lbl_cm1;
    private javax.swing.JLabel lbl_cm10;
    private javax.swing.JLabel lbl_cm11;
    private javax.swing.JLabel lbl_cm12;
    private javax.swing.JLabel lbl_cm13;
    private javax.swing.JLabel lbl_cm14;
    private javax.swing.JLabel lbl_cm2;
    private javax.swing.JLabel lbl_cm3;
    private javax.swing.JLabel lbl_cm5;
    private javax.swing.JLabel lbl_cm6;
    private javax.swing.JLabel lbl_cm7;
    private javax.swing.JLabel lbl_cm8;
    private javax.swing.JLabel lbl_cm9;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_ladoM;
    private javax.swing.JLabel lbl_ladoM1;
    private javax.swing.JLabel lbl_perimetro;
    private javax.swing.JLabel lbl_perimetroTrapecio;
    private javax.swing.JLabel lbl_perimetrocuadrado;
    private javax.swing.JLabel lbl_perimetrocuadrado1;
    private javax.swing.JLabel lbl_perimetrorectangulo;
    private javax.swing.JLabel lbl_perimetrorombo;
    private javax.swing.JLabel lbl_tipoTriangulo;
    private javax.swing.JLabel lbl_title_efigurasGeo;
    private javax.swing.JLabel lbl_valorLado;
    private javax.swing.JLabel lbl_valorLado1;
    private javax.swing.JLabel lbl_valorLado10;
    private javax.swing.JLabel lbl_valorLado11;
    private javax.swing.JLabel lbl_valorLado12;
    private javax.swing.JLabel lbl_valorLado2;
    private javax.swing.JLabel lbl_valorLado3;
    private javax.swing.JLabel lbl_valorLado4;
    private javax.swing.JLabel lbl_valorLado5;
    private javax.swing.JLabel lbl_valorLado7;
    private javax.swing.JLabel lbl_valorLado8;
    private javax.swing.JLabel lbl_valorLado9;
    private javax.swing.JPanel panel_back;
    private javax.swing.JPanel panel_backgroud;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txt_alturaRectangulo;
    private javax.swing.JTextField txt_alturaTrapecio;
    private javax.swing.JTextField txt_areaCirculo;
    private javax.swing.JTextField txt_areaRombo;
    private javax.swing.JTextField txt_areaTrapecio;
    private javax.swing.JTextField txt_areacuadrado;
    private javax.swing.JTextField txt_areaetrotriangu;
    private javax.swing.JTextField txt_arearectangulo;
    private javax.swing.JTextField txt_baseRectangulo;
    private javax.swing.JTextField txt_basetrian;
    private javax.swing.JTextField txt_lado1;
    private javax.swing.JTextField txt_lado2;
    private javax.swing.JTextField txt_ladoA;
    private javax.swing.JTextField txt_ladoB;
    private javax.swing.JTextField txt_ladoC;
    private javax.swing.JTextField txt_ladoCuadrado;
    private javax.swing.JTextField txt_ladoD;
    private javax.swing.JTextField txt_ladoM;
    private javax.swing.JTextField txt_ladom;
    private javax.swing.JTextField txt_perimCirculo;
    private javax.swing.JTextField txt_perimetroRombo;
    private javax.swing.JTextField txt_perimetroTrapecio;
    private javax.swing.JTextField txt_perimetrocuadrado;
    private javax.swing.JTextField txt_perimetrotriangulo;
    private javax.swing.JTextField txt_perimrRectangulo;
    private javax.swing.JTextField txt_radio;
    // End of variables declaration//GEN-END:variables

}
