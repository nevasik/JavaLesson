public class LogicTask13 {
    public static void main(String[] args) {
        /*

        Given three int values, a b c, return the largest.
         */
        System.out.println(intMax(1, 2, 10));
    }

    public static int intMax(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
            max = a;
        }
        else if (b >= a && b >= c) {
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }
}
