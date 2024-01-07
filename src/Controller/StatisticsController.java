package Controller;

import java.util.ArrayList;

import Model.Constants;
import Model.GameStatistics;
import Model.Rules.Rule;

public class StatisticsController {

    /**
     * Generates mean, variance and standard variance on a games outcome, with an applied rule
     * @param outcomes game outcome ArrayList<ArrayList<ArrayList<Long>>> allgames<throws<dicerolls>>
     * @param rule rule to apply on outcome
     * @return GameStatistics
     */
    public static GameStatistics calculateStatistics(ArrayList<ArrayList<ArrayList<Long>>> outcomes, Rule rule){
        long payout = Constants.PAYOUT;
        ArrayList<Boolean> rollsWon = new ArrayList<>();
        float mean = 0;
        float variance = 0;
        float stdVar = 0;

        for (ArrayList<ArrayList<Long>> game : outcomes) {
            for(ArrayList<Long> roll : game){
                rollsWon.add(rule.isRollAWin(roll));
            }
        }

        Boolean[] arrayData = rollsWon.toArray(new Boolean[rollsWon.size()]);

        for (int i = 0; i < arrayData.length; i++) {
            if(arrayData[i]) mean += payout;
        }

        mean /= arrayData.length;

        for (int i = 0; i < outcomes.size(); i++) {
            if(arrayData[i]) variance += Math.pow(payout - mean, 2);
        }
        variance /= arrayData.length;
        stdVar = (float)Math.sqrt(variance);

        return new GameStatistics(mean, variance, stdVar);
    }
}
