import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if((x*x+y*y<5) && (x*x-3)>y)
            System.out.println("Yes");
        else
            System.out.println("No");
            
    }
}