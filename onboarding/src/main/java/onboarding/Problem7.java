package onboarding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem7 {
    public static Map<String,Integer> scoreMap = new HashMap<>();
    public static List<String> friendList = new ArrayList<>();

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        makeUsersFriendList(user,friends);

        return null;
    }

    public static void makeUsersFriendList(String user, List<List<String>> friends ){

        for(List<String> list: friends){
            isUsersFriend(list,user);
        }

    }

    public static void isUsersFriend(List<String> relation, String user){
        if(relation.contains(user)){
            friendList.add(relation.get(1-relation.indexOf(user)));
        }
    }



}
