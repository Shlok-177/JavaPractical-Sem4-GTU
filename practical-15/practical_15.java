import java.util.Scanner;

class practical_15 {
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int decimal = 0;
        int strLength = binaryString.length();
        for (int i = 0; i < strLength; i++) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {
                throw new NumberFormatException("The sc String is not Binary");
            }

            decimal += (binaryString.charAt(i) - '0') * Math.pow(2, strLength - 1 - i);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Value : ");
        String str = sc.nextLine();
        try {
            System.out.println("Value = " + bin2Dec(str));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}