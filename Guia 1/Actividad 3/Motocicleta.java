package parqueadero;
import java.time.LocalDateTime;

public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, LocalDateTime horaentrada, int cilindraje) {
        super(placa, marca, modelo, horaentrada);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
