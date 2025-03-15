package org.gestorproyectos.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TareaFactoryTest {
    @Test
    void testCrearTareaSimple() {
        Tarea tarea = TareaFactory.crearTarea("simple");
        assertNotNull(tarea);
        assertTrue(tarea instanceof TareaSimple);
    }

    @Test
    void testCrearTareaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            TareaFactory.crearTarea("desconocido");
        });
    }
}
