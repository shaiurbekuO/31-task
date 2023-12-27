import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long letter = 1;
        long a;
        for(long i=1; i<=n; i++){
            a = sc.nextLong();
            letter = letter*a;
        }
        
        System.out.println(letter);
    }
}