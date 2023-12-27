import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        while(A<=0 || B<=0){
            A = sc.nextInt();
            B = sc.nextInt();
        }
        int divisor = 0;
        while(A>=B){
            A -= B;
            divisor++;
            
            }
           System.out.println(divisor +" "+ A);
        
    }
}