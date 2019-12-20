import java.util.Scanner;
public class PigDice {
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
        Die d2 = new Die();

        PigDiceChecker check = new PigDiceChecker();

        System.out.println("r to roll, p to pass, q to quit game");

        while (run) {
            System.out.println("Player 1: "+p1score.getPoints());
            System.out.println("Player 2: "+p2score.getPoints());
            System.out.println();
            System.out.println("Player "+t.getTurn()+"'s turn");
            String action = scan.nextLine();

            if (action.equals("r")) {
                d1.roll();
                d2.roll();
                System.out.println("Dice: "+d1.getFace()+" "+d2.getFace());
                check.pigCheck(d1.getFace(),d2.getFace());
                check.getLoseTurnPoints();
                if (check.getLoseAllPoints()){
                    if (t.getTurn() == 1){
                        p1score.scoreZero();
                    }
                    if (t.getTurn() == 2){
                        p2score.scoreZero();
                    }
                }
                if (!check.getSameTurn()){
                    t.nextTurn();
                }
                System.out.println("turn points: "+check.getTurnPoints());
            }

            if (action.equals("p")) {
                if (t.getTurn() == 1){
                    p1score.addScore(check.getTurnPoints());
                }
                if (t.getTurn() == 2){
                    p2score.addScore(check.getTurnPoints());
                }
                check.resetTurnPoints();
                t.nextTurn();
            }

            if (action.equals("q")) {
                run = false;
            }
        }
    }
}
