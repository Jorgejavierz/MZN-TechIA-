package modelo;

public class Instrumento {
    private String numeroSerie;
    private String modelo;
    private String ubicacion;
    private double tolerancia;

    public Instrumento(String numeroSerie, String modelo, String ubicacion, double tolerancia) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.ubicacion = ubicacion;
        this.tolerancia = tolerancia;
    }

    public double getTolerancia() {
        return tolerancia;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}