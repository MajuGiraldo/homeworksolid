package service;

import modelo.Envio;
import modelo.Estudiante;

import java.util.ArrayList;

public class EnvioMaterial {
    //Principio Solid Open/closed
    public void enviarMaterialEstudiante(Estudiante estudiante) {
        EmailOutlook email = new EmailOutlook();
        email.enviarEmail(estudiante.mostrarMensaje());
    }
}
