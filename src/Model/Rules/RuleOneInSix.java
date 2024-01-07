package Model.Rules;

import java.util.ArrayList;

import Model.Constants;
import Model.Dice;

public class RuleOneInSix extends Rule {

    public RuleOneInSix(){
        dice.add(new Dice());
        startString = "Start ´One in 6´ game";
        rolls = 6; 
    }
    
    @Override public boolean isRollAWin(ArrayList<Long> roll){
        for (Long face : roll) {
            if(face == Constants.WINNING_FACE){
                return true;
            }
        }
        return false;
        
    }
}
