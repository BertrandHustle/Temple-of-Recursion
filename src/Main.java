import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        int width = 10;
        int height = 10;
        Player player = new Player();

        //init scanner
        Scanner scanner = new Scanner(System.in);



        while (true){

            char[][] map = Floor.makeFloor(width, height, player);
            Floor floor1 = new Floor(width, height, map);
            Floor.toString(floor1);

            String input = scanner.next();
            player.movePlayer(player, input);

        }
    }
}
