
/**
 * This denotes the player
 */

public class Player {

    char model = '@';
    int locationX = 5;
    int locationY = 5;

    private Location location = new Location(locationX, locationY);

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
            //todo: simplify this so collision includes walls
            case "d": if (player.locationY != floor.getWidth() - 1) {
                    player.locationY++;
                    turns++;
                }

                //"undoes" move if player hits an enemy or wall
                if (player.playerCollide(floor)){
                    player.locationY--;
                    turns++;
                }

                break;

            //move left
            case "a": if (player.locationY != 0) {
                player.locationY--;
                turns++;

                if (player.playerCollide(floor)){
                    player.locationY++;
                    turns++;
                }

            }

                break;

            //move up
            case "w": if (player.locationX != 0) {
                player.locationX--;
                turns++;
            }

                if (player.playerCollide(floor)){
                    player.locationX++;
                    turns++;
                }

                break;

            //move down
            case "s": if (player.locationX != floor.getHeight() - 1) {
                player.locationX++;
                turns++;
            }

                if (player.playerCollide(floor)){
                    player.locationX--;
                    turns++;
                }

                break;
        }

    }

    //attacks enemies
    public boolean playerCollide(Floor floor){

        //checks if player has collided with enemy

        boolean collision = false;

        char object = floor.getMap()[locationX][locationY];

        if (object != '_'){

            //get object location
            Location objectLocation = new Location(locationX, locationY);

            //if the object is an enemy
            if (Character.isLowerCase(object)){
                collision = true;
            }


            //Enemy defender = floor.getEnemiesOnFloor();


        }

        return collision;
    }

    //prints player model
    public char toChar(){
        return model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
