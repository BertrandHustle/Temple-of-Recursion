
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //init
        int width = 10;
        int height = 10;
        Player player = new Player();

        //make key listener
        Scanner scanner = new Scanner(System.in);

        //enemy list
        Enemy.Grunt grunt1 = new Enemy().new Grunt();
        ArrayList<Enemy> enemiesOnFloor = new ArrayList<>(Arrays.asList(grunt1));

        //main game loop
        while (true){

            //Game Over
            if (player.HP == 0){
                System.out.println("YOU DIED");
                System.out.println("TRY AGAIN?");

                //todo: set this so game restarts if user types "Y", breaks if they type "N"

                break;
            }

            Floor floor1 = new Floor(width, height, enemiesOnFloor, player);

            char[][] map = floor1.getMap();

            //clears/prints screen
            System.out.print("\033[H\033[2J");
            Floor.toString(floor1);

            String input = scanner.next();

            //lets player move
            player.movePlayer(player, input, floor1);

            //enemy moves after player
            for (Enemy enemy: enemiesOnFloor){
                enemy.movement(enemy, floor1);
            }

            //sets new player coordinates
            System.out.println(player.getLocation());
            System.out.println("HP: " + player.HP);

        }
    }
}
