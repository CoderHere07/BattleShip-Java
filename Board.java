public class Board {
    int battelFieldSize ;
    int[][] field;
    int placedShip;
    Ship ships;
    Board(){};
    Board(int size, Ship s1){
        battelFieldSize = size;
        field = new int[size][size];
        ships = s1;
    }
    
    public void placeShip(int a, int b){
        int size = field.length-1;
        if((a<0 || a>size) || (b<0 || b>size)){
            System.out.println("\t\t\tThis Location  does't exist ");
        }else{
            if(field[a][b]==1){
                System.out.println("\t\t\tYou already place the Ship at this Location");
            }
            else{
                field[a][b]=1;
                placedShip++;
            }
        }
    }
    public boolean receiveAttack(int a, int b){
        int size = field.length-1;
        if((a<0 || a>size) || (b<0 || b>size)){
            System.out.println("\t\t\tThis Location  does't exist ");
            return false;
        }else{
            if(field[a][b]==2){
                System.out.println("\t\t\tYou already attacked at that location");
                return false;
            }
            else if(field[a][b]==1){
                System.out.println("\t\tYou Successfully destroyed opponents Ship");
                field[a][b]=2;
                ships.attack();
                return true;
            }
            else{
                field[a][b]=2;
                System.out.println("\t\t\tThere is no Ship there");
                return false;
            }
        }
    }
    public boolean hasShips(){
        if (ships.getNumOfShip()>placedShip){
            return true;
        }
        return false;
    }
    public void displayBoard(){
        for(int i=0;i<field.length;i++){
            System.out.println("\t\t\t");
            for(int j=0;j<field.length;j++){
                System.out.print("   {X:"+i+" Y:"+j+"}   ");
            }
            System.out.println();
        }
    }
    public void displayAttackBoard(){
        for(int i=0;i<field.length;i++){
            System.out.println("\t\t\t");
            for(int j=0;j<field.length;j++){
                if(field[i][j]==2){
                    System.out.print("       -       ");
                }else{
                    System.out.print("   {X:"+i+" Y:"+j+"}   ");
                }
                
            }
            System.out.println();
        }
    }
}
