package messenger;

import java.util.HashMap;

public class Chat {
    private HashMap<String,User> users;


    public Chat(){
        this.users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(String id) {
        return users.get(id);
    }
}
