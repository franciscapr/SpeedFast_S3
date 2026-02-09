package cl.speedfast;

public abstract class Pedido {

    protected int id;
    protected String direccion;
    protected double distanciaKm;
    protected String repartidorAsignado;
    // Agregamos EstadoPedido
    protected EstadoPedido estado;


    public Pedido(int id, String direccion, double distanciaKm) {
        this.id = id;
        this.direccion = direccion;
        this.distanciaKm = distanciaKm;
        this.repartidorAsignado = "No asignado";
        // Agregamos EstadoPedido al constructor
        this.estado = EstadoPedido.PENDIENTE;
    }

    // Poliformismo por sobrescritura
    public void asignarRepartidor() {
        this.repartidorAsignado = "Repartidor Asignado";
    }

    // Poliformismo por sobrecarga
    public void asignarRepartidor(String nombre) {
        this.repartidorAsignado = nombre;
    }

    // Creamos un método para mostrar el resumen
    public void mostrarResumen() {
        System.out.println("Pedido #" + id);
        System.out.println("Direccion: " + direccion);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Repartidor asignado: " + repartidorAsignado);
        // Actualizamos mostrarResumen
        System.out.println("Estado: " + estado);
        System.out.println("Tiempo estimado: " + calcularTiempoEntrega() + " minutos");
    }

    // Método de abstracción
    public abstract int calcularTiempoEntrega();

    public int getId() {
        return id;
    }

    public String getRepartidorAsignado() {
        return repartidorAsignado;
    }

    public String getTipoPedido() {
        return this.getClass().getSimpleName();
    }

    // Agregamos los Getters y Setter del estado
    public EstadoPedido getEstado() {
        return estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

}