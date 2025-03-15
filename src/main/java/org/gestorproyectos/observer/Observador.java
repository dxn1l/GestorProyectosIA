package org.gestorproyectos.observer;


// 3. PATRÓN DE COMPORTAMIENTO - OBSERVER
// Permite que los usuarios sean notificados cuando una tarea cambia de estado

public interface Observador {
    void actualizar(String mensaje);
}
