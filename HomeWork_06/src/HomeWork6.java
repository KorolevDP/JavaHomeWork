import FootbalPlayersLibrary.FootbalPl;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;

public class HomeWork6 {
    public static void main(String[] args) throws Exception{

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);

        FootbalPl player1 = new FootbalPl("Киллиан Мбапе", "Франция",  formatter.parse("December 20, 1998"), "нападающий", "ПСЖ", 115);
        FootbalPl player2 = new FootbalPl("Алексадр Летелье", "Франция",  formatter.parse("December 11, 1990"), "вратарь", "ПСЖ", 120);
        FootbalPl player3 = new FootbalPl("Эрлинг Брёут Холанн", "Норвегия",  formatter.parse("July 21, 1990"), "нападающий", "Манчестер Сити", 125);
        FootbalPl player4 = new FootbalPl("Оливер Кан", "Германия",  formatter.parse("June 15, 1969"), "вратарь", "Бавария Мюнхен", 130);
        FootbalPl player5 = new FootbalPl("Вирджил ван Дейк", "Нидерланды",  formatter.parse("July 8, 1991"), "защитник", "Ливерпуль", 135);

        HashSet<FootbalPl> footbPlSet = new HashSet<FootbalPl>();
        footbPlSet.add(player1);
        footbPlSet.add(player2);
        footbPlSet.add(player3);
        footbPlSet.add(player4);
        footbPlSet.add(player5);

        System.out.printf("Игрок - " + player1.name  + " выставлен на трансфер ---> " + player1.transfer() + "\n");
        System.out.printf("Игрок - " + player4.name  + " закончил карьеру ---> " + player1.careerEnding() + "\n");
        System.out.printf("Игрок - " + player5.name  + " травмирован ---> " + player1.medSupport() + "\n");

        System.out.printf("\nИгроки: " + player1.name + " и " + player2.name  +  " равны ----> %b ", player1.equals(player2));
        System.out.println("\n====================================");
        System.out.printf("Футболист " + player3.name+  " есть в коллекции ----> %b", footbPlSet.contains(player3));
        System.out.println("\n====================================");

        System.out.println(footbPlSet.toString().replaceAll("^\\[|\\]|\\,$", ""));
    }
}