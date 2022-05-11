/*Write a generic method that returns the minimum elements in a two dimensional array.
*/

import java.util.*;

public class practical_23 {
    public static void main(String[] args) {
        Integer list[][] = new Integer[3][3];
        Scanner sc = new Scanner(System.in);
        int value = 1;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println("Enter " + value + " Number:-");
                list[i][j] = sc.nextInt();
                value++;

            }
        }
        System.out.println("Minimum no is = " + min(list));
    }

    public static <E extends Comparable<E>> E min(E list[][]) {
        E min = list[0][0];
        for (E[] elements : list) {
            for (E element : elements) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
        }
        return min;
    }
}
