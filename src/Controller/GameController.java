package Controller;

import Model.Game;
import Model.GameStatistics;
import Model.Player;
import Model.Rules.Rule;
import View.IDisplay;

/**
 * Describes the game structure
 */
public class GameController {

    public GameController(int instances, Rule rules, IDisplay display, Player player){
        Game game = null;
        Rule rule = null;

        rule = rules;

        System.out.println("");
        System.out.println(rule.startString);
        game = new Game(rule.rolls, rule.dice);

        for(int index = instances; index > 0 ; index--){
            game.play();
        }
        BalanceHandler.calculateBalance(player, game.getOutcome(), rule);
        display.displayBalance(player.getBalacnce());
        GameStatistics gameStatistics = StatisticsController.calculateStatistics(game.getOutcome(), rule);
        display.displayStats(gameStatistics);
    }
}
