
/**
 * This denotes the player
 */

public class Player {

    char model = '@';
    int locationX = 5;
    int locationY = 5;

    //makes player move
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

    //prints player model
    public char toChar(){
        return model;
    }

}
