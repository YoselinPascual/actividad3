package ito.poo2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate fecha;
    private ArrayList<String> sintomas;      // es la lista de os sintomas (incluye temperatura, peso, estatura)
    private ArrayList<String> diagnostico;   // son los padecimientos que tiene el paciente
    private ArrayList<String> receta;        // es la lista de las recomendaciones y medicamentos

    public Consulta(LocalDate fecha, ArrayList<String> sintomas, ArrayList<String> diagnostico, ArrayList<String> receta) {
        this.fecha = fecha;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.receta = receta;
    }

    public LocalDate obtenerFecha() {
        return fecha;
    }

    public ArrayList<String> obtenerSintomas() {
        return sintomas;
    }

    public ArrayList<String> obtenerDiagnostico() {
        return diagnostico;
    }

    public ArrayList<String> obtenerReceta() {
        return receta;
    }

    public void agregarSintoma(String sintoma) {
        sintomas.add(sintoma);
    }

    public void agregarMedicamento(String medicamento) {
        receta.add(medicamento);
    }

    public String toString() {
        return "Fecha de consulta: " + fecha + " | Sintomas: " + sintomas + " | Diagnostico: " + diagnostico + " | Receta: " + receta;
    }
}
