import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading six integers
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();

        if (a1 < a2) {
            int temp = a1;
            a1 = a2;
            a2 = temp;
        }
        if (a2 < a3) {
            int temp = a2;
            a2 = a3;
            a3 = temp;
        }
        if (a1 < a2) {
            int temp = a1;
            a1 = a2;
            a2 = temp;
        }

        if (b1 < b2) {
            int temp = b1;
            b1 = b2;
            b2 = temp;
        }
        if (b2 < b3) {
            int temp = b2;
            b2 = b3;
            b3 = temp;
        }
        if (b1 < b2) {
            int temp = b1;
            b1 = b2;
            b2 = temp;
        }

        int result = a1 * b1 + a2 * b2 + a3 * b3;
        System.out.println(result);
    }
}