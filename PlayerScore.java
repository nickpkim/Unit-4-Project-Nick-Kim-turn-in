public class PlayerScore {

    private int score;

    public PlayerScore(){
        score = 0;
    }
    public void addScore(int toAdd){
        score += toAdd;
    }
    public void scoreZero(){
        score = 0;
    }
    public int getScore() {
        return score;
    }
    public String getPoints() {
        String points = score+" points";
        return points;
    }
}
