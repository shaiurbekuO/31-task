import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder binary = new StringBuilder();
        while (a > 0){
            int renainder = a%2;
            binary.insert(0, renainder);
            a/=2;
        }
        System.out.println(binary.toString());
    }
}