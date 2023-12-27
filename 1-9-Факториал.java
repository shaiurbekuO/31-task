import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        for(int i=1; i<=x; i++){
            n = n*i;
            //n++;
        }
        System.out.println(n);
    }
}