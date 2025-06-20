package Modelo;

public class Pasajero {

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    public Pasajero() {}

    public Pasajero(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters & Setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String obtenerInfo() {
        return "Pasajero: " + nombre + ", Cédula: " + cedula + ", Correo: " + correo;
    }
}
