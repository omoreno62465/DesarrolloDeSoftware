package punto6;
import java.util.Scanner;

public class Punto6 {
    
    public static double arearectangulo (double base, double altura){
        return base*altura;
    }
    
    public static double hipotenusatriangulo (double catetoa, double catetob){
        return Math.sqrt(Math.pow(catetoa,2)+(Math.pow(catetob,2)));
    }
    
    public static double areatriangulo (double base, double altura){
        return (base*altura)/2;
    }
    
    public static double calcularperimetroterreno(double ladoa, double ladob, double ladoc){
        double hipotenusa = hipotenusatriangulo(ladoa, ladob);
        return ladoa + ladob + ladoc + hipotenusa;
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado A:");
        double ladoa = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del lado B:");
        double ladob = scanner.nextDouble();
        
        System.out.println("Ingrese la longitud del lado C:");
        double ladoc = scanner.nextDouble();
        
        double altotriangulo = ladoa-ladoc;
        double areaterreno = (areatriangulo(altotriangulo, ladob))+(arearectangulo(ladob,ladoc));
        
        double perimetroterreno = calcularperimetroterreno(ladoa, ladob, ladoc);
        
        System.out.println("El area de toda la figura es: "+areaterreno);
        System.out.println("Y el perimetro de toda la figura es: "+perimetroterreno);
    }   
}