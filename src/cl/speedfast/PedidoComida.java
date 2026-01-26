package cl.speedfast;


public class PedidoComida extends Pedido implements Despachable {

    public PedidoComida(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {

        this.repartidorAsignado = "Luis Miguel";
    }

    @Override
    public int calcularTiempoEntrega() {

        return 15 + (int) Math.round(distanciaKm * 2);
    }

    @Override
    public void despachar() {
        System.out.println("Pedido despachado correctamente.");
    }
}
