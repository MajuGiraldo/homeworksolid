package modelo;
import java.util.ArrayList;
import java.util.List;

public abstract class Estudiante {

    public String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    abstract public void mostrarMaterias();

    abstract public Envio mostrarMensaje();

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
