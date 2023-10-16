public class Bicicleta {
    // Atributo
    private double velocidadMedia = 15; // en km/h

    public double calcularTiempoBicicleta(double distancia) {
        // Calcula el tiempo en horas
        double tiempoBicicleta = (distancia / velocidadMedia)*60;
        return tiempoBicicleta;
    }
}
