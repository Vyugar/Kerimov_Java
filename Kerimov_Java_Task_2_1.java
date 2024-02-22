// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

import java.util.Scanner;

public class Kerimov_Java_Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел с клавиатуры
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел и вывод результата
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций и вывод результатов
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b; // Деление с учётом дробной части

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Деление: " + quotient);

        scanner.close(); // Закрываем сканнер
    }
}
