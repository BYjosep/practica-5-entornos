// Pentagon.java
package calculo_areas_240115;


public class Pentagon {
    public static void calculateArea(double side, double apothem) {
        
        double area = 0.5 * 5 * side * apothem;
        System.out.println("El área del pentágono es: " + area);
    }
}