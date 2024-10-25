package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Costo;
import Objeto.Usuario;

public class CostoModelo {
    private List<Costo> costos;
    private UsuarioModelo usuarioModelo;

    public CostoModelo(UsuarioModelo usuarioModelo) {
        this.usuarioModelo = usuarioModelo;
        costos = new ArrayList<>();
        inicializarCostos();
    }

    private void inicializarCostos() {
        costos.add(new Costo(1, 6, 2024, 1023456, usuarioModelo.getUsuarioPorLegajo(1)));
        costos.add(new Costo(2, 7, 2024, 2046813, usuarioModelo.getUsuarioPorLegajo(1)));
    }

    public List<Costo> getCostos() {
        return costos;
    }

    public void addCosto(int mes, int anio, int valor, int legajoUsuario) {
        Usuario usuario = null;
        int id = costos.size() + 1;
        for (Usuario u : usuarioModelo.getUsuarios()) {
            if (u.getLegajo() == legajoUsuario) {
                usuario = u;
                break;
            }
        }
        if (usuario != null) {
            Costo costo = new Costo(id, mes, anio, valor, usuario);
            costos.add(costo);
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public Costo getCostoPorMesYAnio(int mes, int anio) {
        for (Costo costo : costos) {
            if (costo.getMes() == mes && costo.getAnio() == anio) {
                return costo;
            }
        }
        return null;
    }
}
