package Model;

public class GameStatistics {
    private float mean; 
    private float variance;
    private float standardDeviation;

    public GameStatistics(float _mean, float _variance, float _standardDeviation){
        mean = _mean;
        variance = _variance;
        standardDeviation = _standardDeviation;
    }

    public String toString(){
        return "Mean: " + mean + " | Variance: " + variance + " | Standard deviation: " + standardDeviation;
    }

    public void printToConsole(){
        System.out.println(toString());
    }
}
