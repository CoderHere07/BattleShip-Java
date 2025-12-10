import java.util.Scanner;
public class RunGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t----------Instruction----------");
        System.out.println("\t\t\t--------Two Player Game--------");
        System.out.println("\t\t\t1- Both PLayer set the Name");
        System.out.println("\t\t2- Both PLayer set the name of there Ships");
        System.out.println("\t\t3- Both PLayer set there Ships on there Board");
        System.out.println("\tNOTE :: Hide the location from Other player if you want to win");
        System.out.println("\t\t\tThen we have Toss ");
        System.out.println("\t\t\tPlayer one has to call");
        System.out.println("The wininng PLayer first Attack on other players board by guess there Ships location");
        System.out.println("\t\tThe player who destory the other player Ships first Won");
        System.out.println();
        System.out.println("\t\t\t----------Battle Ship----------");
        System.out.println();
        System.out.println("\t\t\t------Let the game begin-------");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\tPlayer one Enter your name");
        String name1 = sc.nextLine();
        System.out.println("\t\t\tPlayer one Enter your Ship name");
        String ship1 = sc.nextLine();
        Ship s1 = new Ship(ship1,3);
        System.out.println();
        System.out.println();
        System.out.println("\t\t\tPlayer Two Enter your name");
        String name2 = sc.nextLine();
        System.out.println("\t\t\tPlayer Two Enter your Ship name");
        String ship2 = sc.nextLine();
        Ship s2 = new Ship(ship2,3);
        BattleShipGame Game = new BattleShipGame(name1, s1, name2, s2);
        Game.start();
    }
}
