import Task_01.CreateRandomArray;
import Task_01.PrintArray;
import Task_01.Task1;
import Task_02.Task2;

public class HomeWork_03 {

    public static void main(String[] args) {

            int[] TestArray = CreateRandomArray.NewRandomArray();
            System.out.println("\n\n=======================Task_1==========================\n");

            System.out.println("---------Original_array---------");
            PrintArray.PrintArr(TestArray);
            System.out.println();
            System.out.println("-----------Sorted_array---------");
            PrintArray.PrintArr(Task1.mergeSort(TestArray));

            System.out.println("\n\n=======================Task_2==========================\n");

            Task2.DeleteEvenNums();

            System.out.println("\n\n=======================Task_3==========================\n");

            Task3.Performance();

    }
}