package ito.poo2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Juan Lopez Garcia", "LOGJ850312AB1", LocalDate.of(1985, 3, 12));
        System.out.println("Datos del paciente");
        System.out.println("Nombre: " + paciente1.obtenerNombre());
        System.out.println("RFC: " + paciente1.obtenerRfc());
        System.out.println("Fecha de nacimiento: " + paciente1.obtenerFecNacimiento());
        System.out.println("Edad: " + paciente1.obtenerEdad() + " años");

        List<Sintoma> listaSintomas1 = new ArrayList<>();
        listaSintomas1.add(new Sintoma("dolor de cabeza y fiebre", 38.5f, 70.0f, 1.70f));
        listaSintomas1.add(new Sintoma("congestion nasal", 38.5f, 70.0f, 1.70f));

        List<Diagnostico> listaDiagnosticos1 = new ArrayList<>();
        listaDiagnosticos1.add(new Diagnostico("Gripe comun"));
        listaDiagnosticos1.add(new Diagnostico("Rinitis alergica"));

        List<String> medicamentos1 = new ArrayList<>();
        medicamentos1.add("Paracetamol 500mg cada 8 horas");
        medicamentos1.add("Loratadina 10mg cada 24 horas");

        List<String> recomendaciones1 = new ArrayList<>();
        recomendaciones1.add("Tomar mucha agua");
        recomendaciones1.add("Descansar por lo menos 2 dias");
        recomendaciones1.add("Regresar si la fiebre no baja en 3 dias");

        Receta receta1 = new Receta(medicamentos1, recomendaciones1);

        Consulta consulta1 = new Consulta(
                LocalDate.of(2024, 11, 5),
                listaSintomas1,
                listaDiagnosticos1,
                receta1
        );
        paciente1.agregarConsulta(consulta1);

        List<Sintoma> listaSintomas2 = new ArrayList<>();
        listaSintomas2.add(new Sintoma("dolor de estomago", 36.8f, 70.2f, 1.70f));

        List<Diagnostico> listaDiagnosticos2 = new ArrayList<>();
        listaDiagnosticos2.add(new Diagnostico("Gastritis"));

        List<String> medicamentos2 = new ArrayList<>();
        medicamentos2.add("Omeprazol 20mg en ayunas");

        List<String> recomendaciones2 = new ArrayList<>();
        recomendaciones2.add("Evitar comida picante y grasosa");
        recomendaciones2.add("No tomar cafe ni alcohol");

        Receta receta2 = new Receta(medicamentos2, recomendaciones2);

        Consulta consulta2 = new Consulta(
                LocalDate.of(2025, 2, 20),
                listaSintomas2,
                listaDiagnosticos2,
                receta2
        );

        paciente1.agregarConsulta(consulta2);

        System.out.println("\n=== Expediente de consultas ===");
        System.out.println("Total de consultas: " + paciente1.obtenerConsultas().size());

        int numero = 1;
        for (Consulta c : paciente1.obtenerConsultas()) {
            System.out.println("\n--- Consulta #" + numero + " ---");
            System.out.println("Fecha: " + c.obtenerFecha());

            System.out.println("Sintomas:");
            for (Sintoma s : c.obtenerSintomas()) {
                System.out.println("  - " + s.obtenerDescripcion());
                System.out.println("    Temperatura: " + s.obtenerTemperatura() + " C");
                System.out.println("    Peso: " + s.obtenerPeso() + " kg");
                System.out.println("    Estatura: " + s.obtenerEstatura() + " m");
            }
            System.out.println("Diagnostico(s):");
            for (Diagnostico d : c.obtenerDiagnostico()) {
                System.out.println("  - " + d.obtenerPadecimiento());
            }
            System.out.println("Medicamentos:");
            for (String med : c.obtenerReceta().obtenerMedicamentos()) {
                System.out.println("  - " + med);
            }
            System.out.println("Recomendaciones:");
            for (String rec : c.obtenerReceta().obtenerRecomendaciones()) {
                System.out.println("  - " + rec);
            }

            numero++;
        }
    }
}
