package model;


import java.util.List;

public class User {
    private String username;
    private String password;
    private boolean isPremium;
    private List<String> groupChats;


    public User(String username, String password, boolean isPremium, List<String> groupChats) {
        this.username = username;
        this.password = password;
        this.isPremium = isPremium;
        this.groupChats = groupChats;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public List<String> getGroupChats() {
        return groupChats;
    }

    public void setGroupChats(List<String> groupChats) {
        this.groupChats = groupChats;
    }
}