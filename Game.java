public interface Game {
    public Player toss();
    public void start();
    public void setupBoard(Player p1);
    public void takeTurn();
    public void switchPlayers();
}
