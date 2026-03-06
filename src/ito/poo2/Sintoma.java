package ito.poo2;

public class Sintoma {
    private String descripcion;
    private float temperatura;
    private float peso;
    private float estatura;

    public Sintoma(String descripcion, float temperatura, float peso, float estatura) {
        this.descripcion = descripcion;
        this.temperatura = temperatura;
        this.peso = peso;
        this.estatura = estatura;
    }
    public String obtenerDescripcion() {
        return descripcion;
    }

    public float obtenerTemperatura() {
        return temperatura;
    }

    public float obtenerPeso() {
        return peso;
    }

    public float obtenerEstatura() {
        return estatura;
    }
}
