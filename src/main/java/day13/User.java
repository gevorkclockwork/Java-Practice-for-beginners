package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;

public class User {

    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsernameName() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        if (this.subscriptions.contains(user) && user.getSubscriptions().contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return getUsernameName();
    }
}

