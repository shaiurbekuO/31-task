import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = n;
        long q = 0;
        q += n / 6;
        n %= 6;
        q += n / 5 * 2;
        n %= 5;
        q += n / 4 * 3;
        n %= 4;
        q += n / 3 * 4;
        n %= 3;
        q += n / 2 * 5;
        n %= 2;
        if (n == 1) {
            q += 6;
        }
        System.out.println(q + " " + k * 6);
    }
}