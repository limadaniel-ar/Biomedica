package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Etapa;

public class EtapaModelo {
    private List<Etapa> etapas;

    public EtapaModelo() {
        etapas = new ArrayList<>();
        inicializarEtapas();
    }

    private void inicializarEtapas() {
        etapas.add(new Etapa(1, "Armado de equipo y documentación"));
        etapas.add(new Etapa(2, "En Proceso"));
        etapas.add(new Etapa(3, "Desarmado y Limpieza"));
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public void addEtapa(String nombre) {
        int id = etapas.size() + 1;
        Etapa etapa = new Etapa(id, nombre);
        etapas.add(etapa);
    }

    public Etapa getEtapaPorID(int id) {
        for (Etapa etapa : etapas) {
            if (etapa.getId() == id) {
                return etapa;
            }
        }
        return null;
    }
}
