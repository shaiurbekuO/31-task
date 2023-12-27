import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(), y =sc.nextInt(), x1 = sc.nextInt(), y1 = sc.nextInt();
    double sum = Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
    System.out.println(sum);
  }
}