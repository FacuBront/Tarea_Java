import java.util.Scanner;

public class GeneradorPlanesEstudio {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario cuántas horas al día puede estudiar
        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        double horasDiarias = sc.nextDouble();

        // Validar las horas diarias
        if (horasDiarias <= 0) {
            System.out.println("Las horas de estudio deben ser mayores a 0.");
            return; // Salir del programa si las horas son inválidas
        }

        // Inicializar las horas para cada materia
        double horasMatematica, horasHistoria, horasCiencia;

        // Pedir al usuario cuántas horas quiere dedicar a cada materia
        System.out.print("¿Cuántas horas deseas dedicar a Matemáticas por día? ");
        horasMatematica = sc.nextDouble();

        System.out.print("¿Cuántas horas deseas dedicar a Historia por día? ");
        horasHistoria = sc.nextDouble();

        System.out.print("¿Cuántas horas deseas dedicar a Ciencias por día? ");
        horasCiencia = sc.nextDouble();

        // Validar que la suma de las horas no exceda las horas diarias
        if (horasMatematica + horasHistoria + horasCiencia > horasDiarias) {
            System.out.println("La suma de horas dedicadas a las materias no puede exceder las horas diarias disponibles.");
            return; // Salir del programa si la suma es inválida
        }

        // Calcular las horas semanales
        double totalMatematica = horasMatematica * 7;
        double totalHistoria = horasHistoria * 7;
        double totalCiencia = horasCiencia * 7;

        // Generar el plan de estudio
        System.out.println("\nPlan de estudio semanal:");
        System.out.printf("Matemáticas: %.2f horas\n", totalMatematica);
        System.out.printf("Historia: %.2f horas\n", totalHistoria);
        System.out.printf("Ciencia: %.2f horas\n", totalCiencia);

        // Mostrar el total de horas semanales
        double horasSemanales = totalMatematica + totalHistoria + totalCiencia;
        System.out.printf("\nTotal de horas semanales: %.2f horas\n", horasSemanales);
    }
}
