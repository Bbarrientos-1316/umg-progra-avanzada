/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public final class Location  
{ public static final Location NONE = new Location(-1.0, -1.0);
    
    private double x;
    private double y;

    
    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
     
    public double getY() {
        return y;
    }
    
    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }
    
    public boolean equals(Object other)
    {
        if(other instanceof Location) {
            Location o = (Location) other;
            return (x == o.x) && (y == o.y);
        }
        else
            return false;
    }
}
