import java.util.Scanner;

public class CostoViaje {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario la distancia del viaje en kilómetros
        System.out.print("Ingresa la distancia del viaje en kilómetros: ");
        double distancia = sc.nextDouble();

        // Validar la distancia
        if (distancia <= 0) {
            System.out.println("La distancia debe ser mayor a 0.");
            return; // Salir del programa si la distancia es inválida
        }

        // Pedir al usuario el consumo de combustible del vehículo en litros por kilómetro
        System.out.print("Ingresa el consumo de combustible en litros por kilómetro: ");
        double consumo = sc.nextDouble();

        // Validar el consumo
        if (consumo <= 0) {
            System.out.println("El consumo debe ser mayor a 0.");
            return; // Salir del programa si el consumo es inválido
        }

        // Pedir al usuario el precio del combustible por litro
        System.out.print("Ingresa el precio del combustible por litro: ");
        double precioCombustible = sc.nextDouble();

        // Validar el precio del combustible
        if (precioCombustible <= 0) {
            System.out.println("El precio del combustible debe ser mayor a 0.");
            return; // Salir del programa si el precio es inválido
        }

        // Calcular el costo total del viaje
        double litrosNecesarios = distancia * consumo; // Litros necesarios para el viaje
        double costoTotal = litrosNecesarios * precioCombustible; // Costo total del viaje

        // Imprimir el costo total del viaje
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);
    }
}
