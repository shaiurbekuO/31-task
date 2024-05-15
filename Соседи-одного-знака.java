import java.util.Scanner;
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                a = sc.nextInt();
            } else {
                b = a;
                a = sc.nextInt();
                if (a * b > 0) {
                    System.out.print("YES");
                    return;
                }
            }
            
        }
        System.out.print("NO");
    }
}