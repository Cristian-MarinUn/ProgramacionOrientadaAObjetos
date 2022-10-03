
package zCodeEjercicios;

/** @author Cristian_Marin*/

public class exercise23 {
    public static double[] ecuacion2Grado(int a, int b, int c) {
        int cont;
    double discriminante = (Math.pow(b, 2) - (4 * a * c)); //hallar el determinante
    if (discriminante >= 0) {
    
        double soluciones[];
 
        // Una solucion
        if(discriminante == 0){    
            //si la ecuaion tiene una solucion se ejecuta este bloque
            soluciones = new double[1];
            
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
            
            cont = 0;
 
        // Dos soluciones
        }else{
 
            soluciones = new double[2];
            // se halla las soluciones + y - de la raiz
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            
            
        }
          cont = 1;  
        return soluciones;
    } else {
        // No tiene solucion
        cont = -1;
        return null;
    }
 
}
    
}
 