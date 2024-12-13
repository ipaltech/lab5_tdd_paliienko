package messenger;
import java.util.HashMap;

public class ChatRoom implements Chat {
    private HashMap<String, User> users;

    public String chatName;

    public ChatRoom() {
        this.users = new HashMap<>();
        this.chatName = "Chat Room";
    }
    public ChatRoom(String name){
        this.users = new HashMap();
        this.chatName = name;
    }

    @Override
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getUser(String id) {
        return users.get(id);
    }
}
