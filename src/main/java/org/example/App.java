package org.example;

import org.example.chess.pieces.ChessAgent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Board board = new Board(8);
        board.inizializePieces();
        board.printBoard();

    }
    public ChessAgent findPiece(String label, ChessAgent[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j].getLabel().equals(label)){

                    return board[i][j];
                }
            }
        }
        return null;
    }
}
