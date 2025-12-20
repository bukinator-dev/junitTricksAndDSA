package leetCodeSolutionsTests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class containsDuplicate {
    @Test
    void testSlution(){
        int [] myArr = new int []{1,2,3,4,1};
        assert containsDuplicate(myArr)==false;
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        var uniuqSet =returnUniqueOnly(nums);
        System.out.println(uniuqSet.stream().toList());
    }
    public boolean containsDuplicate(int[] nums) {
        Set checkDuplicate = new HashSet();
        for(int i: nums){
            var isUnique = checkDuplicate.add(i);
            if(!isUnique){
                return isUnique;
            }
        }
        return true;
    }

    public Set returnUniqueOnly(int[] nums){
        return  new HashSet<>(Arrays.asList(nums));
    }
}
