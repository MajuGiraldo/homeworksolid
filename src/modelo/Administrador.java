package modelo;

import java.util.ArrayList;

public class Administrador extends Estudiante {

    public Administrador(String nombre) {
        super(nombre);
    }

    public void mostrarMaterias() {
        System.out.println("Negocios, Administracion I, Historia de la administracion");
    }

    @Override
    public Envio mostrarMensaje() {
        Envio mensajeAdministracion = new Envio();
        mensajeAdministracion.material = new ArrayList<>();
        mensajeAdministracion.material.add("Libro administración");
        mensajeAdministracion.material.add("Libro administración 2");
        mensajeAdministracion.saludoDirector = "El director de administración envia saludos";
        return mensajeAdministracion;
    }


}
