import frajer.UserService;
import model.User;
import sigma.*;

public class ChatService {
    private final UserService userService=new UserService();
    public void showChat(User user, String chatId) {
        if(userService.checkUser(user,chatId)) {
            doRestOfTheWork(user,chatId);
        }
    }

    private void doRestOfTheWork(User user, String chatId) {
        System.out.println("Showing chat "+chatId+" to user "+user.getUsername());
    }
    public void showChatWithHandler(User user, String chatId) {
        Handler handler = new UserExistsHandler(new CheckPasswordHandler(new InGroupHandler(new CheckPremiumHandler(null))));
        if(handler.handle(user,chatId)) {
            doRestOfTheWork(user,chatId);
        }
    }


}
