package Modelo;

class Normal extends Servicio { // Primer Nivel de Herencia

    protected String tipoAsiento;

    public Normal() {}

    public Normal(String tipoAsiento) {
        super(false, false, 1, 0);
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public double calcularPrecioFinal(double base) {
        return base + (maletasExtra * 5.0);
    }

    @Override
    public String getDetalleServicio() {
        return "Servicio Normal --- Asiento: " + tipoAsiento;
    }

    // Getters & Setters

    public String getTipoAsiento() { return tipoAsiento; }
    public void setTipoAsiento(String tipoAsiento) { this.tipoAsiento = tipoAsiento; }

}
