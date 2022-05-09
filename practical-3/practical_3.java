import java.util.Scanner;

public class practical_3
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double meter;

        System.out.println("Enter the Any Value in Meter:- ");
        meter = sc.nextDouble();

        double Feet = (meter * 3.28084) ;

        System.out.println("Meter  = " + meter + " Feet = "  +Feet);
    }
}
