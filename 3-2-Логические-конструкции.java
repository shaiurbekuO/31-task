import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод строки с тремя словами
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Разделение строки на слова
        String[] words = input.split(" ");

        // Сортировка массива слов в алфавитном порядке
        Arrays.sort(words);

        // Вывод отсортированных слов
        for (String word : words) {
            System.out.println(word);
        }
    }
}