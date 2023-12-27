import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        for(int i=2; i<=n; i++){
            int m = sc.nextInt();
            if(m<min){
            min = m;
            }
            if(m>max){
                max = m;
            }
        }
        System.out.println(min+" "+max);
    }
}
