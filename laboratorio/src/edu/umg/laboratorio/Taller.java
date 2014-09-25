/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umg.laboratorio;

/**
 *
 * @author Ing. Enrique Hurtarte Juarez
 */
public class Taller {
    private final Vehiculo lista[];
    private final int maximo;
    private int indice;
    
    Taller(int maximo)  {
        indice = 0;
        this.maximo = maximo;
        lista = new Vehiculo[this.maximo];
    }
    
    public void agregar(Vehiculo vehiculo) {
        if (indice < maximo) {
            lista[indice] = vehiculo;
            indice++;
        }
    }
    
    public void mostrar() {
        for (int contador=0; contador < indice; contador++) {
            lista[contador].imprimirDatos();
        }
    }
}
