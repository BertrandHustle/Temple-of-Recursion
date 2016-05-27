import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * This denotes the player
 */

public class Player {

    char model = '@';
    int locationX = 5;
    int locationY = 5;
    double locationCoordinates = 5.5;
    int HP = 20;
    int ATK = 2;
    //keeps track of number of turns player takes (use to track enemy turns)
    int turns = 0;

    //makes player move
    //todo: implement keylogger
    public void movePlayer (Player player, String input, Floor floor){

        switch(input){

            //if blocks prevent player from moving off of grid

            //move right
            case "d":
                if (player.locationY != floor.getWidth() - 1) {
                    player.locationY++;
                }

                break;

            //move left
            case "a": if (player.locationY != 0) {
                player.locationY--;
            }

                break;

            //move up
            case "w": if (player.locationX != 0) {
                player.locationX--;
            }

                break;

            //move down
            case "s": if (player.locationX != floor.getHeight() - 1) {
                player.locationX++;
            }

                break;
        }

    }

    //attacks enemies
    public void attack(Floor floor){

        //checks if player has collided with enemy


        if (floor.getMap()[locationX][locationY] == 'g'){

            //get enemy at location of 'g' by querying ArrayList against enemy location
            //Enemy defender = floor.getEnemiesOnFloor();


        }
    }

    //prints player model
    public char toChar(){
        return model;
    }

    public void setLocationCoordinates(double locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }
}
