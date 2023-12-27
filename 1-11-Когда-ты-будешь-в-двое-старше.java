import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if((b-a)>=a){
            System.out.println(2020+(b-a)-a);
        }else{System.out.println("Никогда");}
            
    }
}