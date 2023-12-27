import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.println((x>=0)&&(y<=1)&&((x*x+y*y<=1)||(y>=x-1))? "true" : "false");
    }
}