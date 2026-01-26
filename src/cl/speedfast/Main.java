package cl.speedfast;


import java.util.ArrayList;
import java.util.List;

public class Main implements Rastreable {

    private static final List<String> HISTORIAL = new ArrayList<>();

    private static final String SEPARADOR = "\n---------------------------------\n";

    public static void main(String[] args) {

        System.out.println("== Sistema SpeedFast | Simulacion de Pedidos ==\n");

        // 1) Pedido de comida con asignacion automatica
        System.out.println("PEDIDO DE COMIDA\n");
        PedidoComida p1 = new PedidoComida(101, "Calle 5 Norte 123", 4);
        p1.asignarRepartidor(); // sobrescritura
        p1.mostrarResumen();
        p1.despachar();
        registrarEntrega(p1);

        System.out.println(SEPARADOR);

        // Sobrecarga
        System.out.println("PEDIDO ENCOMIENDA\n");
        PedidoEncomienda p2 = new PedidoEncomienda(102, "Av. Santa Rosa 567", 7);
        p2.asignarRepartidor("Daniela Tapia"); // sobrecarga
        p2.mostrarResumen();
        p2.despachar();
        registrarEntrega(p2);

        System.out.println(SEPARADOR);

        // 3) Pedido express --> cancelar
        PedidoExpress p3 = new PedidoExpress(103, "Av. Libertad 999", 6);
        System.out.println("Cancelando Pedido Express #" + p3.getId() + "...");
        p3.cancelar();

        System.out.println(SEPARADOR);

        // 4) Historial
        mostrarHistorial();

        System.out.println("\nIntentando despachar Pedido Express cancelado #" + p3.getId() + "...");
        p3.despachar();

        System.out.println("\n== Fin de la simulacion ==");
    }

    private static void registrarEntrega(Pedido pedido) {
        String registro = pedido.getTipoPedido() + " #" + pedido.getId()
                + "- entregado por " + pedido.getRepartidorAsignado();
        HISTORIAL.add(registro);
    }

    private static void mostrarHistorial() {
        System.out.println("Historial:");
        if (HISTORIAL.isEmpty()) {
            System.out.println("- (sin registros)");
            return;
        }
        for (String item : HISTORIAL) {
            System.out.println("- " + item);
        }
    }

    @Override
    public List<String> verHistorial() {
        return HISTORIAL;
    }
}
