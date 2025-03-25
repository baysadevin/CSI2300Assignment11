package com.boardgames.games;

public class Chess extends AbstractGame implements Playable {
    public Chess() {
        super("Chess", 2, 2);
    }

    @Override
    public void displayRules() {
        System.out.println("Chess Rules: Players take turns moving their pieces...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting a Chess match!");
    }

    @Override
    public void endGame() {
        System.out.println("Chess match ended.");
    }
}
