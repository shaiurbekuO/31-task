import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int sum = 0;

        do {
            s = sc.nextInt();
            sum += s;
        } while (s != 0);

        System.out.println(sum);
    }
}