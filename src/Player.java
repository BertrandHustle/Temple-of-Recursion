import java.util.Scanner;

/**
 * This is the player
 */
public class Player {

    char model = '@';
    int locationX = 5;
    int locationY = 5;

    //makes player move
    public void movePlayer (Player player, String input){

        switch(input){
            //move up
            case "w": player.locationY++;
            //move down
            case "s": player.locationY--;
            //move left
            case "a": player.locationX--;
            //move right
            case "d": player.locationX++;
        }

    }

    //prints player model
    public char toChar(){
        return model;
    }

}
