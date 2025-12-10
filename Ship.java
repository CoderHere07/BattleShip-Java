public class Ship{
    String name;
    int numOfShip;
    int numOfDestroyed;
    Ship(){};
    Ship(String name, int num){
        this.name = name;
        this.numOfShip = num;
        numOfDestroyed = 0;
    }
    public int getNumOfShip(){
        return numOfShip;
    }
    public int getNumOfDesShip(){
        return numOfDestroyed;
    }
    public void attack(){
        numOfDestroyed++;
        numOfShip--;
        System.out.println("\t\t\tRemaining Ships: "+numOfShip);
    }
}