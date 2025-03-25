package com.boardgames.games;

public abstract class AbstractGame {
    protected String name;
    protected int minPlayers;
    protected int maxPlayers;

    public AbstractGame(String name, int minPlayers, int maxPlayers) {
        this.name = name;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public AbstractGame() {
        this.name = "Unknown Game";
        this.minPlayers = 2;
        this.maxPlayers = 4;
    }

    public abstract void displayRules();

    public String getName() {
        return name;
    }
}
