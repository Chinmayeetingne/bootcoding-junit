package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
     public void test(){
         ArraySum arraySum = new ArraySum();
         int[] nums = {1,2,3,4,5};
         int actualSum = arraySum.getSum(nums);
         int expectedSum = 15;
         assertEquals(expectedSum,actualSum);

     }

     @Test
     public void test2(){
         ArraySum arraySum = new ArraySum();
         int[] nums = {1,2,3,4,5};
         int actualMax = arraySum.getMaximumElement(nums);
         int expectedMax = 5;
         assertEquals(expectedMax,actualMax);
    }

//    @Test
//    public void testArrayWithEquals(){
//        ArraySum arraySum = new ArraySum();
//        int[] inputArray = {1,2,3,4,5};
//        int[] outputArray= arraySum.getEvenArray(inputArray);
//        int expectedArray = [2,4];
//        assertEquals(expectedArray,inputArray);
//    }

}