import java.util.Scanner;

public class CalculadoraIndiceFelicidad {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Definir el número de factores de felicidad
        final int NUM_FACTORES = 4;
        double[] factores = new double[NUM_FACTORES];
        String[] nombresFactores = {"Satisfacción con la vida", "Nivel de estrés", "Nivel de salud", "Nivel de relaciones sociales"};

        // Pedir al usuario que ingrese cada factor
        for (int i = 0; i < NUM_FACTORES; i++) {
            System.out.printf("Ingresa tu %s (1-10): ", nombresFactores[i]);
            double valor = sc.nextDouble();

            // Validar que el valor esté en el rango correcto usando if-else
            if (valor < 1) {
                System.out.println("Por favor, ingresa un valor mayor o igual a 1.");
                i--; // Repetir la iteración para el mismo factor
            } else if (valor > 10) {
                System.out.println("Por favor, ingresa un valor menor o igual a 10.");
                i--; // Repetir la iteración para el mismo factor
            } else {
                factores[i] = valor; // Almacenar el valor en el arreglo
            }
        }

        // Calcular el índice de felicidad
        double suma = 0;
        for (double factor : factores) {
            suma += factor;
        }
        double indiceFelicidad = suma / NUM_FACTORES; // Promedio

        // Imprimir el índice de felicidad
        System.out.printf("Tu índice de felicidad es: %.2f\n", indiceFelicidad);
    }
}
