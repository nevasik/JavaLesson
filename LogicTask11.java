/*Возвращает true, если данная строка начинается с "mix", за исключением того, что "m" может быть чем угодно,
поэтому "pix", "9 ix" .. все учитывается
 */
public class LogicTask11 {
    public static void main(String[] args) {
        System.out.println(mixStart("piz snacks"));
    }

    public static boolean mixStart(String str){
        if(str.startsWith("ix", 1)){
            return true;
        }
        return false;
    }
}
