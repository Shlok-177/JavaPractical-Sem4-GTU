import java.util.Scanner;

class Practical_2 {
    public static void main(String[] args) {
        double a , b , e;
        double c ,d ,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("The First Equation is:- ");
        System.out.println("aX + bY = e");
        System.out.println("Enter the Value of a:- ");
        a = sc.nextDouble();
        System.out.println("Enter the Value of b:- ");
        b = sc.nextDouble();
        System.out.println("Enter the Value of e:- ");
        e = sc.nextDouble();
        System.out.println("The Second Equation is:- ");

        System.out.println("cX + dY = f");
        System.out.println("Enter the Value of c:- ");
        c = sc.nextDouble();
        System.out.println("Enter the Value of d:- ");
        d = sc.nextDouble();
        System.out.println("Enter the Value of f:- ");
        f = sc.nextDouble();

        double X = ((e*d)-(b*f))/((a*d)-(b*c));
        double Y = ((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("The Value of X is " + X + "The Value of Y is " + Y);




    }
}