import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        Map<String, Double> registroNotas = new HashMap<>();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i += 2) {
                if (i + 1 < args.length) {
                    String nombreEstudiante = args[i];
                    double notaEstudiante;

                    try {
                        notaEstudiante = Double.parseDouble(args[i + 1]);
                        registroNotas.put(nombreEstudiante, notaEstudiante);
                        System.out.println("Nota de " + nombreEstudiante + " asignada correctamente.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: La nota debe ser un número válido para " + nombreEstudiante);
                    }
                }
            }
        } else {
            System.out.println("Uso: java RegistroDeNotas <nombre_estudiante> <nota_estudiante> ...");
        }
    }
}
