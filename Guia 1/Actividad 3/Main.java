package parqueadero;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    
    public static void ingresarvehiculo(Parqueadero parqueadero, Scanner scanner){
        int tipovehiculo;
        System.out.println("Elija el tipo de vehiculo a ingresar:");
        System.out.println("1. Automovil - 2. Motocicleta - 3. Camion");
        tipovehiculo = scanner.nextInt();
        System.out.println("Ingrese la placa del vehiculo:");
        String placa = scanner.next();
        System.out.println("Ingrese la marca del vehiculo:");
        String marca = scanner.next();
        System.out.println("Ingrese el modelo del vehiculo:");
        String modelo = scanner.next();
        LocalDateTime horaentrada = LocalDateTime.now();
        System.out.println("Hora de entrada: "+horaentrada);
        
        Vehiculo vehiculo = null;
        switch (tipovehiculo) {
            case 1:
                System.out.print("Ingrese el tipo de combustible del automovil: ");
                String tipocombustible = scanner.next();
                vehiculo = new Automovil(placa, marca, modelo, horaentrada, tipocombustible);
                break;
            case 2:
                System.out.print("Ingrese el cilindraje de la motocicleta (solo numeros): ");
                int cilindraje = scanner.nextInt();
                vehiculo = new Motocicleta(placa, marca, modelo, horaentrada, cilindraje);
                break;
            case 3:
                System.out.print("Ingrese la capacidad de carga del camion en kg (solo numeros, con decimales si aplica): "); 
                double capacidadcarga = scanner.nextDouble();
                vehiculo = new Camion(placa, marca, modelo, horaentrada, capacidadcarga);
                break;
            default:
                System.out.println("Tipo de vehículo inválido");
        }
        parqueadero.registrarentrada(vehiculo);
    }
    
    public static void sacarvehiculo (Parqueadero parqueadero, Scanner scanner){
        System.out.println("Ingrese la placa del vehiculo que va a salir:");
        String placa = scanner.next();
        parqueadero.registrarsalida(placa);
    }
    
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println(" ");
            System.out.println("¡ Bienvenido al programa de parqueadero ¡");
            System.out.println(" ");
            System.out.println("Por favor, seleccione una opcion:");
            System.out.println(" ");
            System.out.println("1. Ingresar un vehiculo al parqueadero");
            System.out.println("2. Consultar el estado de los vehiculos ingresados al parqueadero");
            System.out.println("3. Dar salida a un vehiculo del parqueadero");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    ingresarvehiculo(parqueadero, scanner);
                    break;
                case 2:
                    parqueadero.consultarparqueadero();
                    break;
                case 3:
                    sacarvehiculo (parqueadero, scanner);
                    break;
                case 4:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo.");
            }
        } while (opcion != 4);
    }
}