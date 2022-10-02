
package zCodeEjerciciosPart2;

/** @author Cristian_Marin*/
public class TriánguloRectángulo {

public static double trianArea(double base, double altura){
    return (base * altura / 2);
}
public static double trianperimetro(double base, double altura){
    return (base + altura + Math.pow(base*base + altura*altura, 0.5));
}
public static double trianHipo(double base, double altura){
    return Math.pow(base*base + altura*altura, 0.5);
}

//-----------------------
/**
public static String tipoTriangulo(double base, double altura){
 
    if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
        System.out.println("Es un triángulo equilátero");
    
    else if((base != altura) && (base != trianHipo(double base, double altura)) && (altura != trianHipo(double base, double altura))){
        System.out.println("Es un triángulo escaleno");
    }
    else{
        System.out.println("Es un triángulo isósceles");
    }
    }
}
**/

}
