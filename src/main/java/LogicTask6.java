public class LogicTask6 {
    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        /*
         Учитывая две температуры, верните значение true, если одна из них меньше 0, а другая больше 100
         */
    }

    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100){
            return true;
        }
        return false;
    }

}
