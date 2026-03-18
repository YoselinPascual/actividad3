package ito.poo3;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double cargaMaxima;
    private LocalDate fechaAdquisicion;
    private List<Viaje> viajes;
    public Vehiculo(String marca, String modelo, double cargaMaxima, LocalDate fechaAdquisicion) {
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.fechaAdquisicion = fechaAdquisicion;
        this.viajes = new ArrayList<>();
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public List<Viaje> getViajes() {
        return viajes;
    }
    public void agregarViaje(Viaje v) {
        viajes.add(v);
    }
    public void eliminarViaje(Viaje v) {
        viajes.remove(v);
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", fechaAdquisicion=" + fechaAdquisicion +
                '}';
    }
}
