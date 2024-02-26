package org.example.chess.pieces;

import org.example.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessAgent {

    public King(Position position, String color, boolean isAlive, int value, String label) {
        super(position, color, isAlive, value, label);
    }

    public List<Position> getAvailableMoves(){
        List<Position> availableMoves = new ArrayList<>();
        availableMoves.add(new Position(getPosition().getX()+1, getPosition().getY()));
        availableMoves.add(new Position(getPosition().getX()-1, getPosition().getY()));
        availableMoves.add(new Position(getPosition().getX(), getPosition().getY()+1));
        availableMoves.add(new Position(getPosition().getX(), getPosition().getY()-1));
        availableMoves.add(new Position(getPosition().getX()+1, getPosition().getY()+1));
        availableMoves.add(new Position(getPosition().getX()-1, getPosition().getY()-1));
        availableMoves.add(new Position(getPosition().getX()+1, getPosition().getY()-1));
        availableMoves.add(new Position(getPosition().getX()-1, getPosition().getY()+1));
        return availableMoves;
    }
}
