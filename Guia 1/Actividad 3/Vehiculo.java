package parqueadero;
import java.time.LocalDateTime;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private LocalDateTime horaentrada;
    
    public Vehiculo (String placa, String marca, String modelo, LocalDateTime horaentrada){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaentrada = horaentrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(LocalDateTime horaentrada) {
        this.horaentrada = horaentrada;
    }
}