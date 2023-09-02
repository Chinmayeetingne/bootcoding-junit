package com.bootcoding.junit.array;

public class ArraySum {
    public int getSum(int number[]){
        int sum =0;
        for (int n:number){
            sum +=n;
        }
        return sum;
    }

    //Get maximum element from given array
    public int getMaximumElement(int number[]){
        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        return max;
    }

    public int[] getEvenArray(int[] nums){
        int evenCount = 0;
        for(int n : nums){
            if(n % 2 == 0){
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int i=0;
        for(int n : nums){
            if(n % 2 ==0){
                evenArray[i++] = n;
            }
        }
        return evenArray;
    }

}
