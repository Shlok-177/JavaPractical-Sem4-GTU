/* Write a method with following method header. public static int gcd(int num1, int num2) Write a program that prompts the user to enter two integers and compute the gcd of two integers.
 */
import java.util.Scanner;

class practical_9 {
    public static int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = sc.nextInt();
        System.out.print("GCD of " + number1 + " and " + number2 + " = " + gcd(number1, number2));
    }
}