import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int hours1 = scanner.nextInt();
      int minutes1 = scanner.nextInt();
      int seconds1 = scanner.nextInt();
      int hours2 = scanner.nextInt();
      int minutes2 = scanner.nextInt();
      int seconds2 = scanner.nextInt();
      int number1 = hours1*3600+minutes1*60+seconds1;
      int number2 = hours2*3600+minutes2*60+seconds2;
      int num =number2-number1;
      System.out.println(num);
  }
}