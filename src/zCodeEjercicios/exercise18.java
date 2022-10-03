package zCodeEjercicios;

/** @author Cristian_Marin*/
public class exercise18 {

    public static double metodo_salario_bruto(double horas, double vhora){
       double salario_bruto;
       salario_bruto = horas * vhora;
       return salario_bruto;
   }
   
   public static double metodo_retencion_fuente(double horas, double vhoras, double porcentaje_retencion){
       double dinero_retenido;
       dinero_retenido = ((horas * vhoras) * porcentaje_retencion)/100;
       return dinero_retenido;
   }
   
   public static double metodo_salario_neto(double horas, double vhora, double porcentaje_retencion){
       double salario_neto;
       salario_neto = (horas*vhora)-((horas*vhora) * (porcentaje_retencion/100));
       return salario_neto;
       
   }
}

