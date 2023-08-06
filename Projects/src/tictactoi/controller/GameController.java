package tictactoi.controller;

import tictactoi.Exception.BotCountMoreThanOneException;
import tictactoi.Exception.DuplicateSymbolException;
import tictactoi.Exception.PlayerCountException;
import tictactoi.models.Game;
import tictactoi.models.GameState;
import tictactoi.models.Player;
import tictactoi.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players,
                          List<WinningStrategy> winningStrategies) throws BotCountMoreThanOneException, PlayerCountException, DuplicateSymbolException {
        return Game.builder()
                .setDimensions(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public void printBoard(Game game){
        game.printGame();
    }
    public String getWinner(Game game) {
        return game.getWinner().getName();
    }
}
