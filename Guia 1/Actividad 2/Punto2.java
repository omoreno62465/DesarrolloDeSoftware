package punto2;
import java.util.Scanner;
public class Punto2 {
    
    //Creamos la funcion para calcular la cantidad de buses que necesitamos
    public static int calcularcantidadbuses(int cantidadflacos, int cantidadgordos){
        
        //Calculamos el equivalente en sillas para los estudiantes flacos y los estudiantes gordos, y establecemos una cantidad de sillas por bus
        int cantidadsillasporbus = 20;
        int sillasparaflacos = cantidadflacos;
        int sillasparagordos = cantidadgordos*2;
        
        //Y sumamos segun esa equivalencia cuantas serian las sillas totales que necesitamos
        int totalsillas = sillasparaflacos + sillasparagordos;
        
        //Calculamos segun las sillas que necsitamos y las sillas que tiene cada bus cuantos buses necesitamos
        int cantidadbuses = totalsillas / cantidadsillasporbus;
        if (totalsillas%cantidadsillasporbus!=0){
            cantidadbuses = cantidadbuses+1;
        }
        return cantidadbuses;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitamos al usuario la cantidad de estudiantes flacos
        System.out.println("Ingrese la cantidad de estudiantes flacos:");
        int cantidadflacos = scanner.nextInt();
        
        //Solicitamos al usuario la cantidad de estudiantes gordos
        System.out.println("Ingrese la cantidad de estudiantes gordos:");
        int cantidadgordos = scanner.nextInt();
        
        //Calculamos segun los datos ingresados cual es la cantidad de buses que necesitamos
        int cantidadbuses = calcularcantidadbuses(cantidadflacos, cantidadgordos);
        
        //Imprimimos el resultado
        System.out.println("La cantidad de buses que se necesitan para llevar a los estudiantes es: " + cantidadbuses);
    }
}