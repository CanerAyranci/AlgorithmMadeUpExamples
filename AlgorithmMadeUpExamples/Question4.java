package AlgorithmMadeUpExamples;

import java.util.Arrays;

public class Question4 {
    
    // Sort a ten element interger array then print greatest and least

    public static void main(String[] args) {
        
        // Declaring array and calling method
        int[] array = { 7, 1, 5, 3, 4, 6, 2, 81, 9, 0};
        sortPrint(array);

    }

    // Declaring method
    public static void sortPrint(int[] array) {

        // Printing unsorted array
        System.out.println(Arrays.toString(array));

        // Declaring a cache varaible to be able to modify position of elements
        int cache;

        // This for loop repeats to process as length of array
        for(int j=0; j<array.length; j++) {

            // This for loop ables us to repeat the process for every element
            for(int i=0; i<array.length - 1; i++) {

                if(array[i] > array[i + 1]) {

                    cache = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = cache;

                }

            }
        
        }

        // Printing sorted array then greatest and least elements
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

    }

}
