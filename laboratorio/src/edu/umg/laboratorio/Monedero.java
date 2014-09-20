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
public class Monedero {
    private double cantidad;
    
    public Monedero(double cantidad_inicial){
        cantidad = cantidad_inicial;
    }
    
    public void depositar(double cantidad) {
        this.cantidad += cantidad;
    }
    
    public void retirar(double cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
        }
        else {
            System.out.println("NO hay disponibilidad");
        }
    }
    
    public double mostrarDisponible() {
        return cantidad;
    }
}
