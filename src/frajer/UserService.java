package frajer;

import model.User;

import java.util.Map;

public class UserService {
    public static final Map<String,String> users = Map.of(
            "user1","password1",
            "user2","password2",
            "user3","password3"
    );
    public boolean doesUserExist(User user) {
        return users.containsKey(user.getUsername());
    }
    public boolean isPasswordCorrect(User user) {
        return users.get(user.getUsername()).equals(user.getPassword());
    }
    public boolean checkUser(User user, String chatId){
        if(doesUserExist(user)) {
            if(isPasswordCorrect(user)){
                if(isUserInGroupChat(user,chatId)) {
                    if(isUserPremium(user)) {
                        return true;
                    }else{
                        System.out.println("user is not premium");
                    }
                }else{
                    System.out.println("user not in chat");
                }
            }else{
                System.out.println("Wrong password");
            }
        }else {
            System.out.println("user not found");
        }
        return false;
    }

    private boolean isUserInGroupChat(User user, String chatId) {
        return user.getGroupChats().contains(chatId);
    }
    private boolean isUserPremium(User user) {
        return user.isPremium();
    }
}
