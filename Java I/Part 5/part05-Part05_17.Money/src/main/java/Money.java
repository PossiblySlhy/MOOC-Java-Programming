
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        // The constructor already handles cent values greater than 99, so we are safe
        // to add directly
        Money newMoney = new Money(addition.euros() + this.euros(), addition.cents() + this.cents());

        return newMoney;
    }

    public Money minus(Money decreaser) {
        // Constructor can't handle negative cent values, so we have to break it up
        int thisTotalCents = this.euros() * 100 + this.cents(); // Get total value of this in cents
        int decreaserTotalCents = decreaser.euros() * 100 + decreaser.cents(); // Get total value of decreaser in cents
        int newTotalCents = thisTotalCents - decreaserTotalCents; // Subtract decreaser from this

        if (newTotalCents < 0) {
            Money newMoney = new Money(0, 0);

            return newMoney;
        } else {
            // Split cents back into euros and cents
            int newEuros = newTotalCents / 100;
            int newCents = newTotalCents % 100;
            Money newMoney = new Money(newEuros, newCents);

            return newMoney;
        }
    }

    public boolean lessThan(Money compared) {
        // If euros is less than compared, we can immediately return true
        if (this.euros() < compared.euros()) {
            return true;
            // If euros is equal but cents is less than compared, return true
        } else if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
