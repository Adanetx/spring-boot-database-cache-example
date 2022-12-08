package com.javadeveloperzone.another;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(12, 45, 89, 90, 56, 1, 7, 78, 3);
        List<Integer> list1 = List.of(12, 90, 51, 5151, 61, 615);

        List<Integer> result =   list.stream().sorted().collect(Collectors.toList());

        System.out.println("the sorted result is "+result);
        Collections.reverse(result);
        System.out.println("after reverse "+result);

        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();

        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();

        System.out.println("the minimum is "+min+" and the maximum is "+max);

        double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("the average is "+average);

      int multiResult =  list.stream().reduce(1, (x, y) -> (x * y));
        System.out.println("the multi "+multiResult);
    }
    public static long countChar(String string, char c){
        List<Character> list = new ArrayList<>();
        char[] chars = string.toCharArray();

        for(Character character: chars){
            list.add(character);
        }
      long count =  list.stream().filter(ct -> ct == c).count();
        return count;
    }

}
