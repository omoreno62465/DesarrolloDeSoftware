package punto13;
import java.util.Scanner;
public class Punto13 {
    
    //Realizamos la funcion para calcular cuanto seria el incremento del sueldo en base a los parametros
    public static double calcularaumento (double sueldo){
        double aumento = 0;
        if (sueldo<=800000){
            aumento = sueldo * 0.10;
        }else if (sueldo>800000 && sueldo<1200000){
            aumento = sueldo * 0.08;
        }else{
            aumento = sueldo * 0.05;
        }
        return aumento;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese el sueldo actual del empleado
        System.out.println("Ingrese el sueldo del empleado:");
        double sueldo = scanner.nextDouble();
        
        //Realizamos el calculo de cuanto seria el aumento, y el calculo de cuanto seria este aumento sumado al salario actual
        double aumento = calcularaumento(sueldo);
        double sueldoactualizado = sueldo + aumento;
        
        //Imprimimos los resultados del aumento, y del salario con el aumento sumado
        System.out.println("La cantidad que subira al sueldo actual es: "+aumento);
        System.out.println("El sueldo actualizado con el incremento es: "+sueldoactualizado);
    }
}