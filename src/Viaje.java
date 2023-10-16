import java.util.Scanner;

public class Viaje {
    // Atributos
    private String destino;
    private double distancia;

    public void ingresarDestino(String nuevoDestino) {
        this.destino = nuevoDestino;
    }

    public void ingresarDistancia(double nuevaDistancia) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese la distancia (en km): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un número válido.");
                System.out.print("Ingrese la distancia (en km): ");
                scanner.next(); // Limpiar el buffer del scanner
            }
            nuevaDistancia = scanner.nextDouble();
        } while (nuevaDistancia < 0);

        this.distancia = nuevaDistancia;
    }

    public void inicarViaje(){
        Scanner scanner = new Scanner(System.in);

        Persona persona = new Persona();
        String nombre = Validar.validarNombre(scanner);
        persona.ingresarNombre(nombre);

        Viaje viaje = new Viaje();

        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();
        viaje.ingresarDestino(destino);

        System.out.print("Ingrese la distancia (en km): ");
        double distancia = scanner.nextDouble();
        viaje.ingresarDistancia(distancia);

        System.out.print("Ingrese el tipo de vehículo (auto, moto o bicicleta): ");
        String vehiculo = scanner.next().toLowerCase(); // Convierte a minúsculas
        if (!(vehiculo.equals("auto") || vehiculo.equals("moto") || vehiculo.equals("bicicleta"))) {
            System.out.println("Tipo de vehículo no válido.");
            return;
        }

        double tiempoEstimado = 0.0;
        if (vehiculo.equals("auto")) {
            Auto auto = new Auto();
            tiempoEstimado = auto.calcularTiempoAuto(distancia);
        } else if (vehiculo.equals("moto")) {
            Moto moto = new Moto();
            tiempoEstimado = moto.calcularTiempoMoto(distancia);
        } else if (vehiculo.equals("bicicleta")) {
            Bicicleta bicicleta = new Bicicleta();
            tiempoEstimado = bicicleta.calcularTiempoBicicleta(distancia);
        }

        System.out.println(nombre + " el tiempo de viaje para llegar a " + destino + " en " + vehiculo + " es de " + tiempoEstimado + " minutos");

        scanner.close();
    }
}
