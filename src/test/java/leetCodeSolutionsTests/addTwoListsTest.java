package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class addTwoListsTest {
    @Test
    void SumTask(){
        // List 1: 2 -> 4 -> 3 (represents the number 342)
        // List 2: 5 -> 6 -> 4 (represents the number 465)
        // The sum of these two numbers is 342 + 465 = 807.
        // The resulting linked list should be: 7 -> 0 -> 8 (represents the number 807).
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAll(List.of(3,4,2));
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(List.of(4,6,5));

        var result = addTwoNumbersFromList(list1, list2);
        LinkedList<Integer> finalLinkedList = new LinkedList<>();
        result.chars().forEach(c -> finalLinkedList.add(Character.getNumericValue(c)));
        System.out.println("Result: " + result);
    }

    // Function to add two numbers represented by linked lists
    private String addTwoNumbersFromList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        StringBuilder strBuilder = new StringBuilder();
        list1.reversed().forEach(strBuilder::append);
        var revertedNumOne = Integer.parseInt(strBuilder.toString());

        StringBuilder strBuilderTwo = new StringBuilder();
        list2.reversed().forEach(strBuilderTwo::append);
        var revertedNumTwo = Integer.parseInt(strBuilder.toString());

        var result = revertedNumOne + revertedNumTwo;
        System.out.println("interim result"+ result);

        String numToStringWithReverse = new StringBuilder(String.valueOf(result)).reverse().toString();

        return numToStringWithReverse;
    }
}
