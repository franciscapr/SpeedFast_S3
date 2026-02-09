package cl.speedfast.concurrente;

import cl.speedfast.Pedido;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZonaDeCarga {

    private final BlockingQueue<Pedido> pedidos = new LinkedBlockingQueue<>();

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido #" + pedido.getId() + " agregado. Destino: " + pedido.getDireccion());
    }

    public Pedido retirarPedido() {
        return pedidos.poll();
    }

    public boolean estaVacia() {
        return pedidos.isEmpty();
    }
}
