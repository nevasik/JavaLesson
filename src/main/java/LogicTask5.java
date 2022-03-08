public class LogicTask5 {
    public static void main(String[] args) {
        System.out.println(startHi("h"));
    }

    public static boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        return false;
    }
}
