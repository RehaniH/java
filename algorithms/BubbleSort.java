package algorithms;

public class BubbleSort{

    public void sort(int[] array){

        boolean isSorted;
        for(int i = 0; i < array.length; i++){
            isSorted = true;
            for (int j = 1; j < array.length - i; j++){
                if(array[j-1] > array [j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isSorted = false;
                }
            }
            //no need to go through all the passes if the array is already sorted
            if(isSorted)
                return;
            
        }
    }
}