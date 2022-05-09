import java.util.Scanner;

public class practical_8 {
    public static void main(String[] args) {
        int div = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        int number = sc.nextInt();
        System.out.print("The All Factors of " + number + " is :- ");
        while (number > 1) {
            if (number % div == 0) {
                System.out.print(div + ",");
                number = number / div;
            } else {
                div++;
            }
        }
    }

}