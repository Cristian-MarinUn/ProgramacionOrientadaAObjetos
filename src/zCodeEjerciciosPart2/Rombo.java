
package zCodeEjerciciosPart2;

/** @author Cristian_Marin*/
public class Rombo {
    
    public static double RomboArea(double ladoM,double ladom){
        
        
        return (ladoM*ladom)/2;
    }
    
    public static double Romboperimetro(double ladoM,double ladom){
        double a,b,c;
        
        b= Math.pow(ladoM, 2);
        a= Math.pow(ladom, 2);
        c= Math.sqrt(a+b); 
        return c*4;
    }
    
}
