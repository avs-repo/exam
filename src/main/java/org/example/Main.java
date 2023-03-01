package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        users.add(new User("Boris", 25));
        users.add(new User("Andrew", 120));
        users.add(new User("Boris", 28));
        users.add(new User("John", 90));
        users.add(new User("Ruslan", 15));
        users.add(new User("Andrew", 30));

        System.out.println(sortByAgeAndName(users));
        System.out.println(getOldest(users));
    }

    public static List<User> sortByAge(Set<User> inputSet) {
        return inputSet.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static List<User> sortByAgeAndName(Set<User> inputSet) {
        List<User> result = sortByAge(inputSet);
        return result.stream().sorted(Comparator.comparing(User::getName)).toList();
    }

    public static User getOldest(Set<User> inputSet) {
        List<User> result = sortByAge(inputSet);
        return result.get(result.size() - 1);
    }
}