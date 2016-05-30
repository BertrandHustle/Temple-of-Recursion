import java.util.ArrayList;
import java.util.Random;

/**
 * Enemy class
 */

public class Enemy {

    private int locationX;
    private int locationY;
    private Location location = new Location(locationX, locationY);
    private int HP;
    private int ATK;
    private char model = 'g';


    Random random = new Random();

    //iterates through list of enemies on current floor and returns Enemy based on location coordinates
    public static Enemy getEnemy (Location location, ArrayList<Enemy> enemiesOnFloor){

        ArrayList<Enemy> selectedEnemy = new ArrayList<>();

        for (Enemy enemy : enemiesOnFloor){

            //todo: fix this so enemy.location gets subclass's location
            if (enemy.getLocation().getX() == location.getX() && enemy.getLocation().getY() == location.getY()){
                selectedEnemy.add(enemy);
            }
        }
      return selectedEnemy.get(0);
    }

    //general purpose static method for moving enemies
    public void movement(Enemy enemy, Floor floor){

        int randomMove = random.nextInt(4);

        switch (randomMove) {
            case 0: this.locationY++;
            case 1: this.locationY--;
            case 2: this.locationX--;
            case 3: this.locationX++;
        }

        switch(randomMove){

            //move right
            //todo: simplify this so collision includes walls
            case 0: if (this.locationY != floor.getWidth() - 1) {
                this.locationY++;
            }
                break;

            //move left
            case 1: if (this.locationY != 0) {
                this.locationY--;
            }
                break;

            //move up
            case 2: if (this.locationX != 0) {
                this.locationX--;
            }
                break;

            //move down
            case 3: if (this.locationX != floor.getHeight() - 1) {
                this.locationX++;
            }

                break;
        }

    }

    //the easiest/most basic enemy type
    public class Grunt extends Enemy {

        //todo: bound location/movement so enemies cant move off grid

        int locationX = random.nextInt(10)+1;
        int locationY = random.nextInt(10)+1;
        Location location = new Location(locationX, locationY);
        int HP = 4;
        int ATK = 1;
        char model = 'g';

        @Override
        public int getLocationX() {
            return locationX;
        }

        public void setLocationX(int locationX) {
            this.locationX = locationX;
        }

        @Override
        public int getLocationY() {
            return locationY;
        }

        public void setLocationY(int locationY) {
            this.locationY = locationY;
        }

        @Override
        public Location getLocation() {
            return location;
        }

        @Override
        public void setLocation(Location location) {
            this.location = location;
        }

        @Override
        public int getHP() {
            return HP;
        }

        @Override
        public void setHP(int HP) {
            this.HP = HP;
        }

        @Override
        public int getATK() {
            return ATK;
        }

        public void setATK(int ATK) {
            this.ATK = ATK;
        }

        public char getModel() {
            return model;
        }

        public void setModel(char model) {
            this.model = model;
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

    public Location getLocation() {
        return location;
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
