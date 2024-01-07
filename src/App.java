import Controller.GameController;
import Model.Player;
import Model.Rules.*;
import View.IDisplay;
import View.DisplayConsole;

public class App {
    public static void main(String[] args) throws Exception {

        // UI
        IDisplay ui = DisplayConsole.getInstance();

        System.out.println("Game calculation started");
        // instances could also be picked from parameters or Constants.
        new GameController(1000000, new RuleOneInSix(), ui, new Player());
        new GameController(1000000, new RulePairInTwentyfour(), ui, new Player());

        System.out.println("\n Press enter to quit...");
        System.in.read();
    }
}
