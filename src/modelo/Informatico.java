package modelo;

import java.util.ArrayList;

public class Informatico extends Estudiante {

    public Informatico(String nombre) {
        super(nombre);
    }

    public void mostrarMaterias() {
        System.out.println("Programacion, Arquitectura, Base de datos");
    }

    public Envio mostrarMensaje() {
        Envio mensajeInformatica = new Envio();
        mensajeInformatica.material = new ArrayList<>();
        mensajeInformatica.material.add("Computador");
        mensajeInformatica.material.add("Mouse");
        mensajeInformatica.saludoDirector = "Jenny envia saludos";
        return mensajeInformatica;
    }
}

