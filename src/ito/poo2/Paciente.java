package ito.poo2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.Period;


public class Paciente {
    private String nombre;
    private String rfc;
    private LocalDate fechaNacimineto;
    private ArrayList<Consulta> consultas;

    public Paciente(String nombre, String rfc, LocalDate fechaNacimineto) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.fechaNacimineto = fechaNacimineto;
        this.consultas = new ArrayList<Consulta>(); // La lista de consultas empieza vacia, se van agregando despues
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerRfc() {
        return rfc;
    }

    public LocalDate obtenerFecNacimiento() {
        return fechaNacimineto;
    }

    public ArrayList<Consulta> obtenerConsultas() {
        return consultas;
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public int calcularEdad() {
        // con este comando se obtiene la fecha de hoy
        LocalDate hoy = LocalDate.now();
        // aqui se calcula la diferencia entre hoy y la fecha de nacimiento
        int edad = Period.between(fechaNacimineto, hoy).getYears();
        return edad;
    }

    public String toString() {
        return "Nombre: " + nombre + " | RFC: " + rfc + " | Fecha de nacimiento: " + fechaNacimineto + " | Edad: " + calcularEdad() + " años" +
                " | Total de consultas: " + consultas.size();
    }
}
