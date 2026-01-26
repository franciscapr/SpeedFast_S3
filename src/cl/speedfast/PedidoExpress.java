package cl.speedfast;

public class PedidoExpress extends Pedido implements Despachable, Cancelable {

    private boolean cancelado;

    public PedidoExpress(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
        this.cancelado = false;
    }

    @Override
    public void asignarRepartidor() {
        this.repartidorAsignado = "Sofia Vergara";
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10 + (int) Math.round(distanciaKm * 2.5);
        if (distanciaKm > 8) tiempo += 10;
        return tiempo;
    }

    @Override
    public void despachar() {
        if (cancelado) {
            System.out.println("No se puede despachar: el pedido esta cancelado.");
            return;
        }
        System.out.println("Pedido despachado correctamente.");
    }

    @Override
    public void cancelar() {
        this.cancelado = true;
        System.out.println("-> Pedido cancelado exitosamente.");
    }

    public boolean isCancelado() {
        return cancelado;
    }
}
