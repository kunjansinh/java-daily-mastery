// Name: Kunjan

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Gamer
{
    String name;
    int score;

    Gamer(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}

public class PlayerLeaderboard
{
    public static void main(String[] args)
    {
        List<Gamer> players = new ArrayList<>();

        players.add(new Gamer("Kunjan", 850));
        players.add(new Gamer("Alex", 620));
        players.add(new Gamer("Sarah", 940));
        players.add(new Gamer("Daniel", 450));
        players.add(new Gamer("Mia", 780));

        System.out.println("==============================");
        System.out.println("       PLAYER LEADERBOARD");
        System.out.println("==============================");

        System.out.println("\nPlayers with score above 700:");

        players.stream()
               .filter(player -> player.score > 700)
               .forEach(player ->
                   System.out.println(
                       player.name + " - " + player.score
                   )
               );

        System.out.println("\nTop players:");

        players.stream()
               .sorted(Comparator.comparingInt(
                   (Gamer player) -> player.score
               ).reversed())
               .limit(3)
               .forEach(player ->
                   System.out.println(
                       player.name + " - " + player.score
                   )
               );
    }
}