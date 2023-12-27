import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal X = scanner.nextBigDecimal();
        BigDecimal fractionalPart = X.remainder(BigDecimal.ONE);
        System.out.println(fractionalPart);
    }
}
