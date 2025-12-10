public class Player extends Person{
    Board board;
    Player(){}
    Player(String name, Ship s){
        super(name);
        board = new Board(5,s);
    }
    public Board getBoard(){
        return board;
    }
    public void placeShip(int a, int b){
        board.placeShip(a,b);
    }
    public boolean attack(Player opponent, int x, int y) {
        boolean hit = opponent.getBoard().receiveAttack(x, y);
        if (hit) {
            System.out.println("\t\t\t" + name + " hit a ship at (" + x + ", " + y + ")");
        } else {
            System.out.println("\t\t\t" + name + " missed at (" + x + ", " + y + ")");
        }
        return hit;
    }
    public boolean hasShips(){
        return board.hasShips();
    }
}
