import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int troom = sc.nextInt();
        int tcond = sc.nextInt();
        String mode = sc.next();

        int newTemperature = 0;
        if (mode.equals("freeze")) {
            if (troom <= tcond) {
                newTemperature = troom;
            } else {
                newTemperature = tcond;
            }
        } else if (mode.equals("heat")) {
            if (troom >= tcond) {
                newTemperature = troom;
            } else {
                newTemperature = tcond;
            }
        } else if (mode.equals("auto")) {
            newTemperature = tcond;
        } else if (mode.equals("fan")) {
            newTemperature = troom;
        }

        System.out.println(newTemperature);
    }
}
