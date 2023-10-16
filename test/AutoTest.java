import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoTest {

    @Test
    public void calcularTiempoAuto_DeberiaRetornarTiempoCorrecto() {
        Auto auto = new Auto();
        double distancia = 100; // Supongamos una distancia de 100 km

        double tiempoEstimado = auto.calcularTiempoAuto(distancia);

        // La velocidad media es de 80 km/h, entonces el tiempo debería ser 75 minutos
        assertEquals(75.0, tiempoEstimado, 0.01);
    }

}
