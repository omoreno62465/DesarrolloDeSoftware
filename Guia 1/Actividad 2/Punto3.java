package punto3;
import java.util.Scanner;

public class Punto3 {
    public static double calcularlongitudescalera(double alturapared, double angulo){
        
        //Ya que vamos a trabajar con angulos, debemos convertir el angulo de grados a radianes
        double anguloenradianes = Math.toRadians(angulo);
        
        //Para la resolucion del problema debemos encontrar el seno del angulo
        double senodeangulo = Math.sin(anguloenradianes);
        
        //Aplicamos la formula para hallar la longitud de la escalera
        double resultadolongitud = alturapared/senodeangulo;
        return resultadolongitud;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Requerimos al usuario que ingrese la altura de la pared en metros
        System.out.println("Ingrese la altura de la pared en metros, puede usar punto decimal:");
        double alturapared = scanner.nextDouble();
        
        //Requerimos al usuario que ingrese los grados que tiene la escalera al piso
        System.out.println("Ingrese en grados el angulo entre la escalera y el piso:");
        double angulo = scanner.nextDouble();
        
        //Realizamos los calculos con la funcion anteriormente creada
        double resultadolongitud = calcularlongitudescalera(alturapared, angulo);
        
        //Imprimimos el resultado de la longitud de la escalera
        System.out.println("La longitud de la escalera es: "+resultadolongitud + " metros");
    }
}