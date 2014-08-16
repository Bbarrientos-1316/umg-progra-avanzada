/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author enrique
 */
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;
    Rectangulo() {
        this.setTipo("Rectangulo");
    }
    
    Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return alto * ancho;
    }
    
}
