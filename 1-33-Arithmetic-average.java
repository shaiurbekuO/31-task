import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println(average);
    }
}