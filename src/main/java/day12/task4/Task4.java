package day12.task4;
import java.util.ArrayList;
import java.util.List;
/*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
удалять участников. Под участником понимается строка (String) с именем и фамилией.Реализовать статический метод
слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода:
transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.В классе MusicBand,
реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий
список участников.Проверить состав групп после слияния.

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Никодимова Полина");
        members1.add("Даниелян Нарек");
        members1.add("Кипкеев Алан");
        members1.add("Бедретдинов Герман");
        members1.add("Соколов Евгений");
        members1.add("Воробёв Павел");
        members1.add("Столеру Вадим");
        members1.add("Минаева Варвара");

        MusicBand band1 = new MusicBand("14ИС", 2021, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Кривоногов Влад");
        members2.add("Кошелев Сергей");
        members2.add("Румянцева Дарья");
        members2.add("Панина Ксюша");
        members2.add("Царьков Александр");
        members2.add("Яценко Елизавета");
        members2.add("Старостина Ника");
        members2.add("Дерюжникова Оля");

        MusicBand band2 = new MusicBand("9A", 2019, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
*/

