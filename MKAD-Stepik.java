import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      int mkad = 109;
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      int time = sc.nextInt();
      int left = (v*time)%mkad;
         if (left >= 0) System.out.println(left);
         if (left < 0) System.out.println(mkad + left);
    
  }
}