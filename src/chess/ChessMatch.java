package src.chess;

import src.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz = new ChessPiece[board.getRow()][board.getColumn()];
        for (int i = 0; i < board.getRow() ; i++){
            for (int j = 0; j< board.getColumn(); j++){
                matriz[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return matriz;
    }
}
