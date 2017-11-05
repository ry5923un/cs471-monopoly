/*
 * Author: Team Alpha Bravo and Charlie
 * CS 471
 * Assignment: Group Project
 * Description: Monopoly Game
 */

public class Piece {
    private Square location;
    
    //constructor
    public Piece(Square location) {
        this.location = location;
    }

    //getter and setter
    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
    
}
