package com.boardgames.players;

public class MonopolyPlayer extends AbstractPlayer implements Rankable {
    private int netWorth;

    public MonopolyPlayer(String name, int netWorth) {
        super(name);
        this.netWorth = netWorth;
    }

    @Override
    public void displayProfile() {
        System.out.println("Monopoly Player: " + name + ", Net Worth: $" + netWorth + ", Games Played: " + gamesPlayed);
    }

    @Override
    public int getRank() {
        return netWorth;
    }

    @Override
    public void updateRank(int newWorth) {
        netWorth = newWorth;
    }
}
