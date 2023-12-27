import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=10; i++){
            System.out.print(i%2==1 ? i+" " : "");
        }
        
    }
}