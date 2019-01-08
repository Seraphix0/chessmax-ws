package com.mellykusjes.chessmaxws.models;

public class Notification {

    private NotificationType type;
    private int gameId;

    public Notification(NotificationType type, int gameId) {
        this.type = type;
        this.gameId = gameId;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
}
