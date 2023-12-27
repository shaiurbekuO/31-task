import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            String season = getSeasonByMonth(month);
            System.out.println(season);
        } else {
            System.out.println("Error");
        }
    }

    public static String getSeasonByMonth(int month) {
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Error";
                break;
        }

        return season;
    }
}
