import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        String c = "No";
        while (n > 0){
            a = sc.nextInt();
            if(a % 10 == 4){
                c = "Yes";
            }
            n = n + -1;
            }
        System.out.print(c);  
        
    }
}