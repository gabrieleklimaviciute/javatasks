import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < gifts.size(); i++) {
            totalWeight += gifts.get(i).getWeight();
        }
        return totalWeight;
    }
}
