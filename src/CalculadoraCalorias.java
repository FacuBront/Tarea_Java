import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos");
        double peso = sc.nextDouble();

        System.out.println("Ingrese la cantidad de minutos que entrena");
        short tiempo = sc.nextShort();

        System.out.println("Ingrese si correr, nadar o bicicleta ");
        String ejercicio = sc.next();

        double caloriasPorMinuto = 0;

        // Calcular las calorías quemadas según el tipo de ejercicio
        switch (ejercicio.toLowerCase()) {
            case "correr":
                caloriasPorMinuto = 10.0;
                break;
            case "nadar":
                caloriasPorMinuto = 8.0;
                break;
            case "bicicleta":
                caloriasPorMinuto = 7.0;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return; // Finalizar el programa si no se ingresa un ejercicio válido
        }

        // Calcular las calorías totales quemadas
        double caloriasQuemadas = caloriasPorMinuto * tiempo;

        // Mostrar el resultado al usuario
        System.out.println("Has quemado aproximadamente " + caloriasQuemadas + " calorías realizando " + ejercicio + ".");
    }
}
