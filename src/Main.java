import model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ChatService chatService = new ChatService();

        System.out.println("\ntest1");
        User user = new User("user1", "password1", true,  Arrays.asList("chatId1", "chatId2"));
        chatService.showChatWithHandler(user, "chatId1");

        System.out.println("\ntest2");
        User user2 = new User("user2", "wrong password", false,  Arrays.asList("chatId1", "chatId2"));
        chatService.showChatWithHandler(user2, "chatId1");

        System.out.println("\ntest3");
        User user3 = new User("user3", "password3", true,  new ArrayList<>());
        chatService.showChatWithHandler(user3, "chatId1");

        System.out.println("\ntest4");
        User user4 = new User("user4", "password4", false,  Arrays.asList("chatId1", "chatId2"));
        chatService.showChatWithHandler(user4, "chatId1");
    }

}