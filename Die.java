public class Die {
    private int face;
    public Die() {
        face = 1;
    }

    public int getFace() {
        return face;
    }

    public void roll() {
        face = (int) (Math.random()*6 + 1);
    }

    public String toString() {
        String result = "Face value = " + face;
        return result;
    }
}
