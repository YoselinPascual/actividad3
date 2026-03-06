package ito.poo3;
import java.util.ArrayList;
import java.time.LocalDate;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float cargaMaxima;
    private LocalDate fechaAdquirida;

    // inicializador de atributo
    private ArrayList<Viaje> viajesRealizados = new ArrayList<>();

    public Vehiculo(String marca, String modelo, float cargaMaxima, LocalDate fechaAdquirida){
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.fechaAdquirida = fechaAdquirida;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCargaMaxima(){
        return cargaMaxima;
    }

    public LocalDate getFechaAdquirida(){
        return fechaAdquirida;
    }

    public ArrayList<Viaje> getViajesRealizados(){
        return viajesRealizados;
    }

    public void asignarViaje(Viaje viaje){
        viajesRealizados.add(viaje);
    }

    public void darBajaViaje(Viaje viaje){
        viajesRealizados.remove(viaje);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", fechaAdquirida=" + fechaAdquirida +
                ", viajesRealizados=" + viajesRealizados +
                '}';
    }
}
