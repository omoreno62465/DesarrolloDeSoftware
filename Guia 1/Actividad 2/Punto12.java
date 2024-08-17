package punto12;
import java.util.Scanner;
public class Punto12 {
    
    //Realizamos la funcion para calcular el dia siguiente al dia que ingrese el usuario
    public static String diasiguiente (String dia){
        switch (dia.toLowerCase()){
            case "lunes":
                return "martes";
            case "martes":
                return "miercoles";
            case "miercoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sabado";
            case "sabado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "No es valido el dia ingresado."; //en caso dado que se escriba mal o algo que no esta en los parametros
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Le pedimos al usuario que ingrese un dia cualquiera
        System.out.println("Ingrese el nombre de cualquier dia de la semana:");
        String dia = scanner.next();
        
        //Calculamos el dia siguiente al que ingreso el usuario gracias a nuestra funcion y lo imprimimos
        String resultadodiasiguiente = diasiguiente(dia);
        System.out.println("El dia siguiente al dia ingresado: "+dia+" , es: "+resultadodiasiguiente);
    }
}
