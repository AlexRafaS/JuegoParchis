/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoparchisprogramacion;

import java.sql.Connection;

/**
 *
 * @author alexs
 */
public class ProyectoParchisProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection conectar = Conexion.Conectar();
        
        
        InicioParchis inicio = new InicioParchis();
        inicio.setVisible(true);
        
        

    }
    
}
