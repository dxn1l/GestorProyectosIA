package org.gestorproyectos;

import org.gestorproyectos.facade.ProyectoFacade;
import org.gestorproyectos.factory.Tarea;
import org.gestorproyectos.factory.TareaFactory;
import org.gestorproyectos.observer.TareaObservador;
import org.gestorproyectos.observer.Usuario;

public class Main {
    public static void main(String[] args) {
        // Uso de Factory Method
        Tarea tarea = TareaFactory.crearTarea("simple");
        tarea.ejecutar();

        // Uso de Facade
        ProyectoFacade facade = new ProyectoFacade();
        facade.iniciarProyecto("Sistema de Gestión", "Juan Perez");

        // Uso de Observer
        TareaObservador tareaObservada = new TareaObservador();
        Usuario usuario1 = new Usuario("María");
        Usuario usuario2 = new Usuario("Carlos");

        tareaObservada.agregarObservador(usuario1);
        tareaObservada.agregarObservador(usuario2);

        tareaObservada.cambiarEstado();
    }
}
