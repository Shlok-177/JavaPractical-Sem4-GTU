import java.util.Scanner;

class practical_10 {
    public static void reverse(int num[]) {
        int j = 0, temp;
        while (j <= num.length / 2) {
            temp = num[j];
            num[j] = num[num.length - 1 - j];
            num[num.length - 1 - j] = temp;
            j++;
        }
    }

    public static void main(String[] args) {
        int i = 0;
        int num_array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:- ");
        for (i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            num_array[i] = sc.nextInt();
        }
        reverse(num_array);
        System.out.println("After reversing Number in an Array :");
        for (i = 0; i < 10 ; i++) {
            System.out.println("Number " + (i + 1) + " : " + num_array[i]);
        }
    }
}