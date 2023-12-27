import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int s = Math.abs(x-x1);
        int t = Math.abs(y-y1);
        if((s==1 && t==2) || (s==2 && t==1)) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}