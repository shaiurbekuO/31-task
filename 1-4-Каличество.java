import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = 0;
        int i = a;
        while(a<=b){
            if((a%3==0)&&(a%5!=0)){
                sum++;
            }a++;
        }System.out.println(sum);
    }
}