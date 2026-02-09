package cl.speedfast.concurrente;

import cl.speedfast.EstadoPedido;
import cl.speedfast.Pedido;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zona;

    public Repartidor(String nombre, ZonaDeCarga zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public void run() {
        while (!zona.estaVacia()) {
            Pedido pedido = zona.retirarPedido();
            if (pedido != null) {
                System.out.println("[Repartidor - " + nombre + "] Retirando pedido #" + pedido.getId() +
                        " | Destino: " + pedido.getDireccion());
                pedido.setEstado(EstadoPedido.EN_REPARTO);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                pedido.setEstado(EstadoPedido.ENTREGADO);
                System.out.println("[Repartidor - " + nombre + "] Pedido #" + pedido.getId() + " ENTREGADO | Destino: " + pedido.getDireccion());
            }
        }
    }
}
