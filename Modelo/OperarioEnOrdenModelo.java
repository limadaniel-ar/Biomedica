package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Objeto.Etapa;
import Objeto.OperarioEnOrden;
import Objeto.OrdenProduccion;
import Objeto.Usuario;

public class OperarioEnOrdenModelo {
    private List<OperarioEnOrden> operarios;
    private OrdenProduccionModelo ordenProduccionModelo;
    private UsuarioModelo usuarioModelo;
    private EtapaModelo etapaModelo;

    public OperarioEnOrdenModelo(OrdenProduccionModelo ordenProduccionModelo, UsuarioModelo usuarioModelo,
            EtapaModelo etapaModelo) {
        this.ordenProduccionModelo = ordenProduccionModelo;
        this.usuarioModelo = usuarioModelo;
        this.etapaModelo = etapaModelo;
        operarios = new ArrayList<>();
    }

    public List<OperarioEnOrden> getOperariosEnOrdenes() {
        return operarios;
    }

    public void addOperarioEnOrden(int idOrdenProduccion, int legajoUsuario, int idEtapa, LocalDateTime inicio) {
        OrdenProduccion ordenProduccion = null;
        Usuario usuario = null;
        Etapa etapa = null;
        int id = operarios.size() + 1;
        for (OrdenProduccion o : ordenProduccionModelo.getOrdenes()) {
            if (o.getId() == idOrdenProduccion) {
                ordenProduccion = o;
                break;
            }
        }
        for (Usuario u : usuarioModelo.getUsuarios()) {
            if (u.getLegajo() == legajoUsuario) {
                usuario = u;
                break;
            }
        }
        for (Etapa e : etapaModelo.getEtapas()) {
            if (e.getId() == idEtapa) {
                etapa = e;
                break;
            }
        }
        if (ordenProduccion != null && usuario != null && etapa != null) {
            OperarioEnOrden operarioEnOrden = new OperarioEnOrden(id, ordenProduccion, usuario, etapa, inicio);
            operarios.add(operarioEnOrden);
        } else {
            System.out.println("Error, revise Orden de Producción, Operario y Etapa");
        }
    }

    public OperarioEnOrden getOperarioPorOrdenLegajoYEtapa(int idOrden, int legajoUsuario, int idEtapa) {
        for (OperarioEnOrden operarioEnOrden : operarios) {
            if (operarioEnOrden.getOrdenProduccion().getId() == idOrden
                    && operarioEnOrden.getUsuario().getLegajo() == legajoUsuario
                    && operarioEnOrden.getEtapa().getId() == idEtapa) {
                return operarioEnOrden;
            }
        }
        return null;
    }

    public List<OperarioEnOrden> getOperariosEnOrden(int idOrden) {
        List<OperarioEnOrden> salida;
        salida = new ArrayList<>();
        for (OperarioEnOrden operarioEnOrden : operarios) {
            if (operarioEnOrden.getOrdenProduccion().getId() == idOrden) {
                salida.add(operarioEnOrden);
            }
        }
        return salida;
    }

    public List<OperarioEnOrden> getOperariosEnOrdenYEtapa(int idOrden, int idEtapa) {
        List<OperarioEnOrden> salida;
        salida = new ArrayList<>();
        for (OperarioEnOrden operarioEnOrden : operarios) {
            if (operarioEnOrden.getOrdenProduccion().getId() == idOrden
                    && operarioEnOrden.getEtapa().getId() == idEtapa) {
                salida.add(operarioEnOrden);
            }
        }
        return salida;
    }
}
