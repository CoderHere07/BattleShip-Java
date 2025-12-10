import java.util.Random;
import java.util.Scanner;

public class BattleShipGame implements Game{
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Player otherPlayer;
    private Ship ship1;
    private Ship ship2;
    private Scanner sc;
    BattleShipGame(String pl1, Ship ship1, String pl2, Ship ship2){
        player1 = new Player(pl1,ship1);
        player2 = new Player(pl2,ship2);
        this.ship1 = ship1;
        this.ship2 = ship2;

        sc = new Scanner(System.in);
    }
    public void start(){
        System.out.println("\t\t\tBe ready for placing your ships");
        setupBoard(player1);
        System.out.println("\t\t\tBe ready for placing your ships");
        setupBoard(player2);
        Player tossWinner = toss();
        if(tossWinner.getName() == player1.getName()){
            currentPlayer = player1;
            otherPlayer = player2;
        }else{
            currentPlayer = player2;
            otherPlayer = player1;
        }
        while (ship1.getNumOfShip()>0 && ship2.getNumOfShip()>0) {
            takeTurn();
            switchPlayers();
        }

        if (ship1.getNumOfShip()>0) {
            System.out.println("\t\t*****" + player1.getName() + " wins *****");
        } else if(ship2.getNumOfShip()>0){
            System.out.println("\t\t*****" + player2.getName() + " wins *****");
        }
    }
    public Player toss(){
        System.out.println("\t\t\tPLayer one choice heades or tail");
        int t=5;
        do {
            System.out.println("\t\t\tFor Head press 0 and For tail Press 1");
            t = sc.nextInt();
            
        } while (t<0 || t>1);
        Random r1 = new Random();
        int c = r1.nextInt(2);
        if(t==c){
            System.out.println("\t\t\tPLayer one won");
            return player1;
        }
        System.out.println("\t\t\tPLayer two Won");
        return player2;
    }
    public void setupBoard(Player p1){
        System.out.println("\t\t\t----------"+p1.getName()+"-----------");
        System.out.println("\t\t\t" + p1.getName()+" Set up your board ");
        Board b = p1.getBoard();
        while (b.hasShips()) {
            System.out.println("\t\tHide the Placing location from other player");
            System.out.println("\t\t\tHere is your Board");
            b.displayBoard();
            System.out.println("\t\t\tNow enter the X point of the location");
            int x = sc.nextInt();
            System.out.println("\t\t\tNow enter the Y point of the location");
            int y = sc.nextInt();
            p1.placeShip(x,y);
            System.out.println();
        }
    }
    public void takeTurn(){
        System.out.println("\t\t\t" + currentPlayer.getName() + "'s turn:");
        otherPlayer.getBoard().displayAttackBoard();
        System.out.print("\t\t\tEnter attack Location (x y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        currentPlayer.attack(otherPlayer, x, y);
        System.out.println();
    }
    public void switchPlayers(){
        Player temp = currentPlayer;
        currentPlayer = otherPlayer;
        otherPlayer = temp;
    }
}
