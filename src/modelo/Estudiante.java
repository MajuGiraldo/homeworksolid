package modelo;

public class Estudiante {

    public String nombre;
    public String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }
    //Este método no se utiliza
    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
