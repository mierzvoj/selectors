package pjatk;

import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Selector {
    BoardGame boardgame;

    private List<BoardGame> games = new ArrayList<>();
    private Object BoardGame;

    public void addGames(String name, BigDecimal price, double rating) {
        BoardGame myGame = new BoardGame(name, price, rating);
        games.add(myGame);
    }


    public void selectGame() {


        games.stream()
                .filter(ga -> new BigDecimal(50).compareTo(ga.price) < 0)
                .filter(ga -> ga.rating > 2)
                .map(ga -> ga.name.toUpperCase())
                .forEach(System.out::println);



    }

    public Optional<BoardGame> findById(String name){
        return games.stream().filter(ga -> ga.getName().equals(name)).findFirst();
    }


    @Override
    public String toString() {
        return "Selector{" +
                "games=" + games +
                '}';
    }
}