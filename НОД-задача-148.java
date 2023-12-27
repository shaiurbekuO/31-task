import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }System.out.println(a);
    }
}
