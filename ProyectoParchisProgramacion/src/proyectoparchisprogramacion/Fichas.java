/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoparchisprogramacion;

import javax.swing.*;

/**
 *
 * @author wilia
 */
public class Fichas {
    //atributos
    Integer posicionX;
    Integer posicionY;
    Integer posicionCuadro;
    Integer numeroFicha;
    JLabel ficha;

    //constructor
    public Fichas(Integer posicionX, Integer posicionY, Integer posicionCuadro, Integer numeroFicha, JLabel ficha) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.posicionCuadro = posicionCuadro;
        this.numeroFicha = numeroFicha;
        this.ficha = ficha;
    }
}
