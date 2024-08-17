package punto14;
import java.util.Scanner;
public class Punto14 {
    
    //Creamos la funcion para calcular el hermano mayor entre 3 hermanos ingresados por el usuario con nombre y edad cada uno
    public static String calcularmayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3){
        if (edad1 > edad2 && edad1 > edad3){
            return nombre1;
        }else if (edad2 > edad1 && edad2 > edad3){
            return nombre2;
        }else {
            return nombre3;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese el nombre y edad de los tres hermanos
        System.out.println("Ingrese el nombre y edad del primer hermano");
        System.out.println("Nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Edad:");
        int edad1 = scanner.nextInt();
        
        System.out.println("Ingrese el nombre y edad del segundo hermano");
        System.out.println("Nombre:");
        String nombre2 = scanner.next();
        System.out.println("Edad:");
        int edad2 = scanner.nextInt();
        
        System.out.println("Ingrese el nombre y edad del tercer hermano");
        System.out.println("Nombre:");
        String nombre3 = scanner.next();
        System.out.println("Edad:");
        int edad3 = scanner.nextInt();
        
        //Calculamos cual es el hermano mayor en base a nuestra funcion anterior e imprimimos el resultado
        String resultado = calcularmayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);
        System.out.println("El hermano mayor es: "+resultado);
    }
}