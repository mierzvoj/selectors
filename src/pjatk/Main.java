package pjatk;

import java.math.*;
import java.util.Optional;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {


    Selector sel1 = new Selector();

    sel1.addGames("Terra Mars", new BigDecimal("1500"), 8.78);
    sel1.addGames("Codenames", new BigDecimal("1800"), 2);
    sel1.addGames("Scythe", new BigDecimal("100"), 5);
    sel1.addGames("Power Grid", new BigDecimal("350"), 15);
    sel1.addGames("Dominion", new BigDecimal("150"), 34);
    sel1.addGames("Castles", new BigDecimal("850"), 17.7);

    sel1.selectGame();

    System.out.println(sel1.findById("Terra Mars"));



    }
}
