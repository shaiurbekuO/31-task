import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = n%10;
      int n2 = (n/10)%10;
      int n3 = n/100;
      System.out.println(n1+n2+n3);
  }
}