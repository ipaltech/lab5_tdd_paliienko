import messenger.ChatRoom;
import messenger.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChatTest {

    @Test
    void testChatRoomAddUsers(){
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("name1","1");
        User user2 = new User("name2", "2");
        User user3 = new User("name3", "3");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        String userId1 = user1.getId();
        String userId2 = user2.getId();
        String userId3 = user3.getId();

        assertEquals(user1, chatRoom.getUser(userId1),"Not expected user1");
        assertEquals(user2, chatRoom.getUser(userId2),"Not expected user2");
        assertEquals(user3, chatRoom.getUser(userId3),"Not expected user3");


    }
}
