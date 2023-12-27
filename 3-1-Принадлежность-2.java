import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((x<=-4)||(x>-2 && x<= 7)||(x>=31)? "true" : "false");
    }
}