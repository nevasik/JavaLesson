package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String username; // имя пользователя
    private List<User>subscriptions; // список"подписки", в котором храняться те пользователи,на которых подписан пользователь

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        this.subscriptions.add(user); // мы подписали пользователя на пользователя user
    }

    public boolean isSubscribed(User user){
        if(this.subscriptions.contains(user)){ // .contains- этот метод принимает на вход элемент и проверяет, есть ли этот элемент в списке
            return true;
        }
        return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
