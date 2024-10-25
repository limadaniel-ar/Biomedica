package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.CategoriaParada;

public class CategoriaParadaModelo {
    private List<CategoriaParada> categorias;

    public CategoriaParadaModelo() {
        categorias = new ArrayList<>();
        inicializarCategorias();
    }

    private void inicializarCategorias() {
        categorias.add(new CategoriaParada(1, "Corte de electricidad"));
        categorias.add(new CategoriaParada(2, "Problemas de temperatura y presión"));
        categorias.add(new CategoriaParada(3, "Comprimidos defectuosos"));
        categorias.add(new CategoriaParada(4, "Capsulas rotas"));
        categorias.add(new CategoriaParada(5, "Problema en motor"));
    }

    public List<CategoriaParada> getCategoriasParada() {
        return categorias;
    }

    public void addCategoriaParada(String descripcion) {
        int id = categorias.size() + 1;
        CategoriaParada categoria = new CategoriaParada(id, descripcion);
        categorias.add(categoria);
    }

    public CategoriaParada getCategoriaPorID(int id) {
        for (CategoriaParada categoria : categorias) {
            if (categoria.getId() == id) {
                return categoria;
            }
        }
        return null;
    }
}
