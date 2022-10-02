
package zCodeEjercicios;

/** @author Cristian_Marin*/

public class exercise23 {
    public static double[] ecuacion2Grado(int a, int b, int c) {
        int cont;
    double discriminante = (Math.pow(b, 2) - (4 * a * c));
    if (discriminante >= 0) {
    
        double soluciones[];
 
        // Una solucion
        if(discriminante == 0){
 
            soluciones = new double[1];
 
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
            
            cont = 0;
 
        // Dos soluciones
        }else{
 
            soluciones = new double[2];
 
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            
            
        }
          cont = 1;  
        return soluciones;
    } else {
        // Sin solucion
        cont = -1;
        return null;
    }
 
}
    
}
 
   /* 
        double determinante = (Math.pow(B, 2) - (4 * A * C));
        if (discriminante >= 0) {
 
        double soluciones[];
 
        // Una solucion
        if(discriminante == 0){
 
            soluciones = new double[1];
 
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
 
        // Dos soluciones
        }else{
 
            soluciones = new double[2];
 
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * (a * c)))) / (2 * a);
 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * (a * c)))) / (2 * a);
 
        }
 
        return soluciones;
    } else {
        // Sin solucion
        return null;
    }*/

/*
double x,y;
        double determinante = (Math.pow(B, 2) - (4 * A * C));
        
        if(determinante >= 0){
            
            if (determinante == 0){
                x = (((-1)*B) - (4 * A * C))/(2*A);
                
            }
            else{
                x = (((-1)*B) + (Math.sqrt(determinante)))/(2*A);
                y = (((-1)*B) - (Math.sqrt(determinante)))/(2*A);
            }
              
            
        }
        return x, Y;
        else {
            
            return null;
        }


*/