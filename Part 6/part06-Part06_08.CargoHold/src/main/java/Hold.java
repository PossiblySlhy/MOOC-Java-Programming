import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holding;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holding = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.totalWeight() + suitcase.totalWeight()) > this.maxWeight) {
            return;
        }

        this.holding.add(suitcase);
    }

    public int totalWeight() {
        int weight = 0;

        for (Suitcase suitcase : this.holding) {
            weight += suitcase.totalWeight();
        }

        return weight;
    }

    public String toString() {
        if (this.holding.size() == 0) {
            return "no suitcases (0 kg)";
        } else if (this.holding.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        } else {
            return this.holding.size() + " suitcases (" + this.totalWeight() + "kg)";
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.holding) {
            suitcase.printItems();
        }
    }
}
