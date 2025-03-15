package org.example.gestorproyectos.facade;

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