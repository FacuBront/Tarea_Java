import java.util.Scanner;

public class GeneradorRutinaIfElse {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario su nivel de condición física
        System.out.print("Ingresa tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = sc.next().toLowerCase(); // Convertir a minúsculas para evitar problemas de comparación

        // Verificar el nivel de condición física usando if-else
        if (nivel.equals("principiante")) {
            mostrarRutinaPrincipiante();
        } else if (nivel.equals("intermedio")) {
            mostrarRutinaIntermedio();
        } else if (nivel.equals("avanzado")) {
            mostrarRutinaAvanzado();
        } else {
            System.out.println("Nivel de condición física no válido.");
        }
    }

    // Rutina para principiantes
    public static void mostrarRutinaPrincipiante() {
        System.out.println("Rutina semanal para principiantes:");
        System.out.println("Lunes: Caminar - 30 minutos");
        System.out.println("Martes: Estiramientos - 20 minutos");
        System.out.println("Miércoles: Ciclismo suave - 30 minutos");
        System.out.println("Jueves: Descanso");
        System.out.println("Viernes: Yoga - 25 minutos");
        System.out.println("Sábado: Caminata - 30 minutos");
        System.out.println("Domingo: Descanso");
    }

    // Rutina para intermedios
    public static void mostrarRutinaIntermedio() {
        System.out.println("Rutina semanal para intermedios:");
        System.out.println("Lunes: Correr - 40 minutos");
        System.out.println("Martes: Entrenamiento de fuerza - 30 minutos");
        System.out.println("Miércoles: Natación - 45 minutos");
        System.out.println("Jueves: Ciclismo - 40 minutos");
        System.out.println("Viernes: Entrenamiento de fuerza - 30 minutos");
        System.out.println("Sábado: Correr - 50 minutos");
        System.out.println("Domingo: Descanso");
    }

    // Rutina para avanzados
    public static void mostrarRutinaAvanzado() {
        System.out.println("Rutina semanal para avanzados:");
        System.out.println("Lunes: Correr - 60 minutos");
        System.out.println("Martes: Entrenamiento de fuerza - 45 minutos");
        System.out.println("Miércoles: Natación - 60 minutos");
        System.out.println("Jueves: Ciclismo - 60 minutos");
        System.out.println("Viernes: Entrenamiento de fuerza - 50 minutos");
        System.out.println("Sábado: Correr - 75 minutos");
        System.out.println("Domingo: Entrenamiento cruzado (bicicleta, correr, natación) - 60 minutos");
    }
}
