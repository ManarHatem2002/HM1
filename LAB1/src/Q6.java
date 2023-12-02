import java.util.Scanner;

public class Q6 {

            public static void main(String[] args) {
                int[] number = new int[]{1, 3, 4, 2};
                printAll(number);
                inputAll(number);
                printAll(number);
            }

            public static void printAll(int[] array) {
                for(int i = 0; i < array.length; ++i) {
                    System.out.println(array[i]);
                }
            }

            public static void inputAll(int[] array) {
                Scanner input = new Scanner(System.in);
                System.out.println("enter the num ");

                for(int i = 0; i < array.length; ++i) {
                    array[i] = input.nextInt();
                }
            }}

