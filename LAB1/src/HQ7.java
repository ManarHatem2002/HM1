public class HQ7 { public static int sumOfSquares(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += i * i;
    }

    return sum;
}

    public static void main(String[] args) {
        int n = 5;

        int result = sumOfSquares(n);

        System.out.println("Sum of squares of positive integers less than or equal to " + n + ": " + result);
    }
}
