/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters. */

import java.util.Scanner;

public class  practical_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your weight in Pound :");
        double pound = sc.nextDouble();
        System.out.print("Enter Your Height in Inch :");
        double inch = sc.nextDouble();
        double BMI = (pound * 0.45359237) / ((inch * 0.0254)*(inch * 0.0254));
        System.out.print("BMI = "+BMI);
    }
}
