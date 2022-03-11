/*Учитывая 2 значения int, верните любое значение, ближайшее к значению 10, или верните 0 в случае равенства.
Обратите внимание, что Math.abs(n) возвращает абсолютное значение числа.

 */

public class LogicTask14 {
    public static void main(String[] args) {
        System.out.println(close10(7, 11));
    }
    public static int close10(int a, int b){
        int aMath = Math.abs(a - 10);
        int bMath = Math.abs(b - 10);

        if (aMath < bMath) {
            return a;
        }
        if (bMath < aMath) {
            return b;
        }
        return 0;
    }
}
