package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Rol;

public class RolModelo {
    private List<Rol> roles;

    public RolModelo() {
        roles = new ArrayList<>();
        inicializarRoles();
    }

    private void inicializarRoles() {
        roles.add(new Rol(1, "Director"));
        roles.add(new Rol(2, "Jefe de Producción"));
        roles.add(new Rol(3, "Jefe de Planificación"));
        roles.add(new Rol(4, "Operario"));
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void addRol(String tipo) {
        int id = roles.size() + 1;
        Rol rol = new Rol(id, tipo);
        roles.add(rol);
    }

    public Rol getRolPorID(int id) {
        for (Rol rol : roles) {
            if (rol.getId() == id) {
                return rol;
            }
        }
        return null;
    }
}