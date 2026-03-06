package ito.poo2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.Period;


public class Paciente {
    private String nombre;
    private String rfc;
    private LocalDate fechaNacimineto;
    private List<Consulta> consulta;

    public Paciente(String nombre, String rfc, LocalDate fechaNacimineto) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.fechaNacimineto = fechaNacimineto;
        this.consulta = new ArrayList<>();
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

    public List<Consulta> obtenerConsultas() {
        return consulta;
    }
    public void agregarConsulta(Consulta nuevaConsulta) {
        consulta.add(nuevaConsulta);
    }
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        // Period nos da la diferencia entre dos fechas
        Period diferencia = Period.between(fechaNacimineto, hoy);
        return diferencia.getYears();
    }
    public int obtenerEdad() {
        return calcularEdad();
    }
}
