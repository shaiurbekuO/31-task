import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean is = false;
        for(;;){
            int num = sc.nextInt();
            if(num==0){break;}
            if(num > 0){
                sum += num ;
                is = true;
            }
        }
        if(is){System.out.println(sum);}
        else{System.out.println("Не найдено");}
    }
}
