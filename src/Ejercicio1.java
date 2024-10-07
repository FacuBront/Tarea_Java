import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la fecha de nacimiento al usuario
        System.out.print("Introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        // Separar el día, mes y año
        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);

        // Determinar el signo del zodiaco
        String signo = "";
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            horoscopo = "Este es un buen momento para nuevas ideas.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            horoscopo = "Confía en tu intuición, te llevará a buenas decisiones.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "Es hora de actuar y no esperar más.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            horoscopo = "La paciencia es clave en estos momentos.";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            horoscopo = "La comunicación será clave en tus relaciones.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            horoscopo = "Escucha a tu corazón y a tus seres queridos.";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            horoscopo = "Es tiempo de brillar y mostrar tu creatividad.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            horoscopo = "La organización será tu mejor amiga.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            horoscopo = "Busca el equilibrio en todas las áreas de tu vida.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            horoscopo = "Tu pasión te llevará lejos.";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            horoscopo = "Es un buen momento para la aventura y el aprendizaje.";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            horoscopo = "Tu trabajo duro pronto será recompensado.";
        } else {
            System.out.println("Fecha de nacimiento no válida.");
            scanner.close();
            return;
        }

        // Imprimir el resultado
        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("Horóscopo: " + horoscopo);

        // Cerrar el escáner
        scanner.close();
    }
}

