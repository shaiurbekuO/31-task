import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), m1 = sc.nextInt(), m2 = sc.nextInt();
        int sum = Math.max(m, Math.max(m1, m2));

        if((94<=m && m<=727) && (94<=m1 && m1<=727) && (94<=m2 && m2<=727)){
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
