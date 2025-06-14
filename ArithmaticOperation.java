
import java.util.Scanner;

public class ArithmaticOperation {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();


        System.out.println("Enter the secondnumber : ");
        int number2 = sc.nextInt();

        int sum = number1+number2;
        int div = (number2 != 0) ? number1 / number2 : 0;;
        int mul = number1*number2;
        int sub = number1-number2;


        System.out.println("Sum of numbers : " +sum);
        System.out.println("mulplication of number : "+mul);
        System.out.println("subtraction of number : "+sub);
        if (number2 != 0) {
            System.out.println("Division of number : "+div);
            
        } else {
            System.out.println("Division operations are not valid (div by zero)");
        }

        sc.close();

    }
}
