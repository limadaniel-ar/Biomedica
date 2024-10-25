package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Producto;
import Objeto.Unidad;

public class ProductoModelo {
    private List<Producto> productos;
    private UnidadModelo unidadModelo;

    public ProductoModelo(UnidadModelo unidadModelo) {
        this.unidadModelo = unidadModelo;
        productos = new ArrayList<>();
        inicializarProductos();
    }

    private void inicializarProductos() {
        productos.add(new Producto(1, "Granulado de Paracetamol", 200, unidadModelo.getUnidadPorID(1)));
        productos.add(new Producto(2, "Paracetamol 500mg", 400000, unidadModelo.getUnidadPorID(2)));
        productos.add(new Producto(3, "Ibuprofeno", 200, unidadModelo.getUnidadPorID(1)));
        productos.add(new Producto(4, "Ibuprofeno 500mg Nucleos", 350000, unidadModelo.getUnidadPorID(3)));
        productos.add(new Producto(5, "Ibuprofeno 500mg Comp Recub", 350000, unidadModelo.getUnidadPorID(4)));
        productos.add(new Producto(6, "Omeprazol 20mg", 1200000, unidadModelo.getUnidadPorID(5)));
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void addProducto(String nombre, int cantidad, int idUnidad) {
        Unidad unidad = null;
        int id = productos.size() + 1;
        for (Unidad u : unidadModelo.getUnidades()) {
            if (u.getId() == idUnidad) {
                unidad = u;
                break;
            }
        }
        if (unidad != null) {
            Producto producto = new Producto(id, nombre, cantidad, unidad);
            productos.add(producto);
        } else {
            System.out.println("Unidad no encontrada");
        }
    }

    public Producto getProductoPorId(int id){
        for (Producto producto : productos) {
            if (producto.getId() == id){
                return producto;
            }
        }
        return null;
    }
}
