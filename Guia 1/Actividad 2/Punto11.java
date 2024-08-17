package punto11;
import java.util.Scanner;
public class Punto11 {
    
    //Realizamos la funcion para obtener las decenas del numero dado
    public static int obtenerdecenas (int numero){
        return numero / 10;
    }
    
    //Realizamos la funcion para obtener las unidades del numero dado
    public static int obtenerunidades (int numero){
        return numero % 10;
    }
    
    //Realizamos la funcion para convertir las unidades a numeros romanos
    public static String convertirunidadaromano (int unidad){
        switch (unidad){
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return " "; //Para el caso del 0, no imprime nada
        }
    }
    
    //Realizamos la funcion para convertir las decenas a numeros romanos
    public static String convertirdecenaaromano (int decena){
        switch (decena){
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            default:
                return " "; //Por defecto devolvera un vacio
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos al usuario que ingrese un numero entero positivo entre 1 y 99
        System.out.println("Ingrese un numero positivo del 1 al 99:");
        int numero = scanner.nextInt();
        
        //Hacemos los calculos para validar que el numero este entre los parametros de 1 a 99, y extraemos sus decenas y unidades
        if (numero > 0 && numero < 100){
            int decenas = obtenerdecenas(numero);
            int unidades = obtenerunidades(numero);
            
            //Convertimos las decenas y las unidades a numeros romanos con nuestras funciones anteriores
            String decenasromanas = convertirdecenaaromano(decenas);
            String unidadesromanas = convertirunidadaromano(unidades);
            
            //Imprimimos el resultado en numeros romanos, o si no, imprime que el numero no esta dentro de los parametros
            System.out.println("El numero que ingresaste en romano es: "+decenasromanas+unidadesromanas);
        }else {
            System.out.println("El numero no cumple con los parametros, debe ser un numero positivo entre 1 y 99");
        }
    }
}
