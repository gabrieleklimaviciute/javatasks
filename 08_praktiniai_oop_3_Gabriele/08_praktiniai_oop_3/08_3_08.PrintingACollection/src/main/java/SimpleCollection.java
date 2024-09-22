
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;


    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {

        this.elements.add(element);
    }

    public ArrayList<String> getElements() {

        return this.elements;
    }

    @Override
    public String toString() {
        int count = elements.size();
        if (count == 0) {
            return "The collection " + name + " is empty.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(name).append(" contains ").append(count).append(" elements:\n");
        for (int i = 0; i < count; i++) {
            sb.append(elements.get(i)).append("\n");
        }
        return sb.toString();
    }

}
