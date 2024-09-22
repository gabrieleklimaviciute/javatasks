
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {

        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {

        if (meals.isEmpty()) {
            meals.clear();
        } else {
            for (int i = 0; i < meals.size(); i++) {
                System.out.print(meals.get(i));
                if (i < meals.size() - 1) {
                    System.out.print(", \n");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

    public void clearMenu() {
        meals.clear();
    }


}

