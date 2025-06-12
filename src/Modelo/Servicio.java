package Modelo;

public abstract class Servicio {

    protected boolean incluyeTV;
    protected boolean incluyeInternet;
    protected int maletasIncluidas;
    protected int maletasExtra;

    public Servicio() {} // Constructor vacio

    public Servicio(boolean incluyeTV, boolean incluyeInternet, int maletasIncluidas, int maletasExtra) {
        this.incluyeTV = incluyeTV;
        this.incluyeInternet = incluyeInternet;
        this.maletasIncluidas = maletasIncluidas;
        this.maletasExtra = maletasExtra;
    }

    public abstract double calcularPrecioFinal(double base);
    public abstract String getDetalleServicio();

    // Getters & Setters

    public boolean isIncluyeTV() { return incluyeTV; }
    public void setIncluyeTV(boolean incluyeTV) { this.incluyeTV = incluyeTV; }

    public boolean isIncluyeInternet() { return incluyeInternet; }
    public void setIncluyeInternet(boolean incluyeInternet) { this.incluyeInternet = incluyeInternet; }

    public int getMaleatasIncluidas() { return maletasIncluidas; }
    public void setMaletasIncluidas(int maletasIncluidas) { this.maletasIncluidas = maletasIncluidas; }

    public int getMaletasExtra() { return maletasExtra; }
    public void setMaletasExtra(int maletasExtra) { this.maletasExtra = maletasExtra; }

}
