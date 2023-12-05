
package fantasy;

import java.util.Scanner;

public class Fantasy {

    public static void main(String[] args) {
        
        Scanner player_name = new Scanner(System.in);
        System.out.println("Provide the first contestant name");
        String contestant1_name = player_name.nextLine();
        System.out.println("Provide the second contestant name");
        String contestant2_name = player_name.nextLine();
        System.out.println("Provide the third contestant name");
        String contestant3_name = player_name.nextLine();
        Contestant contestant1 = new Contestant(contestant1_name);
        Contestant contestant2 = new Contestant(contestant2_name);
        Contestant contestant3 = new Contestant(contestant3_name);
        
        System.out.println("Provide first player name");
        String player1_name = player_name.nextLine();
        System.out.println("Provide first player name");
        String player2_name = player_name.nextLine();
        System.out.println("Provide first player name");
        String player3_name = player_name.nextLine();
        Player player1 = new Player(player1_name,3,contestant1,contestant2,contestant3);
        Player player2 = new Player(player2_name,3,contestant1,contestant2,contestant3);
        Player player3 = new Player(player3_name,3,contestant1,contestant2,contestant3);
    }
    
}
