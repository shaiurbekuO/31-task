import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n >= 100 && n <= 999)&&(n % 3 == 0) && (n % 7 == 1) ? "true" : "false");
    }
}
