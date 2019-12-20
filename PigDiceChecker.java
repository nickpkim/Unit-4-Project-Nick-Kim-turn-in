public class PigDiceChecker {

    private int numOfDice;
    private boolean sameTurn;
    private boolean loseTurnPoints;
    private boolean loseAllPoints;
    private int turnPoints;

    public PigDiceChecker(){
        numOfDice = 2;
        sameTurn = true;
        loseTurnPoints = false;
        loseAllPoints = false;
        turnPoints = 0;
    }
    public void resetTurnPoints(){
        turnPoints = 0;
    }
    public void pigCheck(int die1, int die2){
        sameTurn = true;
        loseTurnPoints = false;
        loseAllPoints = false;
        if (die1 == 1 && die2 == 1){
            sameTurn = false;
            loseTurnPoints = true;
            loseAllPoints = true;
        } else if (die1 == 1 || die2 == 1){
            sameTurn = false;
            loseTurnPoints = true;
        } else {
            turnPoints += die1;
            turnPoints += die2;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4, int die5, int die6){
        sameTurn = true;
        loseTurnPoints = false;
        loseAllPoints = false;
        if (die1 == 1 || die2 == 1){}
    }
    public void getLoseTurnPoints(){
        if (loseTurnPoints){
            turnPoints = 0;
        }
    }
    public boolean getLoseAllPoints(){
        return loseAllPoints;
    }
    public int getTurnPoints(){
        return turnPoints;
    }
    public boolean getSameTurn(){
        return sameTurn;
    }
}