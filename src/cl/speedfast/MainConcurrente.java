package cl.speedfast;

import cl.speedfast.concurrente.Repartidor;
import cl.speedfast.concurrente.ZonaDeCarga;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainConcurrente {

    public static void main(String[] args) {

        System.out.println("== SpeedFast | Simulación Concurrente ==");

        ZonaDeCarga zona = new ZonaDeCarga();

        zona.agregarPedido(new PedidoComida(201, "Santiago Centro", 4.0));
        zona.agregarPedido(new PedidoEncomienda(202, "Providencia", 6.5));
        zona.agregarPedido(new PedidoExpress(203, "Ñuñoa", 3.2));
        zona.agregarPedido(new PedidoComida(204, "Recoleta", 5.1));
        zona.agregarPedido(new PedidoExpress(205, "Las Condes", 8.0));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Repartidor("Juan", zona));
        executor.execute(new Repartidor("Camila", zona));
        executor.execute(new Repartidor("Pedro", zona));

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Todos los pedidos han sido entregados correctamente");
    }
}
