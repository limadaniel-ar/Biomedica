import Controlador.UsuarioControlador;
import Modelo.RolModelo;
import Vista.LoginVista;

public class Main {
    public static void main(String[] args) {
        RolModelo rolModelo = new RolModelo();
        UsuarioControlador controlador = new UsuarioControlador(rolModelo);
        LoginVista loginVista = new LoginVista(controlador);

        loginVista.mostrarLogin();
    }
}
