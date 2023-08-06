package tictactoi.strategies.WinningStrategies;

import tictactoi.models.Board;
import tictactoi.models.Move;
import tictactoi.models.Symbol;
import tictactoi.strategies.WinningStrategy;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagCount = new HashMap<>();
    private Map<Symbol, Integer> rightDiagCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        // Check for left diag
        if(row == col) {
            if(!leftDiagCount.containsKey((symbol))) {
                leftDiagCount.put(symbol, 0);
            }

            leftDiagCount.put(symbol, leftDiagCount.get(symbol) + 1);
        }

        // check for right diag
        if(row + col == board.getSize() - 1) {
            if(!rightDiagCount.containsKey(symbol)) {
                rightDiagCount.put(symbol, 0);
            }

            rightDiagCount.put(symbol, rightDiagCount.get(symbol) + 1);
        }

        if(row == col && leftDiagCount.get(symbol) == board.getSize()) {
            return true;
        }

        if((row + col == board.getSize() - 1) && rightDiagCount.get(symbol) == board.getSize()) {
            return true;
        }

        return false;
    }
}
