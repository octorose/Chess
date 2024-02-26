package org.example.chess.pieces;

import org.example.Position;

import java.util.ArrayList;
import java.util.List;

public class Horse extends ChessAgent{

    public Horse(Position position, String color, boolean isAlive, int value, String label) {
        super(position, color, isAlive, value, label);
    }

    public List<Position> getAvailableMoves(){
        List<Position> availableMoves = new ArrayList<>();
        availableMoves.add(new Position(getPosition().getX()+2,getPosition().getY()+1));
        availableMoves.add(new Position(getPosition().getX()+2,getPosition().getY()-1));
        availableMoves.add(new Position(getPosition().getX()-2,getPosition().getY()+1));
        availableMoves.add(new Position(getPosition().getX()-2,getPosition().getY()-1));
        availableMoves.add(new Position(getPosition().getX()+1,getPosition().getY()+2));
        availableMoves.add(new Position(getPosition().getX()+1,getPosition().getY()-2));
        availableMoves.add(new Position(getPosition().getX()-1,getPosition().getY()+2));
        availableMoves.add(new Position(getPosition().getX()-1,getPosition().getY()-2));
        return availableMoves;
    }
    public boolean isMoveValid(Position position){
        List<Position> availableMoves = getAvailableMoves();
        for (Position availableMove : availableMoves) {
            if (availableMove.getX() == position.getX() && availableMove.getY() == position.getY()) {
                return true;
            }
        }
        return false;
    }


}
