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
