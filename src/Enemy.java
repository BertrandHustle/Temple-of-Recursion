import java.util.ArrayList;

/**
 * Enemy class
 */

public class Enemy {

    private int locationX = 6;
    private int locationY = 6;

    private Location location = new Location(locationX, locationY);
    private int HP = 2;
    private char model = 'g';

    //todo: make constructor that randomizes locationCoordinates

    //iterates through list of enemies on current floor and returns Enemy based on location coordinates
    public Enemy getEnemy (Floor floor,  Location location){

        //init
        ArrayList<Enemy> enemiesOnFloor = floor.getEnemiesOnFloor();
        Enemy selectedEnemy = new Enemy();

        for (Enemy enemy : enemiesOnFloor){
            if (enemy.location == location){
                selectedEnemy = enemy;
            }
        }

        return selectedEnemy;
    }

    public class Grunt extends Enemy {

        //controls grunt movement/pathfinding
        //todo: make this so enemy moves every time player moves
        public void movement(){

        }

    }

    public char toChar(){
        return model;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
