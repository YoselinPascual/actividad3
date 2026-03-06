package ito.poo;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Composicion {
    private String titulo;
    private int duracionMinuto;
    private int duracionSegundo;
    private String genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;
    private ArrayList<String> interpretes;
    private ArrayList<Solicitud> solicitudes;

    public Composicion(String titulo, int duracionMinuto, int duracionSegundo, String genero,
                       LocalDate fechaRegistro) {
        this.titulo = titulo;
        this.duracionMinuto = duracionMinuto;
        this.duracionSegundo = duracionSegundo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;
        this.interpretes = new ArrayList<>();
        this.solicitudes = new ArrayList<Solicitud>();
    }
    public void  agregaInterprete(String nombreInterprete) {
        this.interpretes.add(nombreInterprete);
    }
    public void agregarSolicitud(Solicitud solicitud){
        this.solicitudes.add(solicitud);
        agregaInterprete(solicitud.getNombreInterprete());
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracionMinuto(int duracionMinuto) {
        this.duracionMinuto = duracionMinuto;
    }

    public void setDuracionSegundo(int duracionSegundo) {
        this.duracionSegundo = duracionSegundo;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public ArrayList<String> getInterpretes() {
        return interpretes;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    @Override
    public String toString() {
        String result = "Composicion{" +
                "\nTitulo: " + titulo +
                ", \nDuracion: " + duracionMinuto +":"+
                String.format("%02d",duracionSegundo) +
                ", \nGenero: " + genero  +
                ", \nFechaRegistro: " + fechaRegistro +
                ", \nFechaEstreno: " + fechaEstreno +
                ", \nInterpretes: ";
        for(String interprete:interpretes){
            result += "\n  - " + interprete;
        }
        result += " \nSolicitudes registradas: " + solicitudes.size();
        return result;
    }
}
