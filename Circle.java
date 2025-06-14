import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radious : ");
        double  radious = input.nextDouble();

        double area  = Math.PI * radious *radious;
        double perimeter = 2 * Math.PI *radious;

        System.out.println("Area of the circle : "+area);
        System.out.println("Perimeter of the circle : "+perimeter);

        input.close();

    }
}
