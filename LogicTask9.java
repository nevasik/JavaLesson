/*
Мы будем говорить, что число является "подростковым", если оно находится в диапазоне 13..19 включительно.
Учитывая 2 значения int,верните true, если одно или другое равно диапазону, но не оба.
 */
public class LogicTask9 {
    public static void main(String[] args) {
        System.out.println(loneTeen(15, 15));
    }
    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
}
