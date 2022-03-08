public class LogicTask4 {
    public static void main(String[] args) {
        /* Учитывая строку, возьмите первые 2 символа и верните строку с 2 символами, добавленными как спереди,
        так и сзади, так что "kitten" дает "kikittenki". Если длина строки меньше 2, используйте любые имеющиеся
        символы.
       */
        System.out.println(front22("a"));
    }

    public static String front22(String str) {
        if (str.length() > 1){
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
        return str + str;
    }
}
