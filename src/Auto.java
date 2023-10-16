public class Auto {
    // Atributo
    private double velocidadMedia = 80; // en km/h

    public double calcularTiempoAuto(double distancia) {
        // Calcula el tiempo en horas
        double tiempoAuto = (distancia / velocidadMedia)*60;
        return tiempoAuto;
    }
}
