package org.example.chess.pieces;

import org.example.Position;

public class ChessAgent {
    private Position position;
    private String color;
    private boolean isAlive;

    private int value;
    private String label;


    public ChessAgent(Position position, String color, boolean isAlive, int value, String label) {
        this.position = position;
        this.color = color;
        this.isAlive = isAlive;
        this.value = value;
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public  boolean isEnemy(int x, int y, String color, ChessAgent[][] board){
        if(board[x][y].getColor() != color){
            return true;
        }
        return false;
    }

    public  Position move(Position position){
        setPosition(position);
        return position;
    }
}
