package ito.poo;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Composicion cancion = new Composicion(
                "El amor",
                3,54,
                "Balada",
                LocalDate.of(2026,03,05)
        );
        cancion.setFechaEstreno(LocalDate.of(2026,4,7));

        Solicitud sol1 = new Solicitud(
                "Luis Miguel",
                LocalDate.of(2026,4,4),
                LocalDate.of(2026,4,13),
                "Sony"
        );
        Solicitud sol2 = new Solicitud(
                "Vicente Fernandez",
                LocalDate.of(2026,4,8),
                LocalDate.of(2026,4,20),
                "Warner Music Group"
        );
        cancion.agregarSolicitud(sol1);
        cancion.agregarSolicitud(sol2);

        System.out.println(cancion.toString());
        System.out.println();
        System.out.println(sol1.toString());
        System.out.println();
        System.out.println(sol2.toString());

        System.out.println("\nTotal de solicitudes: "+cancion.getSolicitudes().size());
        System.out.println("Total de interpretes: "+cancion.getInterpretes().size());

    }
}
