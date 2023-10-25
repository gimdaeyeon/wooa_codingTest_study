package onboarding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem7 {
    public static Map<String,Integer> scoreMap = new TreeMap<>();
    public static List<String> friendList = new ArrayList<>();
    public static final int DEFAULT_SCORE = 0;

//     friends를 순회하면서, user와 친구 관계가 아니면서,
//    위에서 생성한 친구 리스트에 포함되는 사람들 (즉, user의 친구의 친구)을 찾는다.
//    이렇게 찾아진 친구의 친구들에 대해 점수 Map에서 10점을 더한다.
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        makeUsersFriendList(user,friends);
        removeFriendFromMap();

        calculateMutualFriendScore(user,friends);
        calculateVisitPoints(visitors);

//        만들어진 scoreMap을 점수에 따라 정렬 후 key의 List로 반환하기
        List<String> recommendList  = sortMapByScore(scoreMap);


        return recommendList;
    }

    public static void makeUsersFriendList(String user, List<List<String>> friends ){

        for(List<String> list: friends){
            isUsersFriend(list,user);
        }

    }

    public static void isUsersFriend(List<String> relation, String user){
        if(relation.contains(user)){
            friendList.add(relation.get(1-relation.indexOf(user)));
            return;
        }
        addScoreMap(relation);
    }

    public static void addScoreMap(List<String> list){
        for(String user:list){
            scoreMap.put(user,DEFAULT_SCORE);
        }
    }

    public static void calculateMutualFriendScore( String user, List<List<String>> friends){
        for(String friend: friendList){
            roopFriendList(user, friend, friends);

        }
    }

    public static void removeFriendFromMap(){
        for (String friend:friendList) {
            scoreMap.remove(friend);

        }
    }

    public static void roopFriendList(String user, String friend,List<List<String>> friends ){
        for(List<String> list:friends){
            isFriendOfFriend(user, friend, list);
        }
    }

    public static void isFriendOfFriend(String user, String friend, List<String> list ){
        if(list.contains(user)){
            return;
        }
        if(list.contains(friend)){
            String target = list.get(1-list.indexOf(friend));
            scoreMap.put(target,scoreMap.get(target)+10);
        }
    }

    public static void calculateVisitPoints(List<String> visitors){
        System.out.println(scoreMap);
        for(String target:visitors){
            if(friendList.contains(target)){
                continue;
            }
            if (!scoreMap.containsKey(target)){
                scoreMap.put(target,1);
            }
            scoreMap.put(target,scoreMap.get(target)+1);
        }

    }

    public static List<String> sortMapByScore(Map<String,Integer> map){
        List<String> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        return list.stream().limit(5).collect(Collectors.toList());
    }



}
