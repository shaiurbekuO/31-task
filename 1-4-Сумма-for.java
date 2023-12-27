import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();
        int b = sc.nextInt();       
        int sum = 0;
        for (int i = n; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
