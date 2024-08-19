package parqueadero;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    
    private double precioautomovil = 5000;
    private double preciomotocicleta = 2500;
    private double preciocamion = 7500;
    
    private List<Vehiculo> listavehiculos;
    public Parqueadero() {
        this.listavehiculos = new ArrayList<>();
    } 
    
    public void registrarentrada(Vehiculo vehiculo) {
    listavehiculos.add(vehiculo);
    System.out.println(" ");
    System.out.println("El vehiculo con placa: " + vehiculo.getPlaca() + ", se le ha sido registrado el ingreso a las " + vehiculo.getHoraentrada());
    }
    
    public double registrarsalida (String placa){
        Vehiculo vehiculoencontrado = null;
        for (Vehiculo vehiculo : listavehiculos ){
            if (vehiculo.getPlaca().equals(placa)){
                vehiculoencontrado = vehiculo;
                break;
            }
        }
        if (vehiculoencontrado != null){
            listavehiculos.remove(vehiculoencontrado);
            LocalDateTime horasalida = LocalDateTime.now();
            long horas = ChronoUnit.HOURS.between(vehiculoencontrado.getHoraentrada(), horasalida);
            if (ChronoUnit.MINUTES.between(vehiculoencontrado.getHoraentrada(), horasalida) % 60 != 0){
                horas++;
            }        
            double tarifa;
            if (vehiculoencontrado instanceof Automovil) {
                tarifa = precioautomovil;
            } else if (vehiculoencontrado instanceof Motocicleta) {
                tarifa = preciomotocicleta;
            } else if (vehiculoencontrado instanceof Camion) {
                tarifa = preciocamion;
            } else {
                tarifa = 0;
            }
        double valorparqueadero = tarifa * horas;
        System.out.println("Vehiculo con placa " + vehiculoencontrado.getPlaca() + " ha salido. Costo total: $" + valorparqueadero + ". Hora de salida: "+horasalida);
        return valorparqueadero;
        }else {
            System.out.println("Vehiculo con placa " + placa + " no encontrado.");
            return 0;
        }
    }
    public void consultarparqueadero() {
        System.out.println("Los vehiculos presentes en el parqueadero hasta el momento son:");
        System.out.println(" ");
        for (Vehiculo vehiculo : listavehiculos) {
                System.out.println("Placa: " + vehiculo.getPlaca() + ", Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Hora de Entrada: " + vehiculo.getHoraentrada());
        }
    }
}