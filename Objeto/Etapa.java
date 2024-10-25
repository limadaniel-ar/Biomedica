package Objeto;

public class Etapa {
    // Asignación de atributos
    private int id;
    private String nombre;

    // Constructor
    public Etapa(int id, String nombre) {
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
        return "Etapa\n" +
                "- ID: " + id + "\n" +
                "- Nombre: " + nombre;
    }

    // Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
