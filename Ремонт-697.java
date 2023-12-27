import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
    int sum = 2*(n*l+n*w);
    if(sum%16==0){
        System.out.println(sum/16);
    }else{System.out.println(sum/16+1);}
  }
}