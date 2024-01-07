package Model.Rules;

import java.util.ArrayList;

import Model.Constants;
import Model.Dice;

public class RulePairInTwentyfour extends Rule {
    
    public RulePairInTwentyfour(){
        dice.add(new Dice());
        dice.add(new Dice());
        startString = "Start ´Pair in 24´ game";
        rolls = 6; 
    }

    @Override public boolean isRollAWin(ArrayList<Long> roll){
        // If both dice have the winning face return true
        return roll.getFirst() == Constants.WINNING_FACE && roll.getLast() == Constants.WINNING_FACE;
    }
}
