package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Area;

public class AreaModelo {
    private List<Area> areas;

    public AreaModelo() {
        areas = new ArrayList<>();
        inicializarAreas();
    }

    private void inicializarAreas() {
        areas.add(new Area(1, "Granulación Vía Húmeda"));
        areas.add(new Area(2, "Granulación Vía Seca"));
        areas.add(new Area(3, "Compresión 1"));
        areas.add(new Area(4, "Compresión 2"));
        areas.add(new Area(5, "Recubrimiento"));
        areas.add(new Area(6, "Encapsulado"));
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void addArea(String nombre) {
        int id = areas.size() + 1;
        Area area = new Area(id, nombre);
        areas.add(area);
    }

    public Area getAreaPorID(int id) {
        for (Area area : areas) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null;
    }
}
