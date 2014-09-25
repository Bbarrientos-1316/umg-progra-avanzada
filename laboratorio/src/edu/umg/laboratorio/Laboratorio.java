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
        
        //probando clases Taller y Vehiculo
        Taller miTaller = new Taller(5);
        
        miTaller.agregar(new Vehiculo("HYUNDAI","ACCENT", 2014, "GRIS", 
                "Choque frontal"));
        miTaller.agregar(new Vehiculo("TOYOTA","YARIS", 2007, "PLATEADO", 
                "Servicio Completo"));
        miTaller.agregar(new Vehiculo("TOYOTA","COROLLA", 2001, "ROJO", 
                "Servicio de frenos"));
        miTaller.agregar(new Vehiculo("MAZDA","3", 2008, "AZUL", 
                "Cambio de aceite"));
        miTaller.agregar(new Vehiculo("SUZUKI","SAMURAI", 2005, "CELESTE", 
                "Cambio de radiador"));
        miTaller.mostrar();
        
    }
    
}
