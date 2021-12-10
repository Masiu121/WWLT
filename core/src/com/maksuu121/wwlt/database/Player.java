package com.maksuu121.wwlt.database;

public class Player {
    String nickname;

    String login;
    private String password;

    public Player(String nickname, String login, String password) {
        this.nickname = nickname;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
