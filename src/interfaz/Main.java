package interfaz;


import java.util.Scanner;
import servicio.RegistroService;
import servicio.HistorialService;
import modelo.Calibracion;
import servicio.AlertaService;
import servicio.SimuladorIAService;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroService servicio = new RegistroService();
        boolean activo = true;
        HistorialService historialService = new HistorialService();
        Calibracion ultimaCalibracion = null;
        AlertaService alertaService = new AlertaService();
        SimuladorIAService simuladorIA = new SimuladorIAService();

        while (activo) {
            System.out.println("\n=== MZN TechIA ===");
            System.out.println("1. Registrar calibración");
            System.out.println("2. Emitir certificado");
            System.out.println("3. Consultar historial");
            System.out.println("4. Generar alerta");
            System.out.println("5. Ejecutar predicción IA");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpieza de buffer

            switch (opcion) {
                case 1:
                    historialService.agregar(ultimaCalibracion);
                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Valor esperado: ");
                    double esperado = sc.nextDouble();
                    System.out.print("Valor medido: ");
                    double medido = sc.nextDouble();
                    sc.nextLine();

                    servicio.registrar(fecha, medido, esperado);
                    break;

                case 2:
                    System.out.println("→ Emisión de certificado");
                    // Llamar a método de emisión
                    break;
                    
                case 3:
                    historialService.mostrar();
                    System.out.println("→ Consulta de historial");
                    // Llamar a método de historial
                    break;
                case 4:
                    System.out.println("+ Generación de alerta");
                    alertaService.verificar(ultimaCalibracion);
                    break;
                case 5:
                    ultimaCalibracion = simuladorIA.simular();
                    historialService.agregar(ultimaCalibracion);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    activo = false;
                    break;
                default:
                    System.out.println("⚠️ Opción inválida. Intente nuevamente.");
            }
        }

        sc.close();
    }
}