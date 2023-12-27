import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = s.trim();
        if (n >= 1 && n <= s.length()) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(n-1);
            System.out.println(sb.toString());
        } else {
            System.out.println("Invalid index.");
        }
    }
}
