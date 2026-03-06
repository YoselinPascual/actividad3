package ito.poo2;
import java.time.LocalDate;
import java.util.List;

public class Consulta {
    private LocalDate fecha;
    private List<Sintoma> sintomas;
    private List<Diagnostico> diagMedico;
    private Receta receta;

    public Consulta(LocalDate fecha, List<Sintoma> sintomas, List<Diagnostico> diagMedico, Receta receta) {
        this.fecha = fecha;
        this.sintomas = sintomas;
        this.diagMedico = diagMedico;
        this.receta = receta;
    }

    public LocalDate obtenerFecha() {
        return fecha;
    }

    public List<Sintoma> obtenerSintomas() {
        return sintomas;
    }

    public List<Diagnostico> obtenerDiagnostico() {
        return diagMedico;
    }

    public Receta obtenerReceta() {
        return receta;
    }
}
