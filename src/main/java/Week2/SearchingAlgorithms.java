package Week2;

import java.util.Arrays;

public class SearchingAlgorithms {

    public static void main(String[] args) {

        //linear search: transverse the given array and find the the target element
        //binary search: repeatedly dividing the search interval in half of the sorted array
        //binary has less time complexity than linear;

        int [] numbers = new int[1000];
        //int [] numbers = {3,5,6,7,9,11,13,15};
        //int [] numbers1 = {15,5,3,7,6,11,8,9};
        int target = 900;

        int linear = linearSearch(numbers,target);

        System.out.println("Linear Search");

        if (linear != -1){
            System.out.println("Element found at index: " + linear);
        } else {
            System.out.println("Element not found");
        }
        int binary = binarySearche(numbers,target);

        System.out.println("Binary Search");

        if (linear != -1){
            System.out.println("Element found at index: " + binary);
        } else {
            System.out.println("Element not found");
        }
        System.out.println(Arrays.binarySearch(numbers,target));
    }

    private static int binarySearche(int[] numbers, int target) {
        int stepsTaken = 0;
       int lowLeft = 0;
       int highRight = numbers.length-1;

       while(lowLeft<=highRight){
           stepsTaken++;

           int mid = (lowLeft+highRight)/2;

           if(numbers[mid] == target){
               System.out.println("Steps taken by binary search: " + stepsTaken);
               return mid;
           } else if (numbers[mid] < target) {
               lowLeft = mid + 1;

           }else{
               highRight =  mid -1;
           }
       }
        System.out.println("Steps taken by binary search: " + stepsTaken);
        return -1;
    }

    private static int linearSearch(int[] numbers1, int target) {

        int stepsTaken = 0;

        for(int i= 0;i<numbers1.length;i++){

            stepsTaken++;
            if (numbers1[i]==target){
                System.out.println("Steps taken by linear search: " + stepsTaken);
                return i;
            }
        }
        System.out.println("Steps taken by linear search: " + stepsTaken);
        return -1;
    }

}
