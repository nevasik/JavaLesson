public class LogicTask3 {
    public static void main(String[] args) {
        //Возвращает значение true, если заданное неотрицательное число кратно 3 или кратно 5.
        //Используйте оператор % "mod" -
        System.out.println(or35(8));
    }

    public static boolean or35(int n) {
        if(n % 3 == 0 | n % 5 == 0){
           return true;
        }
          return false;
    }
}
