package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Objeto.CategoriaParada;
import Objeto.OrdenProduccion;
import Objeto.Parada;

public class ParadaModelo {
    private List<Parada> paradas;
    private OrdenProduccionModelo ordenProduccionModelo;
    private CategoriaParadaModelo categoriaParadaModelo;

    public ParadaModelo(OrdenProduccionModelo ordenProduccionModelo, CategoriaParadaModelo categoriaParadaModelo) {
        this.ordenProduccionModelo = ordenProduccionModelo;
        this.categoriaParadaModelo = categoriaParadaModelo;
        paradas = new ArrayList<>();
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void addParada(int idOrden, int idCategoria, LocalDateTime inicio) {
        OrdenProduccion ordenProduccion = null;
        CategoriaParada categoriaParada = null;
        int id = paradas.size() + 1;
        for (OrdenProduccion o : ordenProduccionModelo.getOrdenes()) {
            if (o.getId() == idOrden) {
                ordenProduccion = o;
                break;
            }
        }
        for (CategoriaParada p : categoriaParadaModelo.getCategoriasParada()) {
            if (p.getId() == idCategoria) {
                categoriaParada = p;
                break;
            }
        }
        if (ordenProduccion != null && categoriaParada != null) {
            Parada parada = new Parada(id, ordenProduccion, inicio, categoriaParada, null);
            paradas.add(parada);
        } else {
            System.out.println("Orden de Producción o Categoría de Parada no encontrados");
        }
    }

    public List<Parada> getParadasPorOrden(int idOrden) {
        List<Parada> salida;
        salida = new ArrayList<>();
        for (Parada parada : paradas) {
            if (parada.getOrdenProduccion().getId() == idOrden) {
                salida.add(parada);
            }
        }
        return salida;
    }
}
