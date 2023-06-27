/*
Домашнее задание № 6
====================

Структура класса - футболисты мира. Выделены поля и методы.
Создано множество футболистов.
Переопределены toString, equals и hashCode(как на семинаре).
Выведены на печать экземпляры класса, сравнил пару экземпляров и нашел один экземпляр в наборе.
Так же реализованы методы определяющие необходимость мед помощи футболисту, признак выставления на трансфер и окончания карьеры.

 */


package FootbalPlayersLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class FootbalPl {
    public String name; // имя
    public String nationality; // национальность
    public Date birthDate; // дата рождения
    public String playingPosition; // игровая позиция
    public String club; // футбольный клуб
    public long id;


    public FootbalPl(String name, String nationality, Date birthDate, String playingPosition, String club, long id) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.playingPosition = playingPosition;
        this.club = club;
        this.id = id;
    }

    // Метод проверки необходимости мед. помощи
    public boolean medSupport() {
        return true;
    }

    // метод проверки выставления игрока на трансфер
    public boolean transfer() {
        return true;
    }

    // метод проверки завершения игровой карьеры футболиста
    public boolean careerEnding() {
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        return "ID: " + id + "\n" + "Имя: " + name + "\n" + "Национальность: " + nationality + "\n" + "Дата рождения: " + formatter.format(birthDate) + "\n" + "Игровая позиция: " + playingPosition + "\n" + "Клуб: " + club + "\n====================================\n";
    }

    // Метод сравнения футболистов. Если их национальность и клуб одинаковые, то мы считаем их равными.
    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return  false;
        FootbalPl fpl = (FootbalPl) o;
        return nationality == fpl.nationality && club == fpl.club;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationality, birthDate, playingPosition, club, id );
    }
}
