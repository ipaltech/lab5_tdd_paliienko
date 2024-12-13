import messenger.Chat;
import messenger.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChatTest {

    @Test
    void testChatAddUsers(){
        Chat chat = new Chat();

        User user1 = new User("name1","1");
        User user2 = new User("name2", "2");
        User user3 = new User("name3", "3");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        String userId1 = user1.getId();
        String userId2 = user2.getId();
        String userId3 = user3.getId();

        assertEquals(user1, chat.getUser(userId1),"Not expected user1");
        assertEquals(user2, chat.getUser(userId2),"Not expected user2");
        assertEquals(user3, chat.getUser(userId3),"Not expected user3");


    }
}
