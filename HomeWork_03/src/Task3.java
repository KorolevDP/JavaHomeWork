
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import Task_02.CreateRandomIntList;

import java.util.Collections;
import java.util.List;

    public class Task3 {

        public static void Performance(){

            List<Integer> myGlobalList = CreateRandomIntList.RandomNumList();
            Collections.sort(myGlobalList);

            System.out.println("----------Original_list---------");
            System.out.println(myGlobalList);
            System.out.printf("\nMin value of list ---> %d",MinArrayList(myGlobalList));
            System.out.printf("\nMax value of list ---> %d",MaxArrayList(myGlobalList));
            System.out.printf("\nAvg value of list ---> %f",AvgArrayList(myGlobalList));
        }

        public static int MinArrayList(List<Integer> myList) {
            int min = Collections.min(myList);

            return min;
        }

        public static int MaxArrayList(List<Integer> myList){
            int max = Collections.max(myList);

            return max;
        }

        public static double AvgArrayList(List<Integer> myList){
            double sum = 0;
            double avg = 0;

            for (int i = 0; i < myList.size(); i++){

                sum += myList.get(i);

            }
                avg = sum/myList.size();

            return avg;
        }


}