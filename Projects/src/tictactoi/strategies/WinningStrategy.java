package tictactoi.strategies;

import tictactoi.models.Board;
import tictactoi.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
}
