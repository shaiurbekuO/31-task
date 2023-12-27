import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Преобразуем число N в строку и затем получаем длину строки
        int numberOfDigits = String.valueOf(N).length();

        System.out.println(numberOfDigits);
    }
}
