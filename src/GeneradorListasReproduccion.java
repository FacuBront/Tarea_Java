import java.util.Scanner;

public class GeneradorListasReproduccion {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario su estado de ánimo
        System.out.print("Ingresa tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.next().toLowerCase(); // Convertir a minúsculas para evitar errores de comparación

        // Generar la lista de reproducción basada en el estado de ánimo usando if-else
        if (estadoAnimo.equals("feliz")) {
            mostrarListaFeliz();
        } else if (estadoAnimo.equals("triste")) {
            mostrarListaTriste();
        } else if (estadoAnimo.equals("enérgico")) {
            mostrarListaEnergetico();
        } else if (estadoAnimo.equals("relajado")) {
            mostrarListaRelajado();
        } else {
            System.out.println("Estado de ánimo no válido.");
        }
    }

    // Lista de reproducción para estado feliz
    public static void mostrarListaFeliz() {
        System.out.println("Lista de reproducción para estado de ánimo feliz:");
        System.out.println("- De música ligera - Soda Stereo");
        System.out.println("- Loca - Tan Biónica");
        System.out.println("- Mi enfermedad - Los Rodríguez");
    }

    // Lista de reproducción para estado triste
    public static void mostrarListaTriste() {
        System.out.println("Lista de reproducción para estado de ánimo triste:");
        System.out.println("- Tratame suavemente - Soda Stereo");
        System.out.println("- 11 y 6 - Fito Páez");
        System.out.println("- Al lado del camino - Fito Páez");
    }

    // Lista de reproducción para estado enérgico
    public static void mostrarListaEnergetico() {
        System.out.println("Lista de reproducción para estado de ánimo enérgico:");
        System.out.println("- Héroes - David Bolzoni");
        System.out.println("- Aventura - Catupecu Machu");
        System.out.println("- Abarajame - Illya Kuryaki and the Valderramas");
    }

    // Lista de reproducción para estado relajado
    public static void mostrarListaRelajado() {
        System.out.println("Lista de reproducción para estado de ánimo relajado:");
        System.out.println("- Zona de promesas - Gustavo Cerati");
        System.out.println("- Crimen - Gustavo Cerati");
        System.out.println("- Ella usó mi cabeza como un revólver - Soda Stereo");
    }
}

