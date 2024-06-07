package Week2;

import java.util.Arrays;

public class SortingAlgorithms {
    //bubble sort: sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order
    //selection sort: sorts an array by repeatedly finding the minimum element
    //both are simple sorting algorithms and used on small arrays
    //selection uses less swaps than bubble

    public static void main(String[] args) {
        int [] numbers1 = {15,7,3,5,6,11,8,9};
        int [] numbers2 = {15,7,3,5,6,11,8,9};

        int [] numbers = {6,5,2,8,9,4};


        int temp = 0;
        Arrays.sort(numbers);
        for(int n:numbers){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Before sorting");
        for(int n:numbers1){
            System.out.print(n + " ");
        }
        //Using bubble sort
        for(int i = 0 ;i < numbers1.length; i++){
            for(int j = i+1; j < numbers1.length; j++){

                if(numbers1[j] < numbers1[i]){

                    temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }

                System.out.println();
                for(int n:numbers1){
                    System.out.print(n + " ");
                }


            }
        }
        System.out.println();
        System.out.println("After sorting using buble sort");
        for(int n:numbers1){
            System.out.print(n + " ");
        }
        System.out.println();

        //using selection sort
        int minIndex= -1;
        for(int i = 0 ;i < numbers2.length-1; i++){
            minIndex = i;
            for(int j = i+1; j < numbers2.length; j++){

                if(numbers2[minIndex] > numbers2[j]){
                    minIndex = j;
                }
            }

            temp = numbers2[minIndex];
            numbers2[minIndex] = numbers2[i];
            numbers2[i] = temp;

            System.out.println();
            for(int n:numbers2){
                System.out.print(n + " ");
            }
        }
        System.out.println();

        System.out.println("After sorting using selection sort");
        for(int n:numbers2){
            System.out.print(n + " ");
        }

    }
}
