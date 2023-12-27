import java.util.Objects;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        //boolean num =Objects.equals(c, Objects.equals(a, b));
        if(a==b && b==c)
            System.out.println("3");
        else if((a==b || a==c)||b==c)
            System.out.println("2");
        else
            System.out.println("0");
        
    }
}