// Задание 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. 
// Необходимо написать программу, которая выведет в консоль все чётные числа. 


public class Kerimov_Java_Task_2_3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
