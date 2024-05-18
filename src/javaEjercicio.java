import java.util.Scanner;

public class javaEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opcion:");
        System.out.println("1. Quieres saber si eres mayor de edad");
        System.out.println("2. El número mayor entre dos números");
        System.out.println("3. Verificar si tu número es par o tu numero es impar");
        System.out.println("4. El factorial de un número");
        System.out.println("5. Números impares hasta un límite con bucle for");
        System.out.println("6. Números impares hasta un límite con bucle while");
        System.out.println("7. Seleccionar dias de la semana");
        System.out.println("8. Salir");

        System.out.print("Selecciona una opción (1-6): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Edad(scanner);
                break;

            case 2:
                numeroMayor(scanner);
                break;

            case 3:
                par_Impar(scanner);
                break;

            case 4:
                factorial(scanner);
                break;

            case 5:
                impares2(scanner);
                break;

            case 6:
                Impares(scanner);
                break;

            case 7:
                DiasSemana(scanner);
                break;

            case 8:
                System.out.println("¡Hasta luego!");
                break;

            default:
                System.out.println("No válido. Inténtalo nuevamente.");
        }
    }

    private static void Edad(Scanner scanner) {
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    private static void numeroMayor(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    private static void par_Impar(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    private static void factorial(Scanner scanner) {
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    private static void Impares(Scanner scanner) {
        System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
        int limite = scanner.nextInt();
        int num = 1;
        while (num <= limite) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
    private static void impares2(Scanner scanner){
        System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
        int limite = scanner.nextInt();
        for (int j = 1; j <= limite; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }
    public static void DiasSemana(Scanner scanner){
        System.out.print("Ingresa un número del 1 al 5 para mostrar el dia correspondiente: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");

            default:
                System.out.println("No es un dia valido, elija un numero entre el 1 y el 5.");
        }
    }
}