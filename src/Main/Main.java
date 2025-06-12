package Main;

import Modelo.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE COMPRA DE PASAJES EL BÚHO ---");
            System.out.println("1. Crear ticket");
            System.out.println("2. Ver tickets");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    crearTicket();
                    break;
                case 2:
                    verTickets();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    private static void crearTicket() {
        System.out.println("\n--- CREAR TICKET ---");

        System.out.print("Nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        Pasajero pasajero = new Pasajero(nombre, cedula, telefono, correo);

        System.out.println("\nSeleccione ruta:");
        System.out.println("1. Quito - Guayaquil ($20)");
        System.out.println("2. Quito - Tulcán ($17.5)");
        System.out.println("3. Quito - Puyo ($15)");
        System.out.println("4. Quito - Riobamba ($17.5)");
        int r = Integer.parseInt(scanner.nextLine());
        Ruta ruta;
        switch (r) {
            case 1 -> ruta = new Ruta("Quito", "Guayaquil", 20);
            case 2 -> ruta = new Ruta("Quito", "Tulcán", 17.5);
            case 3 -> ruta = new Ruta("Quito", "Puyo", 15);
            case 4 -> ruta = new Ruta("Quito", "Riobamba", 17.5);
            default -> {
                System.out.println("Ruta inválida, se asignará Quito - Puyo");
                ruta = new Ruta("Quito", "Puyo", 15);
            }
        }

        System.out.println("\nSeleccione tipo de servicio:");
        System.out.println("1. Normal");
        System.out.println("2. VIP");
        int s = Integer.parseInt(scanner.nextLine());

        Servicio servicio;
        System.out.print("Tipo de asiento (ventana/pasillo/adelante/final): ");
        String tipoAsiento = scanner.nextLine();

        if (s == 1) {
            servicio = new Normal(tipoAsiento);
        } else {
            List<String> extras = new ArrayList<>();
            System.out.print("Ingrese servicio adicional 1: ");
            extras.add(scanner.nextLine());
            System.out.print("Ingrese servicio adicional 2: ");
            extras.add(scanner.nextLine());
            servicio = new VIP(tipoAsiento, extras);
        }

        System.out.print("¿Cuántas maletas extra?: ");
        int extra = Integer.parseInt(scanner.nextLine());
        servicio.setMaletasExtra(extra);

        Ticket ticket = new Ticket(pasajero, ruta, servicio);
        tickets.add(ticket);
        System.out.println("\nTicket creado exitosamente:\n" + ticket.mostrarTicket());
    }

    private static void verTickets() {
        if (tickets.isEmpty()) {
            System.out.println("\nNo hay tickets registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE TICKETS ---");
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println("\nTicket #" + (i + 1));
            System.out.println(tickets.get(i).mostrarTicket());
        }
    }
}
