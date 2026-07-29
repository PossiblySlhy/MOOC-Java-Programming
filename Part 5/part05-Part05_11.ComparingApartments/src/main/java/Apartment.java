
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    // private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        // this.totalPrice = this.squares * this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int priceOfThis = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;

        return Math.abs(priceOfThis - priceOfCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceOfThis = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;

        if (priceOfThis < priceOfCompared) {
            return false;
        } else {
            return true;
        }
    }
}
