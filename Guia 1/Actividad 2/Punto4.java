package punto4;
import java.util.Scanner;

public class Punto4 {
    
    //Realizamos la funcion para hayar la cantidad de dinero que se va en arriendo
    public static double gastoarriendo(double sueldo){
        return sueldo*0.4;
    }
    
    //Realizamos la funcion para hayar la cantidad de dinero que se va en comida
    public static double gastocomida(double sueldo){
        return sueldo*0.15;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese el salario de Pedro
        System.out.println("Ingrese el sueldo de Pedro sin puntos a no ser que haya centavos:");
        double sueldo = scanner.nextDouble();
        
        //Hacemos los calculos de cuanto seria el arriendo y la comida gracias a nuestras funciones anteriores
        double arriendo = gastoarriendo(sueldo);
        double comida = gastocomida(sueldo);
        
        //Realizamos el calculo de cual es el sueldo restante descontando el arriendo y la comida
        double sueldorestante = sueldo - arriendo - comida;
        
        //Imprimimos el resultado con el valor del arriendo, comida y salario restante
        System.out.println("El valor que pedro paga de arriendo es: "+arriendo+", de comida: "+comida+", y el sueldo restante es: "+sueldorestante);
    }
}