
//2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

package Task_02;

import java.util.ArrayList;
import java.util.List;

public  class Task2 {
    public static List<Integer> DeleteEvenNums() {

        List<Integer> myList = CreateRandomIntList.RandomNumList();
        List<Integer> delList = new ArrayList<>();

        for (Integer num: myList) {
            if (num % 2 == 0) delList.add(num);
        }
// тут нужно в СЕТ загнать чтобы исключить повторы
        myList.removeAll(delList);

        return myList;
    }
}