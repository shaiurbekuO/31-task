import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2= sc.nextInt();
        System.out.println(Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)) <= 1 ? "YES" : "NO");
    }
}