import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if((y*y+x*x<5)&&(y>0.5*x-1)&&(y<x*x-3))
            System.out.println("Yes");
        else
            System.out.println("No"); 
    }
}