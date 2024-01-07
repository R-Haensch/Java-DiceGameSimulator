package View;

import Model.GameStatistics;

public class DisplayConsole extends DisplayUI{

    private static DisplayConsole instance;
    private DisplayConsole() {}

    public static IDisplay getInstance() {
        if (instance == null) {
            instance = new DisplayConsole();
        }
        return instance;
    }

    @Override
    public void displayStats(GameStatistics statistics){
        System.out.println(statistics.toString());
    }

    public void displayWin(long amount){
        System.out.println("Player won " + amount + "$.");
    }
    
    public void displayLoss(long amount){
        System.out.println("Player lost -" + amount + "$.");
    }

    public void displayBalance(long amount){
        System.out.println("Players balance is " + amount + "$.");
    }
}
