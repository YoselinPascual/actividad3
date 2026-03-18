package ito.poo;
import java.util.ArrayList;
import java.time.LocalDate;

public class Composicion {
    private String titulo;
    private int duracionMinuto;
    private int duracionSegundo;
    private String genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaEstreno;
    private ArrayList<Solicitud> solicitudes;

    public Composicion(String titulo, int duracionMinuto, int duracionSegundo,
                       String genero, LocalDate fechaRegistro) {
        this.titulo = titulo;
        this.duracionMinuto = duracionMinuto;
        this.duracionSegundo = duracionSegundo;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = null;
        this.solicitudes = new ArrayList<>();
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinuto() {
        return duracionMinuto;
    }

    public int getDuracionSegundo() {
        return duracionSegundo;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
    public void agregaSolicitud(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }
    @Override
    public String toString() {
        String result = "Composicion{" +
                "\nTitulo: " + titulo +
                "\nDuracion: " + duracionMinuto + ":" +
                String.format("%02d", duracionSegundo) +
                "\nGenero: " + genero +
                "\nFechaRegistro: " + fechaRegistro +
                "\nFechaEstreno: " + (fechaEstreno != null ? fechaEstreno : "No hay fecha de  estreno") +
                "\nInterpretes:";
        for (Solicitud s : solicitudes) {
            result += "\n  - " + s.getNombreInterprete();
        }
        result += "\nSolicitudes registradas: " + solicitudes.size() +
                "\n}";
        return result;
    }
}
