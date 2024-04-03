import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a and b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate the sum of integers from a to b
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        // Output the result
        System.out.println(sum);
    }
}
