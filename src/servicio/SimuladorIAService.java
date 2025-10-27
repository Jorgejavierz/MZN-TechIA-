package servicio;

import modelo.Calibracion;
import modelo.Instrumento;
import java.util.Random;

public class SimuladorIAService {
    private Random random = new Random();

    public Calibracion simular() {
        String fecha = "Sim-" + (2025 + random.nextInt(5));
        double esperado = 10.0 + random.nextDouble() * 5; // entre 10.0 y 15.0
        double medido = esperado + (random.nextDouble() * 2 - 1); // ±1 unidad

        Instrumento instrumento = new Instrumento("SN-AI" + random.nextInt(1000),
                "ModeloSim",
                "Laboratorio IA",
                0.5);

        Calibracion simulada = new Calibracion(fecha, medido, esperado, instrumento);
        System.out.println("🤖 Simulación IA generada:");
        System.out.println(simulada.resumen());
        return simulada;
    }
}
