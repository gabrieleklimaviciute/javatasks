package lt.vtmc.praktiniai.users;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

         return (int) users.stream().filter(u -> u.getAge() > 25).count();
//        int count = 0;
//
//        for (User user : users) {
//            if (user.getAge() > 25) {
//                count++;
//            }
//        }

    }

    public static double getAverageAge(List<User> users) {

       return (long)users.stream().mapToInt(User::getAge).average().orElse(0);
//        int sum = 0;
//        for (User user : users) {
//            sum += user.getAge();
//            double average = (double) sum / users.size();
//            return average;
//        }
//        return sum;
    }

    public static Integer getMinAge(List<User> users) {

        return users.stream().map(User::getAge).min(Integer::compare).orElse(null);
        }
//        int min = users.get(0).getAge();
//        for (int i = 1; i < users.size(); i++) {
//            if (users.get(i).getAge() < min) {
//                min = users.get(i).getAge();
//            }
//        }
//        return min;
    }

    public static int findByName(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null).getAge();
//        for (User user : users) {
//            if (user.getName().equalsIgnoreCase(name)) {
//                return user;
//            }
//        }
//        return null;
//    }

    public static List<User> sortByAge(List<User> users) {

        Collections.sort(users, new AgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparingInt(User::getAge)).orElse(null).getAge();
//        Collections.sort(users, new OldestAgeComparator());
//         return users.get(users.size() -1 );

    }

    public static int sumAge(List<User> users) {
            return (int) users.stream().mapToInt(User::getAge).sum();
//        int sum = 0;
//        for(User user : users){
//            sum += user.getAge();
//        }
//        return sum;
    }

}
