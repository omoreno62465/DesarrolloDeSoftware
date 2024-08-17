package punto8;
import java.util.Scanner;
public class Punto8 {
    
    //Realizamos la funcion para calcular el numero de salones segun la capacidad de cada salon y la cantidad de estudiantes
    public static int calcularnumerosalones (int cantidadestudiantes, int capacidadsalon){
        return cantidadestudiantes/capacidadsalon;
    }
    
    //Realizamos la funcion para calcular el numero de pisos que tendra el edificio segun la cantidad de salones que tenemos y cuantos queremos que hallan en cada piso
    public static int numeropisos(int numerosalones, int salonesporpiso){
        return numerosalones / salonesporpiso;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos al usuario que indique datos como la cantidad de estudiantes, cuantos estudiantes tiene cada salon y cuantos salones quiere que tenga cada piso
        System.out.println("Ingrese la cantidad de estudiantes en la universidad:");
        int cantidadestudiantes = scanner.nextInt();
        
        System.out.println("Ingrese la capacidad de estudiantes que tiene cada salon:");
        int capacidadsalon = scanner.nextInt();
        
        System.out.println("Ingrese el numero de salones que va a tener cada piso:");
        int salonesporpiso = scanner.nextInt();
        
        //Realizamos los calculos del numero de salones que tendra el edificio y la cantidad de pisos que tendra el edificio segun nuestras funciones anteriores
        int resultadonumerosalones = calcularnumerosalones(cantidadestudiantes, capacidadsalon);
        int resultadonumeropisos = numeropisos(resultadonumerosalones, salonesporpiso);
        
        //Imprimimos los resultados de nuestras operaciones
        System.out.println("El numero de salones que tendra el edificio es de: "+resultadonumerosalones);
        System.out.println("El numero de pisos que tendra el edificio es de: "+resultadonumeropisos);
    }
}