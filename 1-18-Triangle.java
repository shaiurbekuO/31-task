import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
      //int sum = a+b;
      if(c<(a+b) && a<(b+c) && b<(c+a))
         System.out.println("YES");
      else
         System.out.println("NO");
      
      
  }
}