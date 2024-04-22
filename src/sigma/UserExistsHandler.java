package sigma;

import frajer.UserService;
import model.User;

public class UserExistsHandler extends Handler {

    public UserExistsHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(User user, String chatId) {
        if (doesUserExist(user)) {
            return checkNext(user, chatId);
        }
        System.out.println("User not found");
        return false;
    }
    private boolean doesUserExist(User user) {
        return UserService.users.containsKey(user.getUsername());
    }
}
