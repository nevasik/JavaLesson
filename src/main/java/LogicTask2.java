public class LogicTask2 {
    public static void main(String[] args) {
        System.out.println(front3("лямбда"));
    }

    public static String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }
}
