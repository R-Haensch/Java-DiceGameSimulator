package Model.Rules;

import java.util.ArrayList;

import Model.Dice;

/**
 * A rule defines the frame for how outcomes are calculated and how the game is processed.
 */
public abstract class Rule {
    public ArrayList<Dice> dice = new ArrayList<>();
    public String startString;
    public long rolls;

    /**
     * The calculation on if the throws are a winning one
     * @param roll and ArrayList of the thrown dice
     * @return true when won
     */
    public boolean isRollAWin(ArrayList<Long> roll){
        return false;
    }
}
