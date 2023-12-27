import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int x1 = sc.nextInt(), y1= sc.nextInt();
        System.out.println((x==x1)||(y==y1)?"YES" : "NO");
    }
}