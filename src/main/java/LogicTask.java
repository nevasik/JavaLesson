public class LogicTask {
    public static void main(String[] args) {
        System.out.println(missingChar("hello", 2));
    }

    public static String missingChar(String str, int n) {
        return new StringBuilder(str).deleteCharAt(n).toString();
    }
}
/*
Мы удалили самым простым способом элемент в слове по индексу.
 */
