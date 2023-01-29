package main;

import modelo.Administrador;
import modelo.Estudiante;
import modelo.Industrial;
import modelo.Informatico;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatico("Daniel"),
                new Administrador("Monica"),
                new Industrial("Liliana")
        };

        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Informatico("Daniel"));
    }
    //Principio Solid Open/closed
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarMaterias();
        }
    }
}
