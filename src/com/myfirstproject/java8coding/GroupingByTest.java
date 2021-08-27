package com.myfirstproject.java8coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByTest {
    public static void main(String args[]) {
        List<Person> personList = Arrays.asList(
                new Person(101, "shiv", "Gaur City"),
                new Person(102, "shiv", "Gaur City-2"),
                new Person(101, "sh909", "Gaur City-234")
        );
        Map<Integer, Long> integerMap = personList.stream().
                collect(Collectors.groupingBy(person -> person.getId(), Collectors.counting()));
        Map<String, Long> countMap = personList.stream().
                collect(Collectors.groupingBy(person -> person.getName(),Collectors.counting()));
        Map<String, Integer> countNameMap=personList.stream().
                collect(Collectors.groupingBy(person->person.getName(),Collectors.summingInt(Person::getId)));
        System.out.println(integerMap);
        System.out.println(countMap);
        System.out.println(countNameMap);
    }
}
