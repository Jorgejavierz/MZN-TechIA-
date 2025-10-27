package servicio;

import modelo.Calibracion;

public class AlertaService {

    public void verificar(Calibracion calibracion) {
        if (calibracion == null) {
            System.out.println("⚠️ No hay calibración registrada para verificar.");
            return;
        }

        if (calibracion.estaDentroDeTolerancia()) {
            System.out.println("✅ La calibración está dentro de los límites permitidos.");
        } else {
            System.out.println("🚨 Alerta: calibración fuera de tolerancia.");
            System.out.println("📋 Detalle técnico:");
            System.out.println(calibracion.resumen());
        }
    }
}