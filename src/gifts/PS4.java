package gifts;

public class PS4 extends gift{
    private int games;

    public PS4() {}

    public PS4(String name, double weight, double price, int games) {
        super(name, weight, price);
        this.games = games;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return super.toString() + " games = " + games;
    }
}
