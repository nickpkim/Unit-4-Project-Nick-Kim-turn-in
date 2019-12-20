public class Player {

    private int playerNum;

    public Player(int playerNum) {
        this.playerNum = playerNum;
    }
    public int getPlayerNum() {
        return playerNum;
    }
    public String getPlayer() {
        String player = "Player "+playerNum;
        return player;
    }
}
