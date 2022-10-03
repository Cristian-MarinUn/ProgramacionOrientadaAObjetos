
package zCodeEjercicios;

/** @author Cristian_Marin*/
public class exercise7 {

    public static String calcular_mayor(double a,double b){
        String imprimir;
        
        if (a > b) {
        imprimir = Double.toString(a);
    } 
        else if (a == b) { 
    imprimir = (a +" y "+ b +" son iguales");
    } 
        else {
    imprimir = Double.toString(b);
    }
    return imprimir;
}
}