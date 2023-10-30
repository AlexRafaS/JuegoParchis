/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package proyectoparchisprogramacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.text.Position;
import javax.swing.Timer;

public class juegoParchis extends javax.swing.JFrame {
    Random numRandom = new Random();
    int numAleatorio;
    boolean turno = false;
    int fichasIniciadas1 = 0;
    int fichasVerdesIniciadas = 0;
    int fichasEnCamino = 0;
    int fichasTerminadas = 0;
    int numJugador = 0;
    String nombreJugador;
    int posicionInicial;
    int numPasos;
    int recorrido = 12;
    int resultado = 0;
    
    ArrayList<Fichas> fichasVerdes =  new ArrayList<>();
    ArrayList<Fichas> fichasAzules =  new ArrayList<>();

    public juegoParchis() {
        initComponents();
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        if(turno == false){
            turno = true;
            jLabel16.setText("Jugador 1");
        }
        fichasVerdes.add(new Fichas( 200, 110, 0, 1, jLabel25));
        fichasVerdes.add(new Fichas( 100, 110, 0, 2, jLabel18));
        fichasVerdes.add(new Fichas( 150, 170, 0, 3, jLabel19));
        fichasVerdes.add(new Fichas( 150, 50, 0, 4, jLabel20));
        fichasAzules.add(new Fichas(640, 630, 0, 1, jLabel21));
        fichasAzules.add(new Fichas(540, 630, 0, 2, jLabel22));
        fichasAzules.add(new Fichas(590, 570, 0, 3, jLabel23));
        fichasAzules.add(new Fichas(590, 690, 0, 4, jLabel24));
    }
    
    public int numeroAleatorio(){
        numAleatorio = numRandom.nextInt(6)+1;
        return numAleatorio;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha verde parchis (2).png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha verde parchis (2).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha verde parchis (2).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 40, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha verde parchis (2).png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 40, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha azul parchis (1).png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 50, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha azul parchis (1).png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 50, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha azul parchis (1).png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 50, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha azul parchis (1).png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantilla azul Parchis.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 260, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantilla verde Parchis.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 250, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plantilla amarilla Parchis.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 280, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plantilla roja Parchis.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 260, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cuadros amarillos Juego Parchis.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 260, 260, 260));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cuadros Azules Juego Parchis.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuadros Verdes Juego Parchis.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cuadros rojos Juego Parchis.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, 260));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cuadros centrales Juego Parchis.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Blanco.jpg"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 420));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Blanco.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 420, 960, 380));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tirar Dados");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Turno:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mover");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sacar Ficha");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 290, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dado1 = numeroAleatorio();
        int dado2 = numeroAleatorio();
        resultado = dado1 + dado2;
        jLabel14.setText("TOTAL:  " + resultado);

	    String rutaImagenDado1 = "/Imagenes/dado"+dado1+".png";
        String rutaImagenDado2 = "/Imagenes/dado"+dado2+".png";
        ImageIcon imagenDado1 = new ImageIcon(getClass().getResource(rutaImagenDado1));
        ImageIcon imagenDado2 = new ImageIcon(getClass().getResource(rutaImagenDado2));
        jLabel12.setIcon(imagenDado1);
        jLabel13.setIcon(imagenDado2);

         if (dado1 == 6 || dado2 == 6 && fichasVerdesIniciadas == 0){
             jButton3.setVisible(true);
             jButton1.setVisible(false);
         }
         if(fichasVerdesIniciadas > 0){
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            //jButton1.setVisible(false);
            if((dado1 == 6 || dado2 == 6) && fichasVerdesIniciadas <= 4){
                jButton3.setVisible(true);
            }else{
                jButton3.setVisible(false);
            }
         }
         actualizarFichas();
        }
//GEN-LAST:event_jButton1ActionPerformed
    
    private void actualizarFichas(){
        Timer timer;
        timer = new Timer(100, e -> {
            for(Fichas ficha: fichasVerdes){
                if(ficha.posicionCuadro > 0){
                    PosicionesFicha1 posicion = new PosicionesFicha1();
                    Cordenada cordenada;
                    cordenada = posicion.ObtenerCordenada(ficha.posicionCuadro);
                    ficha.ficha.setLocation(cordenada.posicionx, cordenada.posiciony);
                }
            }
            
            if (0 == 0) {
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }
    
    private void MoverVerde(Fichas ficha){
        Timer timer;
        timer = new Timer(100, e -> {
            ficha.posicionCuadro += resultado;
            PosicionesFicha1 posicion = new PosicionesFicha1();
            Cordenada cordenada; 
            cordenada = posicion.ObtenerCordenada(ficha.posicionCuadro);
            ficha.ficha.setLocation(cordenada.posicionx, cordenada.posiciony);
            
            if (0 == 0) {
                ((Timer) e.getSource()).stop();
            }
            
            if(ficha.posicionCuadro >= 70 && fichasTerminadas <= 4){
                fichasTerminadas++;
            }
        });
        timer.start();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton1.setVisible(true);
        
    }

    private void SacarFichaVerde(){
        if(fichasVerdesIniciadas == 0){
            jButton3.setVisible(false);
            jButton1.setVisible(true);
            Timer timer;
            timer = new Timer(100, e -> {
                fichasVerdes.get(fichasVerdesIniciadas).ficha.setLocation(320, 150);
                fichasVerdes.get(fichasVerdesIniciadas).posicionCuadro = 1;
                fichasVerdesIniciadas++;
                if (jLabel25.getY() >= 0) {
                    ((Timer) e.getSource()).stop();
                }
            });
            timer.start();
        }else if(fichasVerdesIniciadas <= 4){
            fichasVerdes.get(fichasVerdesIniciadas).ficha.setLocation(320, 150);
            fichasVerdes.get(fichasVerdesIniciadas).posicionCuadro = 1;
            fichasVerdesIniciadas++;
    }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MoverVerde(fichasVerdes.get(fichasTerminadas));
        actualizarFichas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SacarFichaVerde();
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        jButton1.setVisible(true);
        actualizarFichas();
    }//GEN-LAST:event_jButton3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
