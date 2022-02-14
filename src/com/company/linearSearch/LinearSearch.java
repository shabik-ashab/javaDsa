package com.company.linearSearch;

public class LinearSearch {
    //search the given number from an array and return index
    //we will use linear search to solve the q
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 8;
        System.out.println(LinearSearch1(nums,target));
    }

    //function for linear search
    // it will take an array and target elemnt to find and return the index where the element is
    static int LinearSearch1(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        //running a for loop and checking if the target is matching with element
        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}