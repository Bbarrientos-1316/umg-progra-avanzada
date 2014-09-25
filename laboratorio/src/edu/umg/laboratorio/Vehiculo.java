package edu.umg.laboratorio;

/**
 *
 * @author enrique
 */
public class Vehiculo {
    private String marca;
    private String linea;
    private int modelo;
    private String color;
    private String desperfecto;
    
    Vehiculo(String marca, String linea, int modelo, String color, 
            String desperfecto) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.color = color;
        this.desperfecto = desperfecto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesperfecto() {
        return desperfecto;
    }

    public void setDesperfecto(String desperfecto) {
        this.desperfecto = desperfecto;
    }
    
    public void imprimirDatos() {
        System.out.println(this.marca);
        System.out.println(this.linea);
        System.out.println(this.modelo);
        System.out.println(this.color);
        System.out.println(this.desperfecto);
    }
    
}
