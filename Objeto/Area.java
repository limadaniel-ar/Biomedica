package Objeto;

public class Area {
    // Asignación de atributos
    private int id;
    private String nombre;

    // Constructor
    public Area(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Observadores
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Area\n" +
                "- ID: " + id + "\n" +
                "- Nombre: " + nombre;
    }

    // Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
