package punto5;
import java.util.Scanner;

public class Punto5 {
    
    //Primero realizamos la funcion para hallar el area de un circulo, unicamente con su radio dado
    public static double areacirculo (double radio){
        return Math.PI * Math.pow(radio,2);
    }
    
    //Ahora vamos a calcular el area de la corona, restando el area del circulo grande al area del circulo pequeño
    public static double areacorona (double radiocirculogrande, double radiocirculopequeno){
        double areacirculogrande = areacirculo(radiocirculogrande);
        double areacirculopequeno = areacirculo(radiocirculopequeno);
        return areacirculogrande - areacirculopequeno;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos al usuario que ingrese el radio del circulo grande
        System.out.println("Ingrese el radio del circulo grande: ");
        double radiocirculogrande = scanner.nextDouble();
        
        
        //Pedimos al usuario que ingrese el radio del circulo pequeño
        System.out.println("Ingrese el radio del circulo pequeño: ");
        double radiocirculopequeno = scanner.nextDouble();
        
        //Ahora calculamos el area de la corona en base a los radios del circulo pequeño y grande
        double resultadoareacorona = areacorona(radiocirculogrande, radiocirculopequeno);
        
        //Imprimimos el resultado del area de la corona
        System.out.println("El area de la corona del circulo es: "+ resultadoareacorona);
    }
}