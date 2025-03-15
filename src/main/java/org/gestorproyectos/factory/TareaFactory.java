package org.gestorproyectos.factory;

public class TareaFactory {
    public static Tarea crearTarea(String tipo) {
        switch (tipo.toLowerCase()) {
            case "simple": return new TareaSimple();
            case "compleja": return new TareaCompleja();
            default: throw new IllegalArgumentException("Tipo de tarea no soportado");
        }
    }
}
