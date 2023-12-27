import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for(int i=1; i<=n; i++){
            System.out.print("Квадрат числа "+i + " ");
            value= i* i;
           
            System.out.println("равен "+value);
            
        }
    }
}