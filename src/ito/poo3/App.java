package ito.poo3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Volvo", "FH16", 20000,
                LocalDate.of(2020,5,10));

        Viaje viaje1 = new Viaje(
                "Merida",
                "Av. centro 123",
                LocalDate.of(2026,3,20),
                LocalDate.of(2026,3,22),
                "Electrodomésticos",
                15000
        );

        v1.agregarViaje(viaje1);

        System.out.println(v1);
        System.out.println(viaje1);
    }

}
