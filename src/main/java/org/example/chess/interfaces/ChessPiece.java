package org.example.chess.interfaces;

import org.example.Position;

import java.util.List;

public interface ChessPiece {

    public Position getPosition();
    public boolean isBlack();
    public boolean isWhite();
    public void move(int x, int y);
    public List<Position> possibleMoves();
    public List<Position> possibleAttacks();

}
