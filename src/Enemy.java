import java.util.ArrayList;

/**
 * Enemy class
 */

public class Enemy {

    private int locationX = 6;
    private int locationY = 6;

    private Location location = new Location(locationX, locationY);
    private int HP = 4;
    private int ATK = 1;
    private char model = 'g';

    //todo: make constructor that randomizes locationCoordinates

    //iterates through list of enemies on current floor and returns Enemy based on location coordinates
    //todo: fix so this gets enemy from list instead of making new instance of enemy
    public static Enemy getEnemy (Location location, ArrayList<Enemy> enemiesOnFloor){

        ArrayList<Enemy> selectedEnemy = new ArrayList<>();

        for (Enemy enemy : enemiesOnFloor){
            if (enemy.location.getX() == location.getX() && enemy.location.getY() == location.getY()){
                selectedEnemy.add(enemy);
            }
        }
      return selectedEnemy.get(0);
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

    public int getATK() {
        return ATK;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
