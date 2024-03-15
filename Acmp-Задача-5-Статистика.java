import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] grades = scanner.nextLine().split(" ");
        StringBuilder threes = new StringBuilder();
        StringBuilder fours = new StringBuilder();
        int countThrees = 0;
        int countFours = 0;

        for (String grade : grades) {
            int day = Integer.parseInt(grade);
            if (day % 2 == 0) {
                countFours++;
                if (fours.length() > 0) fours.append(" ");
                fours.append(day);
            } else {
                countThrees++;
                if (threes.length() > 0) threes.append(" ");
                threes.append(day);
            }
        }

        System.out.println(threes);
        System.out.println(fours);
        System.out.println(countFours >= countThrees ? "YES" : "NO");
    }
}