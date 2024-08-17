package punto9;
import java.util.Scanner;
public class Punto9 {
    
    //Creamos la funcion para hallar el numero mayor entre dos numeros
    public static double numeromayor (double numero1, double numero2){
        if (numero1>numero2){
            return numero1;
        } else {
            return numero2;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese los dos numeros
        System.out.println("Ingrese el numero 1:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el numero 2:");
        double numero2 = scanner.nextDouble();
        
        //Calculamos el resultado del numero mayor con nuestra funcion anteriormente instanciada y lo imprimimos
        double resultadonumeromayor = numeromayor(numero1, numero2);
        System.out.println("El numero mayor es: "+resultadonumeromayor);
    }
}