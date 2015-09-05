package com.mytech;

import org.junit.Test;

import static org.junit.Assert.*;

public class Dups4Test {



    @Test
    public void testEmpty() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {};
        String[] result = {};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepeatingWord() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"apple", "apple", "apple"};
        String[] result = {"apple"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testFindTheLongestLineOfSingleWord() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"apple"};
        String[] result = {"apple"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepetitionPartiallyInsideOtherRepetition() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"pear", "melon", "pear", "melon"};
        String[] result = {"pear", "melon"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepetitionPartiallyInsideOtherRepetition2() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"pear", "melon", "cabbage", "onion", "melon", "lettuce", "cabbage",  "asparagus"};
        String[] result = {"onion", "melon", "lettuce", "cabbage",  "asparagus"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepetitionOutsideOtherRepetition() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"pear", "pear", "melon", "melon"};
        String[] result = {"pear", "melon"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepetitionOutsideOtherRepetition2() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"pear", "melon", "apple", "melon", "cabbage", "onion", "cabbage", "lettuce"};
        String[] result = {"apple", "melon", "cabbage", "onion"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }


    @Test
    public void testRepetitionFullyInsideOtherRepetition() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"melon", "pear", "pear", "melon", "melon"};
        String[] result = {"melon", "pear"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

    @Test
    public void testRepetitionFullyInsideOtherRepetition2() throws Exception {
        Dups4 dups = new Dups4();
        String[] input = {"pear", "melon", "cabbage", "onion", "cabbage", "melon", "lettuce", "asparagus", "cabbage",
            "cucumber"};
        String[] result = {"onion", "cabbage", "melon", "lettuce", "asparagus"};
        assertArrayEquals(result, dups.findTheLongestLineOfUnrepeatedWords(input));
    }

}
