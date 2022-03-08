package day13;

public class Task1 {
    public static void main(String[] args){

        User user10 = new User("пользователь 1");
        User user11 = new User("пользователь 2");
        User user12 = new User("пользователь 3");

        user10.sendMessage(user11, "Hello!");
        user10.sendMessage(user11, "How are you?");

        user11.sendMessage(user10, "Hi!");
        user11.sendMessage(user10, "OK!");
        user11.sendMessage(user10, "Yours I hope too!");

        user12.sendMessage(user10, "Hiм!");
        user12.sendMessage(user10, "A am student!");
        user12.sendMessage(user10, "A am programming!");

        user10.sendMessage(user12, "Hello!");
        user10.sendMessage(user12, "That's cool!");
        user10.sendMessage(user12, "Me too");

        user12.sendMessage(user10, "It's a miracle!");

        MessageDatabase.showDialog(user10, user12);
    }
}
