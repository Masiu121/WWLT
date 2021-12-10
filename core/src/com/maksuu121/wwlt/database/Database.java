package com.maksuu121.wwlt.database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getPlayer(String nickname) {
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).nickname.equals(nickname))
                return getPlayer(i);
        }
        return null;
    }

    public Player getPlayer(int index) {
        if(index <= players.size())
            return players.get(index);
        return null;
    }
}
