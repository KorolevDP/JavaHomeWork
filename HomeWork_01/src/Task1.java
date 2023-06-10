
// 1. Вычислить сумму чисел от 1 до N.

import java.util.Scanner;

public  class Task1{
    public static int SumOfNumbers() {
            Scanner num = new Scanner(System.in);
            System.out.println("------------Task1-----------");
            System.out.print("Введите число:> ");
            int number = num.nextInt();
            int result = 0;

            for (int i = 1; i <= number; i++) {
            result += i;
            }
            System.out.printf("Сумма от 1 до" + " " +  number  +  " = %d", result);
            System.out.println("");
            return result;
            }
}