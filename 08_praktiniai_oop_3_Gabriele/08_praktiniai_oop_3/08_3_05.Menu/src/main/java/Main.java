import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
          Menu exactum = new Menu();

        // When you have completed the method addMeal(String meal)
        // You can delete the comments below
        

        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinaigrette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        
        // When you have completed the method printMeals()


        exactum.printMeals();


        
//         When you have completed the method clearMenu()
//        meals.clear();
//         you can remove the comments below
        exactum.clearMenu();
        exactum.printMeals();
    }
}
