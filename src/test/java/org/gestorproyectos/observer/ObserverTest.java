package org.gestorproyectos.observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ObserverTest {
    @Test
    void testNotificacionUsuarios() {
        TareaObservador tareaObservada = new TareaObservador();
        Usuario usuario1 = new Usuario("Maria");
        Usuario usuario2 = new Usuario("Carlos");

        tareaObservada.agregarObservador(usuario1);
        tareaObservada.agregarObservador(usuario2);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        tareaObservada.cambiarEstado();

        String salida = outputStream.toString().trim();
        assertTrue(salida.contains("Maria recibió") && salida.contains("Carlos recibió"));
    }
}
