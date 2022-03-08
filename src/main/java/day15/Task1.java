package day15;
import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        File file = new File(separator + "C:" + separator + "Users" + separator + "Dima" + separator + "Desktop" + separator + "JavaMarathon2021" + separator + "src" + separator + separator + "main" + separator + "resources" + separator + "shoes.csv");
        try {
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] massiveString = line.split(";");
                if(Integer.parseInt(massiveString[2]) == 0){
                    pw.println(massiveString[0] + ", " + massiveString[1] + ", " + massiveString[2]);
                }
            }
            pw.close();
            scanner.close();
        }
        catch (IOException e) {
            System.out.println("файла не существует");
        }
    }
}
