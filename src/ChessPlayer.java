package com.boardgames.players;

public class ChessPlayer extends AbstractPlayer implements Rankable {
    private int chessRank;

    public ChessPlayer(String name, int chessRank) {
        super(name);
        this.chessRank = chessRank;
    }

    @Override
    public void displayProfile() {
        System.out.println("Chess Player: " + name + ", Rank: " + chessRank + ", Games Played: " + gamesPlayed);
    }

    @Override
    public int getRank() {
        return chessRank;
    }

    @Override
    public void updateRank(int newRank) {
        chessRank = newRank;
    }
}
