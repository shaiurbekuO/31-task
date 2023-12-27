import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            int num = sc.nextInt();
            if(num%2==0){
            sum++;}
         }System.out.println(sum);
    }
}