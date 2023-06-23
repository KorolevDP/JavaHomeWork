/*Задание №1
        Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида
        text~num
        2. Нужно рассплитить строку по ~, сохранить text в связный список на
        позицию num.
        3. Если введено print~num, выводит строку из позиции num в связном
        списке и удаляет её из списка.

        Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы последняя введенная
        была первой в списке, а первая - последней.
        3. Если введено revert, удаляет предыдущую введенную строку из памяти.*/

//==============================================================================


package Collection;

import java.util.*;


public  class LinkListSolution {

    private static LinkedList<String> list = new LinkedList<>();

    public static void run() {
        boolean getIteration = true;

        while (getIteration) {
            String cmd = InputUser("Enter the command");
            String[] cLine = cmd.toUpperCase().split("~");
            switch (cLine[0]) {

                case "EXIT":
                    getIteration = false;
                    break;

                // печать элемента на определенной позиции в списке
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;

                // Печать списка в обратном порядке с удалением элементов.
                case "LIST":
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                    break;

                // Задание № 1 из ДЗ № 4. Распечатать список в обратном порядке. Но, как бы по факту по порядку :-)
                case "REVERSE":
                        List reverseList = new ArrayList<>(list);
                        Collections.reverse(reverseList);

                        for(int i = 0; i < reverseList.size(); i++)
                        {
                            System.out.println(reverseList.get(i));
                        }
                    break;

                default:
                    if (cLine.length > 1) {
                        if (isInt(cLine[1])) {
                            adder(cLine, list);
                        } else {
                            list.addFirst(cLine[0]);
                        }
                    } else {
                        list.addFirst(cLine[0]);
                    }
                     break;
        }
    }
}

// метод чтения команды с клавиатуры
    private static  String InputUser(String message){
        System.out.print(message + " --> ");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }

    private static  boolean isInt(String text){
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    // метод добавления элемента в список
    private static List<String> adder(String[] splitted, List<String> list){
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()){
                for (int i = list.size() - num; i < num + 1; ++i){
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }

}