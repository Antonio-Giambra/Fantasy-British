
package fantasy;

public class Player {
    String name;
    int Player_number;
    Contestant contestant1;
    Contestant contestant2;
    Contestant contestant3;

    public Player(String name, int Player_number, Contestant contestant1, Contestant contestant2, Contestant contestant3) {
        this.name = name;
        this.Player_number = Player_number;
        this.contestant1 = contestant1;
        this.contestant2 = contestant2;
        this.contestant3 = contestant3;
    }
}
