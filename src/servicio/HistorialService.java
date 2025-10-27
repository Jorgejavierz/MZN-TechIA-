package servicio;

import modelo.Calibracion;
import java.util.ArrayList;
import java.util.List;

public class HistorialService {
    private List<Calibracion> historial = new ArrayList<>();

    public void agregar(Calibracion calibracion) {
        if (calibracion != null) {
            historial.add(calibracion);
        }
    }

    public void mostrar() {
        if (historial.isEmpty()) {
            System.out.println("📭 No hay calibraciones registradas.");
            return;
        }

        System.out.println("\n📚 Historial técnico de calibraciones:");
        for (int i = 0; i < historial.size(); i++) {
            Calibracion c = historial.get(i);
            if (c != null) {
                System.out.println("\n🔹 Calibración #" + (i + 1));
                System.out.println(c.resumen());
            } else {
                System.out.println("\n🔹 Calibración #" + (i + 1) + " (nula, no registrada correctamente)");
            }
        }
    }
}