import java.util.*;
import java.util.Scanner;

public class Farkle {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        boolean computer = false;

        while (run) {
            System.out.println("Player vs Player: press p");
            System.out.println("Player vs Computer: press c");
            String action = scan.nextLine();

            if (action.equals("p")){
                run = false;
            }
            if (action.equals("c")){
                computer = true;
                run = false;
            }
        }

        run = true;

        Player p1 = new Player(1);
        Player p2 = new Player(2);

        PlayerScore p1score = new PlayerScore();
        PlayerScore p2score = new PlayerScore();

        PlayerTurns t = new PlayerTurns(2);

        Die d1 = new Die();

        int diceToRoll = 6;

        ArrayList<Integer> dice = new ArrayList<Integer>();

        FarkleDiceChecker check = new FarkleDiceChecker();

        ArrayList<Integer> diceToScore = new ArrayList<Integer>();

        System.out.println("r to roll, p to pass, q to quit game");

        while (run) {
            System.out.println();
            System.out.println("Player "+t.getTurn()+"'s turn");
            String action = scan.nextLine();

            if (action.equals("r")) {
                if (diceToRoll == 0) { diceToRoll = 6; }
                for (int i=0; i<diceToRoll; i++){
                    d1.roll();
                    dice.add(d1.getFace());
                }
                System.out.println("Dice: "+dice);
                if (dice.size() == 6){
                    check.farkleCheck(dice.get(0),dice.get(1),dice.get(2),dice.get(3),dice.get(4),dice.get(5));
                } else if (dice.size() == 5){
                    check.farkleCheck(dice.get(0),dice.get(1),dice.get(2),dice.get(3),dice.get(4));
                } else if (dice.size() == 4){
                    check.farkleCheck(dice.get(0),dice.get(1),dice.get(2),dice.get(3));
                } else if (dice.size() == 3){
                    check.farkleCheck(dice.get(0),dice.get(1),dice.get(2));
                } else if (dice.size() == 2){
                    check.farkleCheck(dice.get(0),dice.get(1));
                } else if (dice.size() == 1){
                    check.farkleCheck(dice.get(0));
                }
                if (!check.getSameTurn()){
                    System.out.println("Farkle!");
                    System.out.println();
                    System.out.println("Player 1: "+p1score.getPoints());
                    System.out.println("Player 2: "+p2score.getPoints());
                    System.out.println();
                    dice.clear();
                    diceToScore.clear();
                    check.resetTurnPoints();
                    diceToRoll = 6;
                    t.nextTurn();
                    continue;
                }

                System.out.println("Which dice would you like to be scored?");
                System.out.println("(Input the respective order number of the die)");
                System.out.println("(When you are done selecting, press d)");
                boolean run2 = true;
                while (run2){
                    String action2 = scan.nextLine();
                    if (action2.equals("d")){
                        run2 = false;
                    } else {
                        diceToScore.add(dice.get(Integer.parseInt(action2) - 1));
                    }
                }
                if (diceToScore.size() == 6){
                    check.pointCount(diceToScore.get(0),diceToScore.get(1),diceToScore.get(2),diceToScore.get(3),diceToScore.get(4),diceToScore.get(5));
                    diceToRoll -= 6;
                } else if (diceToScore.size() == 5){
                    check.pointCount(diceToScore.get(0),diceToScore.get(1),diceToScore.get(2),diceToScore.get(3),diceToScore.get(4));
                    diceToRoll -= 5;
                } else if (diceToScore.size() == 4){
                    check.pointCount(diceToScore.get(0),diceToScore.get(1),diceToScore.get(2),diceToScore.get(3));
                    diceToRoll -= 4;
                } else if (diceToScore.size() == 3){
                    check.pointCount(diceToScore.get(0),diceToScore.get(1),diceToScore.get(2));
                    diceToRoll -= 3;
                } else if (diceToScore.size() == 2){
                    check.pointCount(diceToScore.get(0),diceToScore.get(1));
                    diceToRoll -= 2;
                } else if (diceToScore.size() == 1){
                    check.pointCount(diceToScore.get(0));
                    diceToRoll -= 1;
                }
                System.out.println("Turn points: "+check.getTurnPoints());
                dice.clear();
                diceToScore.clear();
            }

            if (action.equals("p")) {
                if (t.getTurn() == 1){
                    p1score.addScore(check.getTurnPoints());
                    if (p1score.getScore() >= 5000){
                        run = false;
                    }
                }
                if (t.getTurn() == 2){
                    p2score.addScore(check.getTurnPoints());
                    if (p2score.getScore() >= 5000){
                        run = false;
                    }
                }
                System.out.println("Player 1: "+p1score.getPoints());
                System.out.println("Player 2: "+p2score.getPoints());
                System.out.println();
                check.resetTurnPoints();
                diceToRoll = 6;
                t.nextTurn();
            }

            if (action.equals("q")) {
                run = false;
            }
        }
        if (p1score.getScore() > p2score.getScore()){
            System.out.println("Player 1 wins!");
        }
        if (p1score.getScore() < p2score.getScore()){
            System.out.println("Player 2 wins!");
        }
        if (p1score.getScore() == p2score.getScore()){
            System.out.println("It's a draw. Stand dow");
        }
    }
}
