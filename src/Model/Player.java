package Model;

public class Player {
    private long dollars = 0;

    public long getBalacnce(){
        return dollars;
    }

    public void changeDollarsBy(long _dollars){
        dollars += _dollars;
    }
}
