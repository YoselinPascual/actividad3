package ito.poo;

import java.time.LocalDate;

public class Solicitud {
    private String nombreInterprete;
    private LocalDate fechaSolicitud;
    private LocalDate fechaAutorizacion;
    private String compania;

    public Solicitud(String nombreInterprete, LocalDate fechaSolicitud,
                     LocalDate fechaAutorizacion, String compania){
        this.nombreInterprete = nombreInterprete;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaAutorizacion = fechaAutorizacion;
        this.compania = compania;
    }
    public void setFechaAutorizacion(LocalDate fechaSolicitud) {
        if(!fechaAutorizacion.isBefore(this.fechaSolicitud)){
            this.fechaAutorizacion = fechaAutorizacion;
        }
    }
    public void setCompania (String compania){
        this.compania = compania;
    }
    public String getNombreInterprete(){
        return nombreInterprete;
    }

    public LocalDate getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "\nnombreInterprete: " + nombreInterprete +
                ",\nfechaSolicitud: " + fechaSolicitud +
                ", \nfechaAutorizacion: " + fechaAutorizacion +
                ", \ncompania: " + compania +
                '}';
    }
}

