/*
Учитывая строку, если строка "del" появляется, начиная с индекса 1, верните строку, в которой эта "del" была удалена.
В противном случае верните строку без изменений.
 */

public class LogicTask10 {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
    }

    public static String delDel(String str) {
        if(str.startsWith("del", 1)){
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
