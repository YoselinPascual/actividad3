package ito.poo2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // se crean listas para la primera consulta del primer paciente
        ArrayList<String> sintomas1 = new ArrayList<String>();
        sintomas1.add("Temperatura: 38.5 C");
        sintomas1.add("Peso: 70 kg");
        sintomas1.add("Estatura: 1.70 m");
        sintomas1.add("Dolor de cabeza");
        sintomas1.add("Congestion nasal");

        ArrayList<String> diagnostico1 = new ArrayList<String>();
        diagnostico1.add("Gripe comun");
        diagnostico1.add("Rinitis alergica");

        ArrayList<String> receta1 = new ArrayList<String>();
        receta1.add("Paracetamol 500mg cada 8 horas");
        receta1.add("Loratadina 10mg cada 24 horas");
        receta1.add("Tomar mucha agua");
        receta1.add("Reposo por 3 dias");

        // se crea el objeto de la primera consulta
        Consulta consulta1 = new Consulta(LocalDate.of(2025,
                1,
                15),
                sintomas1, diagnostico1, receta1);

        // se crean listas para la segunda consulta del segundo paciente
        ArrayList<String> sintomas2 = new ArrayList<String>();
        sintomas2.add("Temperatura: 37.0 C");
        sintomas2.add("Peso: 69 kg");
        sintomas2.add("Estatura: 1.70 m");
        sintomas2.add("Dolor de estomago");

        ArrayList<String> diagnostico2 = new ArrayList<String>();
        diagnostico2.add("Gastritis leve");

        ArrayList<String> receta2 = new ArrayList<String>();
        receta2.add("Omeprazol 20mg en ayunas");
        receta2.add("Evitar comidas picantes");
        receta2.add("No saltarse comidas");

        // se crea el objeto de la segunda consulta
        Consulta consulta2 = new Consulta(LocalDate.of(2025,
                6,
                20),
                sintomas2, diagnostico2, receta2);

        // se crea el paciente 1 y agregamos sus consultas
        Paciente paciente1 = new Paciente("Ana Garcia Lopez",
                "GALA900310HDF",
                LocalDate.of(1990, 3, 10));

        // se agregan las consultas al paciente
        paciente1.agregarConsulta(consulta1);
        paciente1.agregarConsulta(consulta2);

        // se crean listas para la consulta del paciente 2
        ArrayList<String> sintomas3 = new ArrayList<String>();
        sintomas3.add("Temperatura: 36.8 C");
        sintomas3.add("Peso: 85 kg");
        sintomas3.add("Estatura: 1.75 m");
        sintomas3.add("Dolor en rodilla derecha");

        ArrayList<String> diagnostico3 = new ArrayList<String>();
        diagnostico3.add("Esguince de rodilla grado 1");

        ArrayList<String> receta3 = new ArrayList<String>();
        receta3.add("Ibuprofeno 400mg cada 12 horas");
        receta3.add("Aplicar hielo 20 minutos cada 4 horas");
        receta3.add("Reposo relativo por 1 semana");

        Consulta consulta3 = new Consulta(LocalDate.of(2025, 11, 5), sintomas3, diagnostico3, receta3);

        // se crea al paciente 2
        Paciente paciente2 = new Paciente("Carlos Mendoza Ruiz",
                "MERC850715HMC",
                LocalDate.of(1985, 7, 15));

        paciente2.agregarConsulta(consulta3);

        // se muestra la información de los pacientes
        System.out.println("\n EXPEDIENTE PACIENTE 1: ");
        System.out.println(paciente1);

        System.out.println("\n DETALLE DE SUS CONSULTAS: ");
        for (int i = 0; i < paciente1.obtenerConsultas().size(); i++) {
            System.out.println("\n  Consulta #" + (i + 1) + ":");
            System.out.println("  " + paciente1.obtenerConsultas().get(i));
        }

        System.out.println("\n EXPEDIENTE PACIENTE 2: ");
        System.out.println(paciente2);

        System.out.println("\n DETALLE DE SUS CONSULTAS: ");
        for (int i = 0; i < paciente2.obtenerConsultas().size(); i++) {
            System.out.println("\n  Consulta #" + (i + 1) + ":");
            System.out.println("  " + paciente2.obtenerConsultas().get(i));
        }

        // se prueba agregar un sintoma y un medicamento extra
        System.out.println("Agregando un sintoma extra a la consulta 1 de Ana...");
        consulta1.agregarSintoma("Tos seca");

        System.out.println("Agregando un medicamento extra a la consulta 1 de Ana...");
        consulta1.agregarMedicamento("Jarabe para la tos cada 8 horas");

        System.out.println("\nConsulta 1 actualizada:");
        System.out.println(consulta1);
    }
}
