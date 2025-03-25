package com.boardgames.games;

public class Monopoly extends AbstractGame implements Playable {
    public Monopoly() {
        super("Monopoly", 2, 6);
    }

    @Override
    public void displayRules() {
        System.out.println("Monopoly Rules: Players buy and trade properties...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting a Monopoly game!");
    }

    @Override
    public void endGame() {
        System.out.println("Monopoly game ended.");
    }
}
