package Modelo;

import java.util.*;

public class VIP extends Normal { // Segundo Nivel de Herencia

    private List<String> otrosServicios;
    private final double recargo = 0.30;

    public VIP() {
        this.otrosServicios = new ArrayList<>();
    }

    public VIP(String tipoAsiento, List<String> otrosServicios) {
        super(tipoAsiento);
        this.incluyeTV = true;
        this.incluyeInternet = true;
        this.maletasIncluidas = 2;
        this.otrosServicios = otrosServicios;
    }

    @Override
    public double calcularPrecioFinal(double base) {
        return base * (1 + recargo) + (maletasExtra * 5.0);
    }

    @Override
    public String getDetalleServicio() {
        return "Servicio VIP --- Asiento: " + tipoAsiento + " --- Otros servicios adicionales: " + otrosServicios;
    }

    public List<String> getOtrosServicios() { return otrosServicios; }
    public void setOtrosServicios(List<String> otrosServicios) { this.otrosServicios = otrosServicios; }

}
