import java.util.*;

public class FarkleDiceChecker {

    private int diceRolled;
    private int diceToRoll;
    private boolean sameTurn;
    private boolean loseTurnPoints;
    private int turnPoints;

    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;

    private boolean triple;
    private boolean threePairs;
    private boolean straight;

    public FarkleDiceChecker(){
        diceRolled = 6;
        diceToRoll = 6;
        sameTurn = true;
        loseTurnPoints = false;
        turnPoints = 0;
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
        triple = false;
        threePairs = false;
        straight = false;
    }
    public void resetTurnPoints(){
        turnPoints = 0;
    }

    // The first main function in this class is farkleCheck, which determines if the current player is able to accumulate
    // points and roll again. farkleCheck is overloaded to six methods with slight differentiations. This is because the
    // parameters are dependent on how many dice the player is rolling. The creation of frequency variables, lists, and
    // if statements all have to do with the scoring system. If there is a possibility for the player to accumulate points,
    // sameTurn is true. If there isn't, sameTurn is false.

    public void farkleCheck(int die1, int die2, int die3, int die4, int die5, int die6){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        dice.add(die6);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,4) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,5) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,6) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,2) == 3) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4, int die5){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,4) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,5) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3, int die4){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else if (Collections.frequency(freq,4) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2, int die3){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else if (Collections.frequency(freq,3) > 0) {
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1, int die2){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }
    public void farkleCheck(int die1){
        sameTurn = false;
        loseTurnPoints = false;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones > 0 || fives > 0){
            sameTurn = true;
        } else {
            loseTurnPoints = true;
        }
    }

    // The second main function in this class is pointCount, which determines how many points are accumulated from the
    // selected dice. pointCount is overloaded to six methods with slight differentiations. This is because the parameters
    // are dependent on how many dice the player selected for points. The creation of frequency variables and lists and
    // if statements all have to do with the way dice are scored. Then, the turn points are added.

    public void pointCount(int die1, int die2, int die3, int die4, int die5, int die6){
        diceToRoll = 6;

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        dice.add(die6);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        ArrayList<Integer> straightList = new ArrayList<Integer>();
        straightList.add(1);
        straightList.add(2);
        straightList.add(3);
        straightList.add(4);
        straightList.add(5);
        straightList.add(6);

        if (Collections.frequency(freq,3) == 2) {
            turnPoints += 2500;
        } else if (dice.equals(straightList)){
            turnPoints += 1500;
        } else if (Collections.frequency(freq,2) == 3){
            turnPoints += 1500;
        } else if (Collections.frequency(freq,4) == 1 && Collections.frequency(freq,2) == 1){
            turnPoints += 1500;
        } else if (Collections.frequency(freq,6) == 1){
            turnPoints += 3000;
        } else if (Collections.frequency(freq,5) == 1){
            turnPoints += 2000;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (Collections.frequency(freq,4) == 1){
            turnPoints += 1000;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (sixes == 3){
            turnPoints += 600;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (fives == 3){
            turnPoints += 500;
            if (ones == 1){
                turnPoints += 100;
            }
        } else if (fours == 3){
            turnPoints += 400;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (threes == 3){
            turnPoints += 300;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (twos == 3){
            turnPoints += 200;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (ones == 3){
            turnPoints += 300;
            if (fives == 1){
                turnPoints += 50;
            }
        } else {
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        }
    }
    public void pointCount(int die1, int die2, int die3, int die4, int die5){
        diceToRoll = diceRolled - 5;
        if (diceToRoll == 0){
            diceToRoll = 6;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        dice.add(die5);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (Collections.frequency(freq,5) == 1){
            turnPoints += 2000;
        } else if (Collections.frequency(freq,4) == 1){
            turnPoints += 1000;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (sixes == 3){
            turnPoints += 600;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (fives == 3){
            turnPoints += 500;
            if (ones == 1){
                turnPoints += 100;
            }
        } else if (fours == 3){
            turnPoints += 400;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (threes == 3){
            turnPoints += 300;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (twos == 3){
            turnPoints += 200;
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1 || fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (ones == 3){
            turnPoints += 300;
            if (fives == 1){
                turnPoints += 50;
            }
        } else {
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        }
    }
    public void pointCount(int die1, int die2, int die3, int die4){
        diceToRoll = diceRolled - 4;
        if (diceToRoll == 0){
            diceToRoll = 6;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        dice.add(die4);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        ArrayList<Integer> freq = new ArrayList<Integer>();
        freq.add(ones);
        freq.add(twos);
        freq.add(threes);
        freq.add(fours);
        freq.add(fives);
        freq.add(sixes);

        if (Collections.frequency(freq,4) == 1){
            turnPoints += 1000;
        } else if (sixes == 3){
            turnPoints += 600;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (fives == 3){
            turnPoints += 500;
            if (ones == 1){
                turnPoints += 100;
            }
        } else if (fours == 3){
            turnPoints += 400;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (threes == 3){
            turnPoints += 300;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (twos == 3){
            turnPoints += 200;
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        } else if (ones == 3){
            turnPoints += 300;
            if (fives == 1){
                turnPoints += 50;
            }
        } else {
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        }
    }
    public void pointCount(int die1, int die2, int die3){
        diceToRoll = diceRolled - 3;
        if (diceToRoll == 0){
            diceToRoll = 6;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        dice.add(die3);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        twos = Collections.frequency(dice,2);
        threes = Collections.frequency(dice,3);
        fours = Collections.frequency(dice,4);
        fives = Collections.frequency(dice,5);
        sixes = Collections.frequency(dice,6);

        if (sixes == 3){
            turnPoints += 600;
        } else if (fives == 3){
            turnPoints += 500;
        } else if (fours == 3){
            turnPoints += 400;
        } else if (threes == 3){
            turnPoints += 300;
        } else if (twos == 3){
            turnPoints += 200;
        } else if (ones == 3){
            turnPoints += 300;
        } else {
            if (ones == 2){
                turnPoints += 200;
            }
            if (ones == 1){
                turnPoints += 100;
            }
            if (fives == 2){
                turnPoints += 100;
            }
            if (fives == 1){
                turnPoints += 50;
            }
        }
    }
    public void pointCount(int die1, int die2){
        diceToRoll = diceRolled - 2;
        if (diceToRoll == 0){
            diceToRoll = 6;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        dice.add(die2);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones == 2){
            turnPoints += 200;
        }
        if (ones == 1){
            turnPoints += 100;
        }
        if (fives == 2){
            turnPoints += 100;
        }
        if (fives == 1){
            turnPoints += 50;
        }
    }
    public void pointCount(int die1){
        diceToRoll = diceToRoll - 1;
        if (diceToRoll == 0){
            diceToRoll = 6;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(die1);
        Collections.sort(dice);

        ones = Collections.frequency(dice,1);
        fives = Collections.frequency(dice,5);

        if (ones == 1){
            turnPoints += 100;
        }
        if (fives == 1){
            turnPoints += 50;
        }
    }

    public int getTurnPoints(){
        return turnPoints;
    }
    public boolean getSameTurn(){
        return sameTurn;
    }

    public boolean getLoseTurnPoints() { return loseTurnPoints; }
    public void resetDiceToRoll() { diceToRoll = 6; }
    public int getDiceToRoll() { return diceToRoll; }
}
