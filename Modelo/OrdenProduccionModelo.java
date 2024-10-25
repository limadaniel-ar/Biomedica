package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Area;
import Objeto.OrdenProduccion;
import Objeto.Producto;

public class OrdenProduccionModelo {
    private List<OrdenProduccion> ordenes;
    private ProductoModelo productoModelo;
    private AreaModelo areaModelo;

    public OrdenProduccionModelo(ProductoModelo productoModelo, AreaModelo areaModelo) {
        this.productoModelo = productoModelo;
        this.areaModelo = areaModelo;
        ordenes = new ArrayList<>();
        inicializarOrdenes();
    }

    private void inicializarOrdenes() {
        ordenes.add(new OrdenProduccion(100000, 125, productoModelo.getProductoPorId(1), areaModelo.getAreaPorID(1)));
        ordenes.add(new OrdenProduccion(100001, 35, productoModelo.getProductoPorId(6), areaModelo.getAreaPorID(6)));
        ordenes.add(new OrdenProduccion(100003, 125, productoModelo.getProductoPorId(2), areaModelo.getAreaPorID(3)));
    }

    public List<OrdenProduccion> getOrdenes() {
        return ordenes;
    }

    public void addOrden(int lote, int idProducto, int idArea) {
        Producto producto = null;
        Area area = null;
        int id = ordenes.size() + 100000;
        for (Producto p : productoModelo.getProductos()) {
            if (p.getId() == idProducto) {
                producto = p;
                break;
            }
        }
        for (Area a : areaModelo.getAreas()) {
            if (a.getId() == idArea) {
                area = a;
                break;
            }
        }
        if (producto != null && area != null) {
            OrdenProduccion ordenProduccion = new OrdenProduccion(id, lote, producto, area);
            ordenes.add(ordenProduccion);
        } else {
            System.out.println("Producto o Area no encontrados");
        }
    }

    public OrdenProduccion getOrdenPorId(int id) {
        for (OrdenProduccion ordenProduccion : ordenes) {
            if (ordenProduccion.getId() == id) {
                return ordenProduccion;
            }
        }
        return null;
    }

    public List<OrdenProduccion> getOrdenesPorProducto(int idProducto) {
        List<OrdenProduccion> salida;
        salida = new ArrayList<>();
        for (OrdenProduccion ordenProduccion : ordenes) {
            if (ordenProduccion.getProducto().getId() == idProducto) {
                salida.add(ordenProduccion);
            }
        }
        return salida;
    }
}
