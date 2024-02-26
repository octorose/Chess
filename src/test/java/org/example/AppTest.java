package org.example;

import org.example.chess.pieces.Bishhop;
import org.example.chess.pieces.ChessAgent;
import org.example.chess.pieces.Pawn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest{
    private static Board Board;
    private static App app;
    @BeforeEach
    void setUp() {
        Board = new Board(8);
        Board.inizializePieces();
        app = new App();


    }
    @Test
    void testInitialBishopMove(){
    ChessAgent Bagent = app.findPiece("WhiteB1", Board.board);
    Bishhop bishop = (Bishhop) Bagent;
    List<Position> pos = bishop.getAvailableMoves(Board);
    assertEquals(0, pos.size());
    }
    @Test
    void testPawnMovePossibilities(){
        ChessAgent Pagent = app.findPiece("WhiteP2", Board.board);
        Pawn pawn = (Pawn) Pagent;
        List<Position> pos = pawn.getAvailableMoves(Board);
        assertEquals(1, pos.size());
    }
    @Test
    void testPawnMove(){
        ChessAgent Pagent = app.findPiece("WhiteP2", Board.board);
        Pawn pawn = (Pawn) Pagent;
        Pagent.getPosition().printPosition();
        pawn.Move(new Position(2, 2), Board);
        Board.printBoard();
//        assertEquals(pawn, Board.board[2][3]);
    }



}
