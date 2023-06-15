import Task_01.CreateRandomArray;
import Task_01.PrintArray;
import Task_01.Task1;
import Task_02.Task2;

public class HomeWork_03 {

    public static void main(String[] args) {

            int[] TestArray = CreateRandomArray.NewRandomArray();
            System.out.println("---------Original array---------");
            PrintArray.PrintArr(TestArray);
            System.out.println();
            System.out.println("-----------Sorted array---------");
            PrintArray.PrintArr(Task1.mergeSort(TestArray));

            Task2.DeleteEvenNums();

    }
}