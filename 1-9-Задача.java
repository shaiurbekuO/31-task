import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double n = sc.nextDouble();
        double sum = 1;
        for(int i=1; i<=n; i++){
            sum=Math.pow(a,i)+sum;
        }
        int prev = (int)sum;
        System.out.print(prev);
    }
}