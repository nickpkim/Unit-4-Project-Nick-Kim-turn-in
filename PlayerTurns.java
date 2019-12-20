public class PlayerTurns {

    private int numOfPlayers;
    private int turnNum;

    public PlayerTurns(int numOfPlayers){
        this.numOfPlayers = numOfPlayers;
        turnNum = 1;
    }
    public void nextTurn(){
        if (turnNum < numOfPlayers){
            turnNum++;
        } else if (turnNum == numOfPlayers){
            turnNum = 1;
        }
    }
    public int getTurn(){
        return turnNum;
    }
}
