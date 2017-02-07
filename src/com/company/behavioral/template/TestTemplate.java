package com.company.behavioral.template;

import java.util.LinkedList;

public class TestTemplate {

    private static LinkedList<int[]> permutations = new LinkedList<>();

    public static void main(String args[]) {

        Hoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        Hoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();
    }

    private void getPermutations() {

        int size = 12;

        long start = System.currentTimeMillis();

        permuteHelper(getArray(size), 0);

        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println("Total permutations: " + permutations.size() + " in an array of size " + size + " in " + (time) / 1000 + " seconds");
    }

    private static int[] getArray(int target) {

        int[] tempArray = new int[target];

        for (int i = 0; i < target; i++) {

            tempArray[i] = i + 1;
        }

        return tempArray;
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {

        int tempValue = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = tempValue;
    }

    private static void permuteHelper(int[] arr, int index) {

        if (index == arr.length - 1) { //If we are at the last element - nothing left to permute

            //printPermutation(arr);

            permutations.add(arr);

            return;
        }

        for (int i = index; i < arr.length; i++) { //For each index in the sub array arr[index...end]

            swap(arr, index, i);

            permuteHelper(arr, index + 1);

            swap(arr, index, i);
        }
    }

    private static void printPermutation(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1]);
        }

        System.out.println("]");
    }
}
