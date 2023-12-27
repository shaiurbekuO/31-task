import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 0;
        for(int i=a; i<=b; i++){
            int cude = i*i*i;
            if(cude % 10 == 4 || cude % 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }
}