
public class Carrera {

    public Carrera() {
    }

    public String nombre;

    public int cantidad_creditos;

    public int cantidad_semestres;

    public nivel_carrera nivel_de_carrera;

    public enum nivel_carrera {
        pregrado,
        posgrado
    }
}