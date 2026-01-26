package cl.speedfast;

public class PedidoEncomienda extends Pedido implements Despachable {

    public PedidoEncomienda(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidorAsignado = "Daniela Aclara";
    }

    @Override
    public int calcularTiempoEntrega() {
        return 20 + (int) Math.round(distanciaKm * 1.5);
    }

    @Override
    public void despachar() {
        System.out.println("Pedido despachado correctamente.");
    }

}