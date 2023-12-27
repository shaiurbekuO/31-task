import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        for(int i =1; i<=n; i++){
            if(i>=12 && i<=24 || i>=101 && i<= 472 || i >= 3097 && i <= 5025 ){
                 continue;               
            }System.out.println(i);
        }
    }    
}