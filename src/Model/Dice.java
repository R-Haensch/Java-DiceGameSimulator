package Model;

public class Dice {
    long faces;

    public Dice(long _faces){
        faces = _faces;
    }

    public Dice(){
        faces = Constants.SIX_SIDED_DICE;
    }

    public long roll(){
        return (long) Math.ceil((Math.random()* (double) faces));
    }
}
