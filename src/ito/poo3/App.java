package ito.poo3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo(
                "Toyota",
                "Hilux",
                1200,
                LocalDate.of(2020,5,10)
        );

        Viaje viaje1 = new Viaje(
                "Puebla",
                "Av Reforma 120",
                LocalDate.of(2024,3,10),
                LocalDate.of(2024,3,12),
                "Electrodomesticos",
                15000
        );

        Viaje viaje2 = new Viaje(
                "CDMX",
                "Av Juarez 55",
                LocalDate.of(2024,4,1),
                LocalDate.of(2024,4,3),
                "Muebles",
                20000
        );

        vehiculo1.asignarViaje(viaje1);
        vehiculo1.asignarViaje(viaje2);

        System.out.println(vehiculo1);

        vehiculo1.darBajaViaje(viaje1);

        System.out.println("\nDespues de cancelar un viaje:");
        System.out.println(vehiculo1);
    }
}
