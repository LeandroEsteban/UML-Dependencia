import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ValidarTest {

    @Test
    public void nombreValido() {
        String input = "Juan";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner scanner = new Scanner(System.in);
        String nombre = Validar.validarNombre(scanner);

        assertEquals("Juan", nombre);
    }

}

