// 3. Реализовать простой калькулятор.

import java.util.Scanner;

public class Task3 {
    public static double EasyCalculator() {
        int num1;
        int num2;
        double result = 0;
        char op;


        Scanner reader = new Scanner(System.in);
        System.out.println("\n------------Task3-----------");
        System.out.print("\nВведите 1-e число:> ");
        num1 = reader.nextInt();
        System.out.print("\nВведите 2-e число:> ");
        num2 = reader.nextInt();
        System.out.print("\nВведите операцию (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch (op) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка!! На 0 делить нельзя!");
                    break;
                }
                else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.println("Вообще не то выбрано!!");

        }

        System.out.printf(num1 + " " + op + " " + num2 + " = " + result);
        return result;
    }
}