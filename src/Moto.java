public class Moto {
    // Atributo
    private double velocidadMedia = 50; // en km/h

    public double calcularTiempoMoto(double distancia) {
        // Calcula el tiempo en horas
        double tiempoMoto = (distancia / velocidadMedia)*60;
        return tiempoMoto;
    }
}
