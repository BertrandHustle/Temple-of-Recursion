import java.util.ArrayList;

/**
 * These are the floors/maps/grids for the dungeon
 */

public class Floor {

    private int width;
    private int height;
    private char[][] map;
    private ArrayList<Enemy> enemiesOnFloor = new ArrayList<>();

    public Floor(int width, int height, char[][] map) {
        this.width = width;
        this.height = height;
        this.map = map;
    }

    public static char[][] makeFloor (int width, int height, Player player, ArrayList<Enemy> enemies){

        char [][] floor = new char[width][height];

        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){

                //checks for player location and inputs on map, else prints empty space
                if (player.locationX == x && player.locationY == y) {
                    floor[x][y] = player.toChar();
                } else {
                    floor[x][y] = '_';
                }

                //prints enemies on maps
                for (Enemy enemy : enemies){
                    if(enemy.getLocationX() == x && enemy.getLocationY() == y) {
                        floor[x][y] = enemy.toChar();
                    } else {
                        floor[x][y] = '_';
                    }
                }
            }
        }
        return floor;
    }

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
