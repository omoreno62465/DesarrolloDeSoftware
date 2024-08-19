package parqueadero;
import java.time.LocalDateTime;

public class Camion extends Vehiculo {
    private double capacidadcarga;
    
    public Camion(String placa, String marca, String modelo, LocalDateTime horaentrada, double capacidadcarga) {
        super(placa, marca, modelo, horaentrada);
        this.capacidadcarga = capacidadcarga;
    }

    public double getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(double capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
}
