import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (true) {
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if (correct.equals(vasya)) {
                System.out.println("CORRECT");
                break;

            } else {
                System.out.println("INCORRECT " + counter);
            }if (counter == 5) {
                System.out.println("Error");
                break;
            }
        }
    }
}