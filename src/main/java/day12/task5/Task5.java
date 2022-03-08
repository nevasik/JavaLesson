package day12.task5;
/*Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только
имя, но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом, чтобы
участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в 4 задании
- слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль
необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.


 */


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Никодимова Полина", 15));
        members1.add(new MusicArtist("Даниелян Нарек", 15));
        members1.add(new MusicArtist("Кипкеев Алан",16));
        members1.add(new MusicArtist("Бедретдинов Герман", 15));
        members1.add(new MusicArtist("Соколов Женя",15));
        members1.add(new MusicArtist("Воробёв Павел", 18));
        members1.add(new MusicArtist("Столеру Вадим", 14));
        members1.add(new MusicArtist("Минаева Варвара", 16));

        MusicBand band1 = new MusicBand("14ИС", 2021, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Кривоногов Влад", 16));
        members2.add(new MusicArtist("Кошелев Серёжа", 15));
        members2.add(new MusicArtist("Румянцева Дарья", 15));
        members2.add(new MusicArtist("Панина Ксюша", 16));
        members2.add(new MusicArtist("Царьков Саша", 16));
        members2.add(new MusicArtist("Яценко Лиза", 16));
        members2.add(new MusicArtist("Старостина Ника", 15));
        members2.add(new MusicArtist("Дерюжникова Оля", 15));

        MusicBand band2 = new MusicBand("9A", 2019, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
