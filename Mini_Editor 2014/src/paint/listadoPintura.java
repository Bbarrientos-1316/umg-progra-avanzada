
package paint;

import java.awt.Color;

/**
 *
 * @author Anonimo
 */
public class listadoPintura {
    int xInicial;
    int xFinal;
    int yInicial;
    int yFinal;
    int tipo;
    Color color;
    
    public listadoPintura() {
        
    }
    public listadoPintura(int x1,int x2, int y1, int y2, Color c, int tip){
        this.xInicial=x1;
        this.xFinal=x2;
        this.yInicial=y1;
        this.yFinal=y2;
        this.color=c;
        this.tipo=tip;
    }
}
