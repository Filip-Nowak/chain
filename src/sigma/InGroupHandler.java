package sigma;

import model.User;

public class InGroupHandler extends Handler{
    public InGroupHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(User user, String chatId) {
        if (isUserInGroupChat(user, chatId)) {
            return checkNext(user, chatId);
        }
        System.out.println("User is not in group chat");
        return false;
    }

    private boolean isUserInGroupChat(User user, String chatId) {
        return user.getGroupChats().contains(chatId);
    }
}
