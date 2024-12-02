package calculo_areas_240115;



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;
        double base, height, side;
        do {
            System.out.println("Calculadora de Área por Josep Vicent Mestre");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Trapecio");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radius = scanner.nextDouble();
                    Circle.calculateArea(radius);
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    side = scanner.nextDouble();
                    Square.calculateArea(side);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    height = scanner.nextDouble();
                    Triangle.calculateArea(base, height);
                    break;
                case 4:
                    System.out.print("Ingrese la base del rectángulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    height = scanner.nextDouble();
                    Rectangle.calculateArea(base, height);
                    break;
                case 5:
                    System.out.print("Ingrese el lado del pentágono: ");
                    side = scanner.nextDouble();
                    System.out.print("Ingrese la apotema del pentágono: ");
                    double apothem = scanner.nextDouble();
                    Pentagon.calculateArea(side,apothem);
                    break;
                case 6:
                System.out.println("Ingrese la base grande;");
                double baseGrande= scanner.nextDouble();
                System.out.println("Ingrese la base pequeña;");
                double basePequena= scanner.nextDouble();
                System.out.println("Ingrese la altura;");
                double altura= scanner.nextDouble();

                Trapecio.calculateArea(baseGrande, basePequena, altura);
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
        scanner.close();    }
}
