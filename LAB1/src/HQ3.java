public class HQ3 {

    public static boolean isMultiple(long n, long m) {
        if (m == 0) {
            return false;
        }

        return n % m == 0;
    }

    public static void main(String[] args) {
        long n = 15;
        long m = 3;

        if (isMultiple(n, m)) {
            System.out.println(n + " is a multiple of " + m);
        } else {
            System.out.println(n + " is not a multiple of " + m);
        }
    }
}

