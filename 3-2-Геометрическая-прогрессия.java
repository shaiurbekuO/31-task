import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        double ratio1 = b / (double) a;
        double ratio2 = c / (double) b;
        if (ratio1 == ratio2) {
            System.out.printf("%.2f", ratio1);
        }
        else System.out.print(0);
    }
}
