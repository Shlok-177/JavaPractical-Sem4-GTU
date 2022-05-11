// Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.


import java.util.Scanner;

class practical_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if (ch>=48 && ch<57) {
                System.out.println("Enter the Alphabate not Number :)");
        }
        else{
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch + " is vowel");
                break;
            default:
                System.out.print(ch + " is constant");
        }
    }
    }

}