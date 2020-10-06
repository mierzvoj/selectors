package pjatk;

import java.math.*;
import java.util.ArrayList;
import java.util.List;

public class Selector {

    private List<BoardGame> games = new ArrayList<>();

    public void addGames(String name, BigDecimal price, double rating) {
        BoardGame myGame = new BoardGame(name, price, rating);
        games.add(myGame);
    }


    public void selectGame() {


        games.stream()
                .filter(ga -> new BigDecimal(50).compareTo(ga.price) < 0)
                .filter(ga -> ga.rating > 30)
                .map(ga -> ga.name.toUpperCase())
                .forEach(System.out::println);



    }

    @Override
    public String toString() {
        return "Selector{" +
                "games=" + games +
                '}';
    }
}