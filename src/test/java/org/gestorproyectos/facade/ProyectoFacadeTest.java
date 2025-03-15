package org.gestorproyectos.facade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ProyectoFacadeTest {
    @Test
    void testIniciarProyecto() {
        ProyectoFacade facade = new ProyectoFacade();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        facade.iniciarProyecto("Gestor de Tareas", "Juan Perez");

        String salida = outputStream.toString().trim();
        assertTrue(salida.contains("Usuario validado") && salida.contains("Proyecto creado"));
    }
}
