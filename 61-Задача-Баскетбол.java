import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, a1, a2, a3, a4, b, b1, b2, b3, b4;

        Scanner scanner = new Scanner(System.in);
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();
        a3 = scanner.nextInt();
        b3 = scanner.nextInt();
        a4 = scanner.nextInt();
        b4 = scanner.nextInt();

        a = a1 + a2 + a3 + a4;
        b = b1 + b2 + b3 + b4;

        if (a > b) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println(2);
        } else {
            System.out.println("DRAW");
        }
    }
}
