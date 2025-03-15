package org.gestorproyectos.observer;

import java.util.ArrayList;
import java.util.List;


public class TareaObservador {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador o) { observadores.add(o); }

    public void cambiarEstado() {
        for (Observador o : observadores) o.actualizar("Tarea actualizada");
    }

}
