package pjatk;

import java.math.*;

public class BoardGame {
    public String name;
    public BigDecimal price;
    public double rating;

    public BoardGame(String name, BigDecimal price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
