public class Container {
    private int currAmount;

    public Container() {
        this.currAmount = 0;
    }

    public int contains() {
        return this.currAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        } else if (this.currAmount + amount >= 100) {
            this.currAmount = 100;
        } else {
            this.currAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        } else if (this.currAmount - amount <= 0) {
            this.currAmount = 0;
        } else {
            this.currAmount -= amount;
        }
    }

    public void move(int amount) {

    }

    public String toString() {
        return this.currAmount + "/100";
    }
}
