
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

}
