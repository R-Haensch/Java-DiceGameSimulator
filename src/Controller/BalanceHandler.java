package Controller;

import java.util.ArrayList;

import Model.Constants;
import Model.Player;
import Model.Rules.Rule;

/***
 * Handles changes in Player balances
 */
public abstract class BalanceHandler {

    /**
     * This function calculates the gain from an outcome and apllies it to a player in respective of the game ruels
     * @param player Player to apply balance change on.
     * @param outcomes Game outcomes to evaluate
     * @param rule Rules to apply on outcomes
     */
    public static void calculateBalance(Player player, ArrayList<ArrayList<ArrayList<Long>>> outcomes, Rule rule){
        long payout = Constants.PAYOUT;    
        long cost = Constants.COST;  

        for (ArrayList<ArrayList<Long>> game : outcomes) {
            boolean gameWon = false;
            player.changeDollarsBy(cost);
            for(ArrayList<Long> roll : game){
                if(rule.isRollAWin(roll)){
                    gameWon = true;
                }
            }
            if(gameWon){
                player.changeDollarsBy(payout);
            }
        }
    }    
}
