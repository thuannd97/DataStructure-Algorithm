package com.thuannd.array;

public class Main {

    public static void main(String[] args) {

    }

    // 485: Max Consecutive Ones
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count ++;
                max = Math.max(count, max);
            }
        }
        return max;
    }

    // 1295: Find Numbers with Even Number of Digits
    public static int findNumbers(int[] nums) {
        if(nums.length == 0) return 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(countDigit(nums[i]) % 2 == 0){
                res ++;
            }
        }
        return res;
    }
    public static int countDigit(int a){
        int numberOfDigit = 0;
        if(a == 0) return 1;
        while(a != 0){
            a = a / 10;
            numberOfDigit ++;
        }
        return numberOfDigit;
    }

    // 1089: Duplicate Zeros
    public static void duplicateZeros(int[] arr) {

    }
}
