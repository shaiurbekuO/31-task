import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int max = element;
        int min = element;

        while (element != 0) {
            
            if (element > max) {
                max = element;
            } else if (element < min) {
                min = element;
            }
            element = sc.nextInt();
        }
        System.out.println(min + " " + max);
    }
}