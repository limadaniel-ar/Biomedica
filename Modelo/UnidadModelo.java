package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Unidad;

public class UnidadModelo {
        private List<Unidad> unidades;

    public UnidadModelo() {
        unidades = new ArrayList<>();
        inicializarUnidades();
    }

    private void inicializarUnidades() {
        unidades.add(new Unidad(1, "Kg"));
        unidades.add(new Unidad(2, "Comprimidos"));
        unidades.add(new Unidad(3, "Núcleos"));
        unidades.add(new Unidad(4, "Comprimidos Recubiertos"));
        unidades.add(new Unidad(5, "Cápsulas"));
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }

    public void addUnidad(String nombre) {
        int id = unidades.size() + 1;
        Unidad unidad = new Unidad(id, nombre);
        unidades.add(unidad);
    }

    public Unidad getUnidadPorID(int id) {
        for (Unidad unidad : unidades) {
            if (unidad.getId() == id) {
                return unidad;
            }
        }
        return null;
    }
}