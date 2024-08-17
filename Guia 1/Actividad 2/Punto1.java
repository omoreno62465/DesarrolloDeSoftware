package Punto1;
public class Punto1{
    
    //Creamos la funcion para calcular la funcion con un valor X y uno Y
    public static double calcularfuncion (double x, double y){
        return x*x + 2*x*y + y*y;
    }
    
    public static void main (String[] args){
        //Creamos unos valores de prueba para X y Y
        double x = 2;
        double y = 3;
        
        //Calculamos la funcion(x,y) de acuerdo a los valores anteriormente asignados
        double resultado = calcularfuncion(x,y);
        
        //Mostramos el resultado de la funcion
        System.out.println("El resultado de la funcion es:"+resultado);
    }
}