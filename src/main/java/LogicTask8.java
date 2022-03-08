public class LogicTask8 {
    /*
    Мы будем говорить, что число является "подростковым", если оно находится в диапазоне 13..19 включительно.
    Учитывая 3 значения int, верните true, если 1 или более из них являются подростковыми
     */
    public static void main(String[] args) {
        System.out.println(hasTeen(15, 100, 100));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }
}
