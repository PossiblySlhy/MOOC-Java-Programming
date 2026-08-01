import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> contents;

    public Package() {
        this.contents = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        contents.add(gift);
    }

    public int totalWeight() {
        int weight = 0;

        for (Gift gift : contents) {
            weight += gift.getWeight();
        }

        return weight;
    }
}
