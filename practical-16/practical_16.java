import java.util.Scanner;

public class practical_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number;

        System.out.println("Enter the Decimal Number:- ");

        number = sc.nextDouble();

        int decimal_number = (int)number;

        System.out.println("The Decimal number is " + decimal_number);
        if (number-decimal_number < 0) {
            System.out.println("The Fraction Number is : " + -(number-decimal_number) );
        }
        else
        System.out.println("The Fraction Number is : " + (number-decimal_number) );


    }
}
