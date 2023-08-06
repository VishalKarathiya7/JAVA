package tictactoi.strategies.BotPlaying;

import tictactoi.models.Board;
import tictactoi.models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
