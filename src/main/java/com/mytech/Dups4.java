package com.mytech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dups4 {
    public static void main(String[] args) {
        String[] a = {"pear", "melon", "cabbage", "onion", "cabbage", "melon", "lettuce", "asparagus", "cabbage",
            "cucumber", "pear", "lemon", "orange", "potato", "carrot"};
        new Dups4()
            .findTheLongestLineOfUnrepeatedWords(a);

    }

    public String[] findTheLongestLineOfUnrepeatedWords(String... input) {
        // apple, apple
        System.out.println("input: " + Arrays.toString(input));
        System.out.println("length: " + input.length);
        Map<String, Integer> wordToPositions = new HashMap<>();
        int finalBeginPoint = 0;
        int currentBeginPoint = 0;
        int maxLength = 0;
        for (int i = 0; i < input.length; i++) {
            if (wordToPositions.containsKey(input[i])
                && wordToPositions.get(input[i]) >= currentBeginPoint) {
                int length = i - currentBeginPoint;
                if (length > maxLength) {
                    maxLength = length;
                    finalBeginPoint = currentBeginPoint;
                    System.out.println(finalBeginPoint + " : " + maxLength);
                }
                // we met a next duplicate, this would be an end position (exclusive)
                currentBeginPoint = wordToPositions.get(input[i]) + 1;
            }
            wordToPositions.put(input[i], i);
        }

        int length = input.length - currentBeginPoint;
        if (length > maxLength) {
            maxLength = length;
            finalBeginPoint = currentBeginPoint;
            System.out.println(finalBeginPoint + " : " + maxLength);
        }

        System.out.println(finalBeginPoint + " : " + maxLength);

        ArrayList<String> notDuplicatedString = Arrays.stream(input).skip(finalBeginPoint).limit(maxLength)
            .collect(Collectors.toCollection(ArrayList::new));


        System.out.println(notDuplicatedString.stream().collect(Collectors.joining(", ")));

        return notDuplicatedString.toArray(new String[notDuplicatedString.size()]);
    }
}
