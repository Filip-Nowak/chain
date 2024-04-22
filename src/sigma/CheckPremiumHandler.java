package sigma;

import model.User;

public class CheckPremiumHandler extends Handler{
    public CheckPremiumHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean handle(User user, String chatId) {
        if (isUserPremium(user)){
            return checkNext(user, chatId);
        }
        System.out.println("User is not premium");
        return false;
    }
    private boolean isUserPremium(User user) {
        return user.isPremium();
    }
}
