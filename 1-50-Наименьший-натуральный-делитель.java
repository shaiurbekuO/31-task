import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n);
        } else {
            int smallestDivisor = findSmallestDivisor(n);
            System.out.println(smallestDivisor);
        }
    }

    private static int findSmallestDivisor(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n; 
    }
}
