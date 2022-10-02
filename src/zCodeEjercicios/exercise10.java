
package zCodeEjercicios;

/** @author Cristian_Marin*/
public class exercise10 {

    public static double pago_matricula(double patrimonio, int estrato) {
        double pago=50000;  
     if(patrimonio > 2000000 && estrato > 3){   //verifica si el patrimonio es de mas de 2millones 
        pago = pago + (0.03) * patrimonio;      // y si tiene un estrato mayo a 3
     }                                          //si es asi entonces el pago se multiplica por el 3%
    return pago;
    }
    
}

