# Dice game simulation

This program simulates dice games.

## Run the program

Install Java 1.7
Execute App.Java

## Modify the game

In the App.java add or remove the GameController instantiation
The function is build as follows: rounds played, the rules played by, the ui to send the outcome to, and the player who plays the game.
> new GameController(1000000, new RuleOneInSix(), ui, new Player());

## Rules

You can add new rules by adding a new class deriving from Rules.

>     // constructor with game frame
>
>      public RuleOneInSix(){
>
>        dice.add(new Dice());
>
>        startString = "Start ´One in 6´ game";
>
>        rolls = 6; 
>
>      }
>
> 
>
>     // override the calculation of the win condition.  
>
>      @Override public boolean isRollAWin(ArrayList<Long> roll){
>
>        for (Long face : roll) {
>
>            if(face == Constants.WINNING_FACE){
>
>                return true;
>
>            }
>
>        }
>
>        return false;
>
>    }

## Design choices

### MVC
I used the MVC pattern to easily seperate the logic and make the proram extandable in the furure
### Rules
I seperated the rules to drastically enhance the scalability of game modes
### Constants
The constants is a subliment for a config file.
### Display Singelton
the Display is available as a singelton to be accessable everywhere in the program.
