package com.boardgames.main;

import com.boardgames.games.*;
import com.boardgames.players.*;
import com.boardgames.utils.GameUtils;

public class GameManager {
    public static void main(String[] args) {
        Chess chess = new Chess();
        Monopoly monopoly = new Monopoly();

        ChessPlayer player1 = new ChessPlayer("Alice", 1200);
        MonopolyPlayer player2 = new MonopolyPlayer("Bob", 5000);

        // Display rules and start games
        chess.displayRules();
        chess.startGame();
        player1.displayProfile();
        chess.endGame();

        GameUtils.printSeparator();

        monopoly.displayRules();
        monopoly.startGame();
        player2.displayProfile();
        monopoly.endGame();
    }
}
