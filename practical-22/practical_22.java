import java.util.Scanner;
import java.util.*;

class practical_22 {

    public static int MinimumUSingRec(int Array[], int num)
    {
      // if size = 0 means whole array
      // has been traversed
      if(num == 1)
        return Array[0];

        return Math.min(Array[num-1], MinimumUSingRec(Array, num-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            product *= list[i];
        }
        System.out.println("The Product of elements is " + product);

        System.out.println("The minimum number of these Five number is " + MinimumUSingRec(list, 5));

    }
}