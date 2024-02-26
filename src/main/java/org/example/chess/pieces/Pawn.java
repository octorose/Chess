package org.example.chess.pieces;

import org.example.PieceColor;
import org.example.Position;
import org.example.chess.interfaces.ChessPiece;

import java.util.List;

public class Pawn implements ChessPiece {

    private Position position;
    private PieceColor color;

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public boolean isBlack() {
        return color == PieceColor.BLACK;
    }

    @Override
    public boolean isWhite() {
        return color == PieceColor.WHITE;
    }

    @Override
    public void move(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    @Override
    public List<Position> possibleMoves() {
        if (color == PieceColor.WHITE) {
            if (position.getY() == 1) {
                return List.of(new Position(position.getX(), position.getY() + 1), new Position(position.getX(), position.getY() + 2));
            } else {
                return List.of(new Position(position.getX(), position.getY() + 1));
            }
        } else {
            if (position.getY() == 6) {
                return List.of(new Position(position.getX(), position.getY() - 1), new Position(position.getX(), position.getY() - 2));
            } else {
                return List.of(new Position(position.getX(), position.getY() - 1));
            }
        }
    }

    @Override
    public List<Position> possibleAttacks() {
        if (color == PieceColor.WHITE) {
            return List.of(new Position(position.getX() + 1, position.getY() + 1), new Position(position.getX() - 1, position.getY() + 1));
        } else {
            return List.of(new Position(position.getX() + 1, position.getY() - 1), new Position(position.getX() - 1, position.getY() - 1));
        }
    }

}
