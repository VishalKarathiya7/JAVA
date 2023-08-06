package tictactoi.models;

import tictactoi.Exception.BotCountMoreThanOneException;
import tictactoi.Exception.DuplicateSymbolException;
import tictactoi.Exception.PlayerCountException;
import tictactoi.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<WinningStrategy>  winningStrategies;
    private Player winner;
    private int nextPlayerIndex;
    private GameState gameState;
    private int dimension;

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        System.out.println("=====" + dimension);
        this.dimension = dimension;
        this.players = players;
        this.winningStrategies = winningStrategies;
        System.out.println("--*-*-*-**-*"+dimension);
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;

    }

    public static Builder builder(){
        return new Builder();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimensions;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        private void validateBotCount() throws BotCountMoreThanOneException{
            int botSize = 0;
            for(Player player: players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botSize += 1;
                }
            }
            if(botSize > 1){
                throw new BotCountMoreThanOneException();
            }
        }
        private void validateDimensionAndPlayerCount() throws PlayerCountException {
            if(players.size() != this.dimensions - 1){
                throw new PlayerCountException();
            }
        }

        private void validateSymbolUniqueness() throws DuplicateSymbolException{
            Map<Character, Integer> symbolCount = new HashMap<>();
            for(Player player:players){
                if(!symbolCount.containsKey(player.getSymbol().getaChar())){
                    symbolCount.put(player.getSymbol().getaChar(), 0);
                }
                symbolCount.put(
                        player.getSymbol().getaChar(),
                        symbolCount.get(player.getSymbol().getaChar()) + 1
                );

                if(symbolCount.get(player.getSymbol().getaChar())>1){
                    throw new DuplicateSymbolException();
                }
            }
        }
        private void validate() throws BotCountMoreThanOneException, DuplicateSymbolException, PlayerCountException{
            validateBotCount();
            validateSymbolUniqueness();
            validateDimensionAndPlayerCount();
        }
        public Game build() throws BotCountMoreThanOneException, PlayerCountException, DuplicateSymbolException {
            validate();
            System.out.println("=-=-=-=-" + dimensions);
            return new Game(dimensions, players, winningStrategies);
        }
    }
    private boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        System.out.println("--------" + board.getSize() + "---------------" + board.getSize());
        if(row >= this.dimension || col >= this.dimension){
            return false;
        }

        if(!board.getBoard().get(col).get(row).getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }
    private boolean checkWinner(Board board, Move move){
        for( WinningStrategy winningStrategy:winningStrategies){
            if(winningStrategy.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }
    public void makeMove(){
        Player currentMovePlayer = players.get(nextPlayerIndex);

        System.out.println(("It is " + currentMovePlayer.getName() + "'s turn."));
        Move currentPlayerMove = currentMovePlayer.makeMove(board);
        if(!validateMove(currentPlayerMove)){
            System.out.println("Invalid Move. Please try Again");
            return;
        }
        int row = currentPlayerMove.getCell().getRow();
        int col = currentPlayerMove.getCell().getCol();

        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setPlayer(currentMovePlayer);

        Move finalMoveObject = new Move(cellToChange,currentMovePlayer);
        moves.add(finalMoveObject);

        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();

        if(checkWinner(board,finalMoveObject)){
            gameState = GameState.WIN;
            winner = currentMovePlayer;
        }else if(moves.size() == this.board.getSize() * this.board.getSize()){
            gameState = GameState.DRAW;
        }
    }
    public void printGame(){
        board.printBoard();
    }
}
