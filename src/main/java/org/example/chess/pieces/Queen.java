package org.example.chess.pieces;

import org.example.Position;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessAgent{


    public Queen(Position position, String color, boolean isAlive, int value, String label) {
        super(position, color, isAlive, value, label);
    }

    public List<Position> getAvailableMoves(){
        List<Position> availableMoves = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            availableMoves.add(new Position(getPosition().getX(), i));
            availableMoves.add(new Position(i, getPosition().getY()));
            availableMoves.add(new Position(getPosition().getX()+i, getPosition().getY()+i));
            availableMoves.add(new Position(getPosition().getX()-i, getPosition().getY()-i));
            availableMoves.add(new Position(getPosition().getX()+i, getPosition().getY()-i));
            availableMoves.add(new Position(getPosition().getX()-i, getPosition().getY()+i));
        }
        return availableMoves;
    }
    public List<Position> getValidMoves(){
        List<Position> validMoves = new ArrayList<>();
        for(Position position : getAvailableMoves()){
            if(position.getX() >= 0 && position.getX() < 8 && position.getY() >= 0 && position.getY() < 8){
                validMoves.add(position);
            }
        }
        return validMoves;
    }

    public Position move(Position position){
        if(getValidMoves().contains(position)){
            this.setPosition(position);
            return position;
        }
        return this.getPosition();
    }

}
