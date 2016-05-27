
/**
 * This denotes the player
 */

public class Player {

    char model = '@';
    int locationX = 5;
    int locationY = 5;

    //makes player move
    public void movePlayer (Player player, String input){

        switch(input){
            //move ???
            case "d": player.locationY++;
                break;
            //move left
            case "a": player.locationY--;
                break;
            //move ???
            case "w": player.locationX--;
                break;
            //move down
            case "s": player.locationX++;
                break;
        }

    }

    //prints player model
    public char toChar(){
        return model;
    }

}
