package org.example.chess.pieces;

import org.example.PieceColor;
import org.example.Position;
import org.example.chess.interfaces.ChessPiece;

import java.util.List;

public class Bishhop implements ChessPiece {

    private Position position;
    private PieceColor color;

    public Bishhop() {
        super();
    }

    public List<Position> possibleMoves() {
        return null;
    }

    public List<Position> possibleAttacks() {
        return possibleMoves();
    }

    public void move(int x, int y) {

    }

    public Position getPosition() {
        return null;
    }

    public boolean isBlack() {
        return false;
    }

    public boolean isWhite() {
        return false;
    }


}
