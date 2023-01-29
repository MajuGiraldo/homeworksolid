package modelo;

import java.util.ArrayList;

public class Industrial extends Estudiante {
    public Industrial(String nombre) {
        super(nombre);
    }

    public void mostrarMaterias() {
        System.out.println("Procesos, Analitica de datos, Gestion de calidad");
    }

    @Override
    public Envio mostrarMensaje() {
        Envio mensajeIndustrial = new Envio();
        mensajeIndustrial.material = new ArrayList<>();
        mensajeIndustrial.material.add("Calculadora");
        mensajeIndustrial.material.add("Libro ingeniería");
        mensajeIndustrial.saludoDirector = "El director de industrial envia saludos";
        return mensajeIndustrial;
    }


}
