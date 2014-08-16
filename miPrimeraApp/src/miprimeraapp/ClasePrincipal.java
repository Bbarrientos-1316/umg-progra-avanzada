/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author enrique
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Cuadrado miCuadrado = new Cuadrado(3);
        Elipse miElipse = new Elipse();
        
        ClasePrincipal.mostrarTipo(miCuadrado);
        ClasePrincipal.mostrarArea(miCuadrado);
        
        ClasePrincipal.mostrarArea(miElipse);
    }
    
    public static void mostrarTipo(Figura fig) {
        System.out.println(fig.getTipo());
    }
    
    public static void mostrarArea(Figura fig) {
        System.out.println(fig.calcularArea());
    }
    
}
