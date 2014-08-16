/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author enrique
 */
public class Cuadrado extends Rectangulo {
    
    
    Cuadrado() {
        this.setTipo("Cuadrado");
    }
    
    Cuadrado(double lado) {
      super(lado, lado);
    }
}
