/*Учитывая строку, верните строку, состоящую из первых 2 символов (если она присутствует), однако включите первый
символ, только если он равен "o", и включите второй, только если он равен "z", поэтому "ozymandias" дает "oz".
 */
public class LogicTask12 {
    public static void main(String[] args) {
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str){
        if (str.startsWith("oz", 0)){
            return "oz";
        }
        else if (str.startsWith("o", 0)){
            return "o";
        }
        else if(str.startsWith("z", 1)){
            return "z";
        }
        return "";
    }
}
