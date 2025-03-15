package org.gestorproyectos.facade;


// 2. PATRÓN ESTRUCTURAL - FACADE
// Proporciona una interfaz unificada para gestionar proyectos y usuarios

public class ProyectoFacade {
    private ProyectoService proyectoService;
    private UsuarioService usuarioService;

    public ProyectoFacade() {
        this.proyectoService = new ProyectoService();
        this.usuarioService = new UsuarioService();
    }

    public void iniciarProyecto(String nombreProyecto, String usuario) {
        usuarioService.validarUsuario(usuario);
        proyectoService.crearProyecto(nombreProyecto);
    }
}