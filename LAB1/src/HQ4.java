public class HQ4 {

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        int i = 4;

        if (isEven(i)) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
    }
}
