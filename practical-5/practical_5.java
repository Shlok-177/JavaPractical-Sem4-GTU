/* Write a program that prompts the user to enter three integers and display the integers in decreasing order.
 */

import java.util.Scanner;

class practical_5 {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Integer :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Integer :");
        int b = sc.nextInt();
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.print("Enter 3rd Integer :");
        int c = sc.nextInt();
        if (c > b) {
            if (c > a) {
                temp = c;
                c = b;
                b = a;
                a = temp;
            } else {
                temp = c;
                c = b;
                b = temp;
            }
        }
        System.out.print("Decreasing Order :" + a + " " + b + " " + c);
    }
}