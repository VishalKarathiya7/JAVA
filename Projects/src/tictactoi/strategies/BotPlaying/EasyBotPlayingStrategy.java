package tictactoi.strategies.BotPlaying;

import tictactoi.models.Board;
import tictactoi.models.Cell;
import tictactoi.models.CellState;
import tictactoi.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board){
        for(List<Cell> cells:board.getBoard()){
            for(Cell cell: cells){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell,null);
                }
            }
        }
        return null;
    }
}
