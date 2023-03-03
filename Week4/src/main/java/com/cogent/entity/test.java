package com.cogent.entity;

import java.util.*;


import org.apache.tomcat.jakartaee.commons.lang3.ArrayUtils;

public class test {
    private static void check(int[] arr, int toCheckValue)
    {

        int id =-1;
        for (int i =0;i<arr.length;i++) {
            if (arr[i] == toCheckValue) {
                id = i;
                break;
            }
        }
        if(id==-1) {
        	System.out.println(toCheckValue+ "not present in the array.");
        }
        else
        	System.out.println("Is " + toCheckValue+ " present in the array: " +id);
    }
 
    public static void main(String[] args)
    {
 
        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
        int toCheckValue = 7;
        System.out.println("Array: "
                           + Arrays.toString(arr));
        check(arr, toCheckValue);
        findLargest(arr);
        Arrays.sort(arr);
        System.out.println("Sorted Array: "
                + Arrays.toString(arr));
        
        Integer[] numbers = { 5, 1, 1, 9, 7, 2, 6, 10 };
        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2-num1;
            }
        });
        
        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
        // Using a custom comparator to sort in ascending order
        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num1 - num2;
            }
        });
        
        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
        Integer[] newArr = set.toArray(new Integer[0]);
        
        System.out.println(Arrays.toString(newArr));
        Integer[] numbers2 = { 1, 2, 5, 6, 7, 9, 10 };
        List<Integer> both = new ArrayList<Integer>(numbers.length + numbers2.length);
        Collections.addAll(both, numbers);
        Collections.addAll(both, numbers2);
        Integer[] numbers3 = both.toArray(new Integer[both.size()]);
        for(Integer integer:numbers3) {
            System.out.print(integer);
        }
//        8WAP to Check if Two Arrays Are Equal or Not
        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(numbers, numbers2));
        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(numbers2, numbers2));
//        9WAP to Remove All Occurrences of an Element in an Array
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                result[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(result, j)));
        
//        10WAP to Find Common Array Elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
 
        // Adding elements from array1
        for (int i : numbers) {
            set1.add(i);
        }
 
        // Adding elements from array2
        for (int i : numbers2) {
            set2.add(i);
        }
 
        // use retainAll() method to
        // find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
//        11WAP to Copy All the Elements of One Array to Another Array
        System.out.println(Arrays.toString(Arrays.copyOf(arr,arr.length)));
//        12WAP For Array Rotation
        rotate(arr, 2);
        System.out.println("Sorted Array: "
                + Arrays.toString(arr));
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0]; // assume the first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update largest if a larger element is found
            }
        }
        System.out.println("Largest: "+ largest);
        return largest;
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
        
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }



}
