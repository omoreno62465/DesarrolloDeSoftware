package parqueadero;
import java.time.LocalDateTime;

public class Automovil extends Vehiculo {
    private String tipocombustible;

    public Automovil(String placa, String marca, String modelo, LocalDateTime horaentrada, String tipocombustible) {
        super(placa, marca, modelo, horaentrada);
        this.tipocombustible = tipocombustible;
    } 

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }
}