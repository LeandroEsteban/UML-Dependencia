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


}

