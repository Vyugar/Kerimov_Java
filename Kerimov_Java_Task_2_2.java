// Задание 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. 
// В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"


import java.util.Scanner;

public class Kerimov_Java_Task_2_2 {
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
