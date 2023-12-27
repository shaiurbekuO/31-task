import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0, k = -1;

        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            int s = sc.nextInt();

            if (s != 0 && v > m) {
                m = v;
                k = i;
            }
        }

        System.out.println(k);
    }
}
