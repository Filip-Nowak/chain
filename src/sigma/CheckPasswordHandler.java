package sigma;

import frajer.UserService;
import model.User;

public class CheckPasswordHandler extends Handler{
    public CheckPasswordHandler(Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    public boolean handle(User user, String chatId) {
        if (checkPassword(user)){
            return checkNext(user, chatId);
        }
        System.out.println("Wrong password");
        return false;
    }

    private boolean checkPassword(User user) {
        return UserService.users.get(user.getUsername()).equals(user.getPassword());
    }
}
