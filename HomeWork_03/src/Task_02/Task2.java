
//2. Пусть дан произвольный список целых чисел, удалить из него четные числа.

package Task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public  class Task2 {
    public static void DeleteEvenNums() {

        List<Integer> myList = CreateRandomIntList.RandomNumList();
        Collections.sort(myList);
        System.out.println("-----------------Original_list----------------");
        System.out.println(myList);
        List<Integer> delList = new ArrayList<>();

        for (Integer num: myList) {
            if (num % 2 == 0) delList.add(num);
        }

        Set<Integer> mySet = new HashSet<>(delList);
        List <Integer> newDelList = new ArrayList<>(mySet);

        myList.removeAll(newDelList);
        Collections.sort(myList);

        System.out.println("--------------------Odd_list-------------------");
        System.out.println(myList);
    }
}