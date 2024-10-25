package Modelo;

import java.util.ArrayList;
import java.util.List;

import Objeto.Rol;
import Objeto.Usuario;

public class UsuarioModelo {
    private List<Usuario> usuarios;
    private int siguienteLegajo;
    private RolModelo rolModelo;

    public UsuarioModelo(RolModelo rolModelo) {
        this.rolModelo = rolModelo;
        usuarios = new ArrayList<>(); // Inicializar la lista
        siguienteLegajo = 1;
        usuarios.add(new Usuario(siguienteLegajo++, 28134756, "Juan", "Perez", "2589", rolModelo.getRolPorID(1)));
        usuarios.add(new Usuario(siguienteLegajo++, 29345871, "Maria", "Gomez", "3691", rolModelo.getRolPorID(2)));
        usuarios.add(new Usuario(siguienteLegajo++, 30781245, "Carlos", "Lopez", "4813", rolModelo.getRolPorID(3)));
        usuarios.add(new Usuario(siguienteLegajo++, 32814567, "Ana", "Rodriguez", "5924", rolModelo.getRolPorID(4)));
        usuarios.add(new Usuario(siguienteLegajo++, 29475683, "Luis", "Fernandez", "6048", rolModelo.getRolPorID(4)));
        usuarios.add(new Usuario(siguienteLegajo++, 30019874, "Sofia", "Martinez", "7159", rolModelo.getRolPorID(4)));
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(int dni, String nombre, String apellido, String password, int rolId) {
        Rol rol = null;
        for (Rol r : rolModelo.getRoles()) {
            if (r.getId() == rolId) {
                rol = r;
                break;
            }
        }
        if (rol != null) {
            Usuario usuario = new Usuario(siguienteLegajo++, dni, nombre, apellido, password, rol);
            usuarios.add(usuario);
        } else {
            System.out.println("Rol no encontrado");
        }
    }

    public void eliminarUsuario(int legajo) {
        Usuario usuarioAEliminar = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getLegajo() == legajo) {
                usuarioAEliminar = usuario;
                break; // Salimos del bucle al encontrar el usuario
            }
        }

        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar);
            System.out.println("Usuario con legajo " + legajo + " eliminado.");
        } else {
            System.out.println("Usuario no encontrado con legajo " + legajo + ".");
        }
    }

    public Usuario getUsuarioPorLegajo(int legajo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLegajo() == legajo) {
                return usuario;
            }
        }
        return null;
    }
}