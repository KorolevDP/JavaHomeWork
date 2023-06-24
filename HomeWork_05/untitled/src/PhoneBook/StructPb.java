
// Задание № 1.
//=============================================================================================================================

/* Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с
разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.(можно выводить без сортировки, но обязательно в отдельном методе)*/

//=============================================================================================================================


package PhoneBook;

import java.util.*;

public class StructPb {
    
    private static HashMap<String, ArrayList> contacts = new HashMap<>(); //задали глобальный HashMap для сохранения в него конктаков.
    //номера телефонов хранятся в  ArrayList

    /*
        Метод добавления контактов в тел. книгу.
        На вход поступает Имя и номер телефона, если Имя уже существует, то номер телефона добавляется к остальным.
        Если нет, то создается новый контакт в HashMap.
     */
        public  static void addContact(String name, String phoneNumber){
            if(contacts.containsKey(name)){
                ArrayList phoneNumbers = contacts.get(name);
                phoneNumbers.add(phoneNumber);
                contacts.put(name,phoneNumbers);
            }
            else{
                ArrayList phoneNumbers = new ArrayList<>();
                phoneNumbers.add(phoneNumber);
                contacts.put(name,phoneNumbers);}
        }

        // метод вывода всех контактов из HashMap на экран, без сортировки
        public static void printPB()
        {
            ArrayList<Map.Entry<String,ArrayList>> myList = new ArrayList<>(contacts.entrySet());

            for (Map.Entry<String,ArrayList> entry: myList)
                {
                    System.out.println(entry.getKey() +  " - " + entry.getValue());
                }
    }
}