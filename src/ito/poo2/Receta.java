package ito.poo2;
import java.util.ArrayList;
import java.util.List;

public class Receta {
    private List<String> medicamentos;
    private List<String> recomendaciones;

    public Receta(List<String> medicamentos, List<String> recomendaciones) {
        this.medicamentos = medicamentos;
        this.recomendaciones = recomendaciones;
    }
    public List<String> obtenerMedicamentos() {
        return medicamentos;
    }
    public List<String> obtenerRecomendaciones() {
        return recomendaciones;
    }
    public void agregarMedicamento(String medicamento) {
        medicamentos.add(medicamento);
    }
    public void agregarRecomendaciones(String recomendacion) {
        recomendaciones.add(recomendacion);
    }
}
