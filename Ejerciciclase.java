package edu.Ejercicioclase;

import java.util.Scanner;

public class Ejerciciclase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            displayMenu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    calculateCircleArea();
                    break;
                case 2:
                    calculateCircleCircumference();
                    break;
                case 3:
                    calculateCubeVolume();
                    break;
                case 4:
                    calculateSquarePyramidArea();
                    break;
                case 5:
                    calculateSquarePyramidVolume();
                    break;
                case 6:
                    calculateTriangleArea();
                    break;
                case 7:
                    calculateRectangularPrismVolume();
                    break;
                case 8:
                    calculateParallelogramArea();
                    break;
                case 9:
                    calculateCylinderVolume();
                    break;
                case 10:
                    calculateSphereArea();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (option != 0);

        input.close();
    }

    private static void displayMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Área de un círculo");
        System.out.println("2. Circunferencia de un círculo");
        System.out.println("3. Volumen de un cubo");
        System.out.println("4. Área de una pirámide cuadrada");
        System.out.println("5. Volumen de una pirámide cuadrada");
        System.out.println("6. Área de un triángulo");
        System.out.println("7. Volumen de un prisma rectangular");
        System.out.println("8. Área de un paralelogramo");
        System.out.println("9. Volumen de un cilindro");
        System.out.println("10. Área de una esfera");
        System.out.println("0. Salir");
    }

    private static void calculateCircleArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area);
    }

    private static void calculateCircleCircumference() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radius = input.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("La circunferencia del círculo es: " + circumference);
    }

    private static void calculateCubeVolume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cubo: ");
        double sideLength = input.nextDouble();
        double volume = Math.pow(sideLength, 3);
        System.out.println("El volumen del cubo es: " + volume);
    }

    private static void calculateSquarePyramidArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double baseLength = input.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double height = input.nextDouble();
        double area = (baseLength * height) / 2;
        System.out.println("El área de la pirámide cuadrada es: " + area);
    }

    private static void calculateSquarePyramidVolume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double baseLength = input.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double height = input.nextDouble();
        double volume = (baseLength * height) / 3;
        System.out.println("El volumen de la pirámide cuadrada es: " + volume);
    }

    private static void calculateTriangleArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base del triángulo: ");
        double baseLength = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = input.nextDouble();
        double area = (baseLength * height) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    private static void calculateRectangularPrismVolume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el área de la base del prisma: ");
        double baseArea = input.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double height = input.nextDouble();
        double volume = baseArea * height;
        System.out.println("El volumen del prisma rectangular es: " + volume);
    }

    private static void calculateParallelogramArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base del paralelogramo: ");
        double baseLength = input.nextDouble();
        System.out.print("Ingrese la altura del paralelogramo: ");
        double height = input.nextDouble();
        double area = baseLength * height;
        System.out.println("El área del paralelogramo es: " + area);
    }

    private static void calculateCylinderVolume() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        double radius = input.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double height = input.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("El volumen del cilindro es: " + volume);
    }

    private static void calculateSphereArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        double radius = input.nextDouble();
        double area = 4 * Math.PI * radius * radius;
        System.out.println("El área de la esfera es: " + area);
    }
}


