import java.util.*;
class Main {
  public static void main(String[] args) {
    // put your code here
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int h = sc.nextInt();
      if(a<=h && h<b){
          System.out.println("Normal");
      }else if(h<a){
          System.out.println("Deficiency");
      }else{
          System.out.println("Excess");
      }
  }
}