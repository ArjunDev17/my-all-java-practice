package com.basic.apr19;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int missingNum = sum;
        
        for (int i = 0; i < arr.length; i++) {
            missingNum -= arr[i];
        }
        System.out.println("The missing number is: " + missingNum);
    }
}

