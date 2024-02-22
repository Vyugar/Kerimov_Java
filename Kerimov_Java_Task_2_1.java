import java.util.Scanner;

public class Kerimov_Java_Task_2.1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
