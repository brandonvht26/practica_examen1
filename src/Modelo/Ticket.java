package Modelo;

class Ticket {

    private Pasajero pasajero;
    private Ruta ruta;
    private Servicio servicio;

    public Ticket() {}

    public Ticket(Pasajero pasajero, Ruta ruta, Servicio servicio) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.servicio = servicio;
    }

    // Getters & Setters

    public Pasajero getPasajero() { return pasajero; }
    public void setPasajero(Pasajero pasajero) { this.pasajero = pasajero; }

    public Ruta getRuta() { return ruta; }
    public void setRuta(Ruta ruta) { this.ruta = ruta; }

    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }

    public double calcularPrecio() {
        return servicio.calcularPrecioFinal(ruta.getPrecio());
    }

    public String mostrarTicket() {
        return pasajero.obtenerInfo() + "\n" +
                "Ruta: " + ruta.obtenerInfo() + "\n" +
                servicio.getDetalleServicio() + "\n" +
                "Precio final: $" + calcularPrecio();
    }

}
