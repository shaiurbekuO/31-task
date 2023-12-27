import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        double number = scanner.nextDouble();
        while (number != 0) {
            sum += number;
            count++;

            number = scanner.nextDouble(); 
        }

        if (count != 0) {
            double average = sum / count;
            System.out.println(average);
        } else {
            
        }

    }
}