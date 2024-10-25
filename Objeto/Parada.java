package Objeto;

import java.time.LocalDateTime;

public class Parada {
    private int id;
    private OrdenProduccion ordenProduccion;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private CategoriaParada categoriaParada;
    private String observacion;

    // Constructor
    public Parada(int id, OrdenProduccion ordenProduccion, LocalDateTime inicio, CategoriaParada categoriaParada, String observacion) {
        this.id = id;
        this.ordenProduccion = ordenProduccion;
        this.inicio = inicio;
        this.fin = null;
        this.categoriaParada = categoriaParada;
        this.observacion = observacion;
    }

    // Observadores
    public int getId() {
        return id;
    }

    public OrdenProduccion getOrdenProduccion() {
        return ordenProduccion;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public CategoriaParada getCategoriaParada() {
        return categoriaParada;
    }

    public String getObservacion() {
        return observacion;
    }

    @Override
    public String toString() {
        return "Parada\n" +
                "- ID: " + id + "\n" +
                "- Orden de Produccion: " + ordenProduccion.getId() + "\n" +
                "- Inicio: " + inicio + "\n" +
                "- Fin: " + fin + "\n" +
                "- Categoria de Parada: " + categoriaParada.getDescripcion() + "\n" +
                "- Observaciones: " + observacion;
    }

    // Modificadores
    public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
        this.ordenProduccion = ordenProduccion;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public void setCategoriaParada(CategoriaParada categoriaParada) {
        this.categoriaParada = categoriaParada;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
