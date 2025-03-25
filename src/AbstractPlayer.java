package com.boardgames.players;

public abstract class AbstractPlayer {
    protected String name;
    protected int gamesPlayed;

    public AbstractPlayer(String name) {
        this.name = name;
        this.gamesPlayed = 0;
    }

    public AbstractPlayer() {
        this.name = "Anonymous";
        this.gamesPlayed = 0;
    }

    public abstract void displayProfile();

    public void incrementGamesPlayed() {
        gamesPlayed++;
    }
}
