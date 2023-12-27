import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n<=45){
            System.out.println("плохо");}
        else if(n<=68){
            System.out.println("удовлетворительно");}
        else if(n<=80){
            System.out.println("хорошо");}
        else if(n<=100){
            System.out.println("отлично");
        }
        
    }
}