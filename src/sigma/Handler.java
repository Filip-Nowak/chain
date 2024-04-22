package sigma;

import model.User;

public abstract class Handler {
    protected Handler nextHandler;
    public abstract boolean handle(User user, String chatId);
    public Handler (Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    protected boolean checkNext(User user, String chatId) {
        return this.nextHandler==null || this.nextHandler.handle(user, chatId);
    }
}
