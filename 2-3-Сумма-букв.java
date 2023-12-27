import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);

        int sum = char1 + char2;

        System.out.println(sum);

        char resultChar = (char) sum;
        System.out.println(resultChar);
    }
}
