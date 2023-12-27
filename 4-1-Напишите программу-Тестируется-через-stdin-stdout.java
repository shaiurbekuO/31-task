import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();  
        //int divisor =2;
        while(numbers<2){
            numbers = sc.nextInt();
            //divisor++;
        }
        int divisor = 2;
        while(numbers%divisor !=0){
            divisor++;}
        System.out.println(divisor);
    }
}