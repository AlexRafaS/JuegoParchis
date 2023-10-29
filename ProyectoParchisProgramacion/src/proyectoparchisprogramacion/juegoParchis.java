/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package proyectoparchisprogramacion;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.text.Position;

public class juegoParchis extends javax.swing.JFrame {
    Random numRandom = new Random();
    int numAleatorio;
    boolean turno = false;
    int fichasIniciadas1 = 0;
    int fichasIniciadas2 = 0;
    int fichasEnCamino = 0;
    int fichasTerminadas = 0;
    int numJugador = 0;
    String nombreJugador;
    int posicionInicial;
    int numPasos;
    int recorrido = 12;
    

    public juegoParchis() {
        initComponents();
        if(turno == false){
            turno = true;
            jLabel16.setText("Jugador 1");
        }
    }
    
    public void posicionInicio1(JLabel label){
        label.setLocation( 320,150) ;
        System.out.println("Posicion: ");
    }
    
    public int numeroAleatorio(){
        numAleatorio = numRandom.nextInt(6)+1;
        System.out.println(numAleatorio);
        return numAleatorio;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
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

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha verde parchis (2).png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 40));

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

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tirar Dados");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mover");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sacar Ficha");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int resultado = dado1 + dado2;
        jLabel14.setText("TOTAL:  " + resultado);
        
        if(turno == false){
            turno = true;
            jLabel16.setText("Jugador 1");
        }
        else{
            turno = false;
            jLabel16.setText("Jugador 2");
        }

	String rutaImagenDado1 = "/Imagenes/dado"+dado1+".png";
        String rutaImagenDado2 = "/Imagenes/dado"+dado2+".png";
        ImageIcon imagenDado1 = new ImageIcon(getClass().getResource(rutaImagenDado1));
        ImageIcon imagenDado2 = new ImageIcon(getClass().getResource(rutaImagenDado2));
        jLabel12.setIcon(imagenDado1);
        jLabel13.setIcon(imagenDado2);

         if(fichasIniciadas1 == 0 && ((dado1 > 4) || (dado2 > 4) )){
            fichasIniciadas1 += 1;
        }
         
         System.out.println("Fichas Iniciadas: "+ fichasIniciadas1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*if(fichasIniciadas1 > 0 && numPasos + resultado > 15){
            numPasos = recorrido + resultado;
            jLabel17.setLocation(300 + 40*numPasos, 280);
        }
        else if(fichasIniciadas1 > 0 && numPasos + resultado <= 15){
            numPasos = recorrido + resultado;
            jLabel17.setLocation(320, 40*numPasos);
        }*/
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(fichasIniciadas1 > 0 && fichasIniciadas1 <= 4){
            switch (fichasIniciadas1) {
                case 1:
                    posicionInicio1(jLabel17);
                    break;
                case 2: 
                    posicionInicio1(jLabel18);
                    break;
               case 3: 
                   posicionInicio1(jLabel19);
                    break;
                case 4: 
                    posicionInicio1(jLabel20);
                    break;
                default:
                    System.out.println("Dados menor que 5");
            }
        } 
        
        posicionInicio1(jLabel18);

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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
