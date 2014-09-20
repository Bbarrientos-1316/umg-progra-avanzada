/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umg.laboratorio;

/**
 *
 * @author enrique
 */
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monedero miMonedero = new Monedero(100);
        
        miMonedero.retirar(50);
        System.out.println("Disponible: " + miMonedero.mostrarDisponible());

        miMonedero.depositar(100);
        System.out.println("Disponible: " + miMonedero.mostrarDisponible());
        
        miMonedero.retirar(500);
    }
    
}
