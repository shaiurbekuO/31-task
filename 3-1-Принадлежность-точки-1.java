import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        double x = sc.nextDouble();
        System.out.println(y >= x * x - 2 && (y <= x || y <= -x)? "true" : "false");
    }
}