import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
           //Боштуктарды басып чыгаруу
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Жылдыздарды басып чыгаруу
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Ар бир катмардан кийин кийинки сапка өтүү
            System.out.println();
        }
    }
}
