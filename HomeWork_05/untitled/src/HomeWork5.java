import HeapSortRealisation.HeapSort;
import static HeapSortRealisation.HeapSort.printArray;
import static PhoneBook.StructPb.addContact;
import static PhoneBook.StructPb.printPB;


public class HomeWork5 {
    public static void main(String[] args) throws Exception {

        System.out.println("========================Task1========================");
        addContact("Ivanov Oleg","89094441122");
        addContact("Popov Igor","89278885610");
        addContact("Semenov Petr","89179785611");
        addContact("Maksimov Denis","89095550001");
        addContact("Usovich Ivan","89118886700");
        addContact("Ivanov Oleg","89067771156");
        addContact("Semenov Petr","89069997834");
        addContact("Ivanov Oleg","89095556060");

        printPB();

        System.out.println("========================Task2========================");
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array is");
        printArray(arr);

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}