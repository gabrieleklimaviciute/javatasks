package lt.vtmc.praktiniai.users;


import java.util.Collections;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

        int count = 0;

        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {

        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
            double average = (double) sum / users.size();
            return average;
        }
        return sum;
    }

    public static Integer getMinAge(List<User> users) {
        int min = users.get(0).getAge();
        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).getAge() < min) {
                min = users.get(i).getAge();
            }
        }
        return min;
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {

        Collections.sort(users, new AgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        Collections.sort(users, new OldestAgeComparator());
         return users.get(users.size() -1 );

    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for(User user : users){
            sum += user.getAge();
        }
        return sum;
    }

}
