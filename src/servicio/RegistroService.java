package servicio;

import modelo.Calibracion;
import modelo.Instrumento;

public class RegistroService {
    public Calibracion registrar(String fecha, double medido, double esperado) {
        Instrumento instrumento = new Instrumento("SN123", "ModeloX", "Planta A", 0.5);
        Calibracion calibracion = new Calibracion(fecha, medido, esperado, instrumento);

        System.out.println(calibracion.resumen());
        return calibracion;
    }
}