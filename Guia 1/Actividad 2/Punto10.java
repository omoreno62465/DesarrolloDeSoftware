package punto10;
import java.util.Scanner;
public class Punto10 {
    
    //Realzamos la funcion para hacer las operaciones correspondientes segun el operador que indique el usuario
    public static int operacion (int numero1, int numero2, String operador){
        int resultado = 0;
        if ("+".equals(operador)){
            resultado = numero1 + numero2;
        }else if ("-".equals(operador)){
            resultado = numero1 - numero2;
        }else if ("*".equals(operador)){
            resultado = numero1 * numero2;
        }else if ("/".equals(operador)){
            if (numero2 != 0){
                resultado = numero1 / numero2;
            }else{
                System.out.println("No se puede dividir por 0");
            }
        }else if ("%".equals(operador)){
            resultado = numero1 % numero2;
        }else if ("**".equals(operador)){
            resultado = (int) Math.pow(numero1, numero2);
        }else{
            System.out.println("Operador no valido");
        }
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese los dos numeros y el operador para operar dichos numeros
        System.out.println("Ingrese el primer numero a operar:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero a operar:");
        int numero2 = scanner.nextInt();
        
        System.out.println("Ingrese el operador aritmetico entre los siguientes: +, -, *, /, **");
        String operador = scanner.next();
        
        //Encontramos el resultado con la funcion anterior e imprimimos el resultado
        int resultado = operacion(numero1, numero2, operador);
        System.out.println("El resultado de la operacion es: "+ resultado);
    }
}