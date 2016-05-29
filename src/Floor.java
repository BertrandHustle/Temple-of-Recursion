import java.util.ArrayList;

/**
 * These are the floors/maps/grids for the dungeon
 */

public class Floor {

    private int width;
    private int height;
    private char[][] map;
    private ArrayList<Enemy> enemiesOnFloor = new ArrayList<>();
    private Player player;

    public Floor(int width, int height, ArrayList<Enemy> enemiesOnFloor, Player player) {
        this.width = width;
        this.height = height;
        this.enemiesOnFloor = enemiesOnFloor;
        this.player = player;

        char [][] floor = new char[width][height];

        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){

                //checks for player location and inputs on map if space is empty, else prints empty space
                if (player.locationX == x && player.locationY == y && floor[x][y] != ' ' ) {
                    floor[x][y] = player.toChar();
                } else if (floor[x][y] == '\u0000'){
                    floor[x][y] = '_';
                }

                //prints enemies on maps
                for (Enemy enemy : enemiesOnFloor){
                    //if the enemy location matches the grid tile, and the space is empty, and the enemy is not dead
                    if(enemy.getLocationX() == x && enemy.getLocationY() == y && floor[x][y] != ' ' && enemy.getHP() != 0) {
                        floor[x][y] = enemy.toChar();
                    } else if (floor[x][y] == '\u0000'){
                        floor[x][y] = '_';
                    }
                }
            }
        }

        this.setMap(floor);
    }

    /*
    public static char[][] makeFloor (int width, int height, Player player, ArrayList<Enemy> enemies){

        char [][] floor = new char[width][height];

        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){

                //checks for player location and inputs on map if space is empty, else prints empty space
                if (player.locationX == x && player.locationY == y && floor[x][y] != ' ' ) {
                    floor[x][y] = player.toChar();
                } else if (floor[x][y] == '\u0000'){
                    floor[x][y] = '_';
                }

                //prints enemies on maps
                for (Enemy enemy : enemies){
                    //if the enemy location matches the grid tile, and the space is empty, and the enemy is not dead
                    if(enemy.getLocationX() == x && enemy.getLocationY() == y && floor[x][y] != ' ' && enemy.getHP() != 0) {
                        floor[x][y] = enemy.toChar();
                    } else if (floor[x][y] == '\u0000'){
                        floor[x][y] = '_';
                    }
                }
            }
        }
        return floor;
    }
    */

    public static void toString (Floor floor){

        for (int x = 0; x < floor.width; x++){
            for (int y = 0; y < floor.height; y++){
                System.out.print(floor.map[x][y] + " ");
            }
            System.out.print("\n");
        }

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public ArrayList<Enemy> getEnemiesOnFloor() {
        return enemiesOnFloor;
    }
}
