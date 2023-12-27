import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = sc.nextInt();
        int min = max;
        while(x-1!=0){
            int y = sc.nextInt();
            max = Math.max(max, y);
            min = Math.min(min, y);
            x--;
            
        }
        System.out.println(min);
        System.out.println(max);
        
    }
}