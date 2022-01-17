package algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        
        int[] array = {7, 1, 20, 23, 5, 3, 2, 4, 2};
        System.out.println(Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

        int[] array_2 = {7, 1, 20, 23, 5, 3, 2, 4, 2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array_2);

        System.out.println(Arrays.toString(array_2));
    }
    
}
