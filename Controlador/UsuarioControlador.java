package Controlador;

import Modelo.RolModelo;
import Modelo.UsuarioModelo;
import Objeto.Usuario;

public class UsuarioControlador {
    private UsuarioModelo usuarioModelo;
    private RolModelo rolModelo;

    public UsuarioControlador(RolModelo rolModelo) {
        this.rolModelo = rolModelo;
        this.usuarioModelo = new UsuarioModelo(rolModelo);
    }

    public Usuario iniciarSesion(int legajo, String password) {
        for (Usuario usuario : usuarioModelo.getUsuarios()) {
            if (usuario.getLegajo() == legajo && usuario.getPassword().equals(password)) {
                return usuario; // Devuelve el usuario si las credenciales son correctas
            }
        }
        return null; // Devuelve null si no se encuentra el usuario
    }
}