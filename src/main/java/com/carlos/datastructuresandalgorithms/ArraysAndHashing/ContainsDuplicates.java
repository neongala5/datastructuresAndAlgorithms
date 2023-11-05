package com.carlos.datastructuresandalgorithms.ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicateTester = new HashSet<Integer>();
        for(int num : nums) {
            if(!duplicateTester.add(num)){
                return true;
            }
        }
        return false;
    }
}