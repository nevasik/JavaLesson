import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = scanner.nextInt();

        if (a  > (-32000) && a < 32000 && x > (-32000) && x < 32000){
            System.out.println(a + x);
        }
    }
}
