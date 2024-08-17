package punto7;
import java.util.Scanner;
public class Punto7 {
    
    //Creamos la funcion para calcular la distancia entre dos puntos de una recta
    public static double distancia (double x1, double x2, double y1, double y2){
        return Math.sqrt((Math.pow(y2-y1,2)+Math.pow(x2-x1,2)));
    }
    
    //Creamos la funcion para calcular la pendiente de una recta formada por la union de dos puntos
    public static double pendiente (double x1, double x2, double y1, double y2){
        return ((y2-y1)/(x2-x1));
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos al usuario que ingrese las coordenadas X1 y Y1 del primer punto en la recta
        System.out.println("Ingrese las coordenadas del primer punto en la recta:");
        System.out.println("Ingrese el punto X1:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese el punto Y1:");
        double y1 = scanner.nextDouble();
        
        //Pedimos al usuario que ingrese las coordenadas X2 y Y2 del segundo punto en la recta
        System.out.println("Ingrese las coordenadas del segundo punto en la recta:");
        System.out.println("Ingrese el punto X2:");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese el punto Y2:");
        double y2 = scanner.nextDouble();
        
        //Calculamos la distancia y la pendiente con las funciones anteriormente creadas y los datos ingresados por el usuario
        double resultadodistancia = distancia(x1,x2,y1,y2);
        double resultadopendiente = pendiente(x1,x2,y1,y2);
        
        //Imprimimos los resultados de la distancia y la pendiente
        System.out.println("La distancia entre los dos puntos es de: "+resultadodistancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: "+resultadopendiente);
    }
}