package calculo_areas_240115;

public class Trapecio {
    public static void calculateArea(double baseGrande, double basePequena, double altura){
        double area = altura*((baseGrande+basePequena)/2);
        System.out.println("El area del trapecio es: " + area);
    }
}
