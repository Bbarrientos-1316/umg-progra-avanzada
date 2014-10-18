
import greenfoot.Greenfoot;

/*Clase auxiliar que instanciara un vector movimiento que contiene
* el angulo y la distancia
*/

public final class Vector  
{
   double dx;
    double dy;
    int direction;
    double length;
    
  
    public static Vector getRandom(int maxLength)
    {   
        //Puede devolver un áng. aleatorio de 0-360 grados y una distancia
        // máxima que puede ser el ancho del "escenario" en este caso 1024p. 
        
        return new Vector (Greenfoot.getRandomNumber(360), Greenfoot.getRandomNumber(maxLength));
    }
        
    // Crea un vector neutral.
    
    public Vector()
    {
    }

   
    // Crea el vector con la dirección y longitud dada. La dirercción puede ser de 0 a 360 grados. 
    // Y la longitud puede ir de 0 hacia el este.
    
    public Vector(int direction, double length)
    {
        this.length = length;
        this.direction = direction;
        updateCartesian();
    }

    public Vector(Location start, Location end)
    {
       dx = end.getX() - start.getX();
       dy = end.getY() - start.getY();
       updatePolar();
    }

    //Establece la dirección de este vector.
    
    public void setDirection(int direction) {
        this.direction = direction;
        updateCartesian();
    }
   
    // Agrega otro vector.
    
    public void add(Vector other) {
        dx += other.dx;
        dy += other.dy;
        updatePolar();
    }
    
    public void reduceLength(double d) {
        length = length - d;
        updateCartesian();
    }
    
    public void scale(double factor) {
        length = length * factor;
        updateCartesian();
    }
    
    public void setNeutral() {
        dx = 0.0;
        dy = 0.0;
        length = 0.0;
        direction = 0;
    }
    
    
    private void updatePolar() {
        this.direction = (int) Math.toDegrees(Math.atan2(dy, dx));
        this.length = Math.sqrt(dx*dx+dy*dy);
    }   
    
    
    private void updateCartesian() {
        dx = length * Math.cos(Math.toRadians(direction));
        dy = length * Math.sin(Math.toRadians(direction));   
    }   


    public double getX() {
        return dx;
    }
     
    public double getY() {
        return  dy;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public double getLength() {
        return length;
    }
    
   
    public Vector copy() {
        Vector copy = new Vector();
        copy.dx = dx;
        copy.dy = dy;
        copy.direction = direction;
        copy.length = length;
        return copy;
    }
    
    
    //Crea una copia de este vector.
    
    public Vector reverse() {
        Vector copy = new Vector();
        copy.dx = -dx;
        copy.dy = -dy;
        copy.direction = (direction + 180) % 360;
        copy.length = length;
        return copy;
    }
    
    public String toString() {
        return "[" + direction + " " + length + " / " + dx + "," + dy + "]";
    }
}
