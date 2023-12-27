import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), p = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(i % x == p){
                count++;
            }
        }
        System.out.println(count);
    }
}