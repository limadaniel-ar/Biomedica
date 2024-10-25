package Vista;

import java.util.Scanner;
import Controlador.UsuarioControlador;
import Objeto.Usuario;

public class LoginVista {
    private Scanner scanner = new Scanner(System.in);
    private UsuarioControlador controlador;

    public LoginVista(UsuarioControlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarLogin() {
        System.out.print("Ingrese Legajo: ");
        int legajo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        System.out.print("Ingrese Password: ");
        String password = scanner.nextLine();

        Usuario usuario = controlador.iniciarSesion(legajo, password);
        if (usuario != null) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario.getNombre() + "!");
            redirigirPorRol(usuario);
        } else {
            System.out.println("Credenciales incorrectas. Intente nuevamente.");
        }
    }

    private void redirigirPorRol(Usuario usuario) {
        // Redirigir según el rol del usuario
        switch (usuario.getRol().getId()) {
            case 1:
                // Lógica para el Director
                System.out.println("Acceso a funciones de Director.");
                break;
            case 2:
                // Lógica para el Jefe de Producción
                System.out.println("Acceso a funciones de Jefe de Producción.");
                break;
            case 3:
                // Lógica para el Jefe de Planificación
                System.out.println("Acceso a funciones de Jefe de Planificación.");
                break;
            case 4:
                // Lógica para el Operario
                System.out.println("Acceso a funciones de Operario.");
                break;
            default:
                System.out.println("Rol " + usuario.getRol().getTipo() + " no autorizado para ingresar al sistema.");
                break;
        }
    }
}

