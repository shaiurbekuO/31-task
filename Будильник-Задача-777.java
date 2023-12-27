import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    if(b<a){
        System.out.println(b+12-a);
    }else{System.out.println(b-a);}
  }
}