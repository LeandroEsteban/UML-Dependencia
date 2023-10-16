import java.util.Scanner;

public class Validar {
    public static String validarNombre(Scanner scanner) {
        String nombre;
        boolean esValido = false;

        do {
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();

            // Verificar si el nombre contiene solo letras y espacios
            if (nombre.matches("[a-zA-Z\\s]+")) {
                esValido = true;
            } else {
                System.out.println("El nombre debe contener solo letras y espacios.");
            }
        } while (!esValido);

        return nombre;
    }

    public static double validarDistancia(Scanner scanner) {
        double distancia = 0.0;
        boolean esValido = false;

        do {
            System.out.print("Ingrese la distancia (en km): ");

            if (scanner.hasNextDouble()) {
                distancia = scanner.nextDouble();
                if (distancia >= 0) { // Verificar que la distancia sea no negativa
                    esValido = true;
                } else {
                    System.out.println("La distancia debe ser un número positivo o cero.");
                }
            } else {
                System.out.println("La distancia debe ser un número decimal.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (!esValido);

        return distancia;
    }


}

