/*
 * Author: Team Alpha Bravo and Charlie
 * CS 471
 * Assignment: Group Project
 * Description: Monopoly Game
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MonopolyGame {
    
    private static final int ROUNDS_TOTAL = 20;
    private static final int PLAYERS_TOTAL = 2;
    private List players = new ArrayList(PLAYERS_TOTAL);
    private Board board = new Board();
    private Die[] dice = { new Die(), new Die()};
    
    public MonopolyGame(){
        Player p;
        p = new Player("Horse", dice, board);
        players.add(p);
        p = new Player("Car", dice, board);
        
    }
    public void playGame(){
        for(int i=0; i<ROUNDS_TOTAL; i++){
            playRound();
            
        }
    }
    public List getPlayers(){
        return players;
    }
    private void playRound(){
        for(Iterator iter = players.iterator(); iter.hasNext();){
            Player player = (Player)iter.next();
            player.takeTurn();
        }
    }
    
}
