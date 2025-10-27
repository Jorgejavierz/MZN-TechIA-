package modelo;

public class Calibracion {
    private String fecha;
    private double valorMedido;
    private double valorEsperado;
    private Instrumento instrumento;

    public Calibracion(String fecha, double valorMedido, double valorEsperado, Instrumento instrumento) {
        this.fecha = fecha;
        this.valorMedido = valorMedido;
        this.valorEsperado = valorEsperado;
        this.instrumento = instrumento;
    }

    public boolean estaDentroDeTolerancia() {
        double diferencia = Math.abs(valorMedido - valorEsperado);
        return diferencia <= instrumento.getTolerancia();
    }

    public String resumen() {
        return "📏 Calibración del instrumento " + instrumento.getModelo() +
                " [" + instrumento.getNumeroSerie() + "] en " + instrumento.getUbicacion() +
                "\nFecha: " + fecha +
                "\nValor esperado: " + valorEsperado +
                "\nValor medido: " + valorMedido +
                "\nResultado: " + (estaDentroDeTolerancia() ? "✅ Dentro de tolerancia" : "⚠️ Fuera de tolerancia");
    }

    public String getFecha() {
        return fecha;
    }

    public double getValorMedido() {
        return valorMedido;
    }

    public double getValorEsperado() {
        return valorEsperado;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }
}