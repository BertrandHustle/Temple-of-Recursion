import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
        ArrayList<Enemy> enemiesOnFloor = new ArrayList<Enemy>(Arrays.asList(grunt1));

        //main game loop
        while (true){

            //Game Over
            if (player.HP == 0){
                break;
            }

            char[][] map = Floor.makeFloor(width, height, player, );
            Floor floor1 = new Floor(width, height, map);

            //clears/prints screen
            System.out.print("\033[H\033[2J");
            Floor.toString(floor1);

            String input = scanner.next();
            player.movePlayer(player, input, floor1);

            //sets new player coordinates
            player.setLocationCoordinates((player.locationX*10 + player.locationY)/10);
            System.out.println(player.locationCoordinates);
            System.out.println(player.HP);

        }
    }
}
