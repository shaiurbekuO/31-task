import java.util.Scanner;

public class Main {
    public static boolean happy(int n) {
        int n1, n2, n3, n4, n5, n6;

        n6 = n % 10;
        n5 = n / 10 % 10;
        n4 = n / 100 % 10;
        n3 = n / 1000 % 10;
        n2 = n / 10000 % 10;
        n1 = n / 100000;

        return (n1 + n2 + n3) == (n4 + n5 + n6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (happy(a - 1) || happy(a + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
