import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine().toLowerCase();
        String letterNumber = sc.nextLine().toLowerCase();
        boolean currently = letter.equals(letterNumber);
        System.out.println(currently);
    }
}