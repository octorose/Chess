package org.example.chess.pieces;

import org.example.Position;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessAgent{


    public Rook(Position position, String color, boolean isAlive, int value, String label) {
        super(position, color, isAlive, value, label);
    }

    public List<Position> getAvailableMoves(){
        List<Position> availableMoves = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            availableMoves.add(new Position(getPosition().getX(), i));
            availableMoves.add(new Position(i, getPosition().getY()));
        }
        return availableMoves;
    }
}
