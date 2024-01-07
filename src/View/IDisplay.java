package View;

import Model.GameStatistics;

public interface IDisplay {
    public void displayStats(GameStatistics statistics);
    public void displayWin(long amount);
    public void displayLoss(long amount);
    public void displayBalance(long amount);
}
