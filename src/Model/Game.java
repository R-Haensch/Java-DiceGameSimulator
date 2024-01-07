package Model;

import java.util.ArrayList;

public class Game {
    private long rolls;
    private ArrayList<Dice> dice;
    private ArrayList<ArrayList<ArrayList<Long>>> outcomes = new ArrayList<ArrayList<ArrayList<Long>>>();
    
    public Game (long _rolls, ArrayList<Dice> _dice){
        rolls = _rolls;
        dice = _dice;
    }

    public void play(){
        ArrayList<ArrayList<Long>> thisPlay = new ArrayList<>();
        for (long roll = rolls; roll > 0; roll--){
            ArrayList<Long> thisThrow = new ArrayList<>();
            for (Dice singleDice : dice) {
                thisThrow.add(singleDice.roll());
            }
            thisPlay.add(thisThrow);
        }
        outcomes.add(thisPlay);
    }

    public ArrayList<ArrayList<ArrayList<Long>>> getOutcome(){
        return outcomes;
    }
}
