/*
 * Author: Team Alpha Bravo and Charlie
 * CS 471
 * Assignment: Group Project
 * Description: Monopoly Game
 */

public class Square {
    private String name;
    private Square nextSquare;
    private int index;

    //constructor
    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }
    
    //getters and setters
    public void setNextSquare(Square s) {
        nextSquare = s;
    }

    public Square getNextSquare() {
        return nextSquare;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
    
}
