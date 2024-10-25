package Objeto;

public class CategoriaParada {
    // Asignación de atributos
    private int id;
    private String descripcion;

    // Constructor
    public CategoriaParada(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    // Observadores
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Categoría de Parada\n" +
                "- ID: " + id + "\n" +
                "- Descripcion: " + descripcion;
    }

    // Modificadores
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
