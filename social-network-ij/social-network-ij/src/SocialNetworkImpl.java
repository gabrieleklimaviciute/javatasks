
import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SocialNetworkImpl implements SocialNetwork {

    private List<Friend> friends = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
 if (friend == null){
     throw new IllegalArgumentException();

 }
 if (friends.contains(friend)){
     System.out.println("Friend exist");
     return;
 }
        friends.add(friend);
    }

    @Override
    public int getNumberOfFriends() {

        return friends.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {
        if (s == null || s1 ==  null) {
            throw new IllegalArgumentException();
        }

        return friends.stream().filter(friend -> friend.getFirstName()
                .equalsIgnoreCase(s) && friend.getLastName()
                .equalsIgnoreCase(s1)).findFirst().orElseThrow(() -> new FriendNotFoundException(s,s1));
    }

    @Override
    public Collection<Friend> findByCity(String s) {
        if (s == null){
            throw new IllegalArgumentException();
        }
        return friends.stream()
                .filter(friend -> friend.getCity()
                        .equals(s))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        return friends.stream().sorted(Comparator.comparing(Friend::getCity)
                .thenComparing(Friend::getLastName)
                .thenComparing(Friend::getFirstName)).collect(Collectors.toList());
    }
}
