package variables;

import java.util.Arrays;

public class ArrayType {

    public static void main(String[] args){

        int[] numbersArray = {1, 212, 22, 41, 829, 23};
        String[] cars = {"BMW", "Chevrolet", "Vitz", "Axio"};

        System.out.println(numbersArray.length);
        System.out.println(numbersArray[0]);

        System.out.println(cars[1]);
        cars[1] = "Maxda";

        //printing an array
        System.out.println(Arrays.toString(cars));


        //looping through an array
        for(String car: cars){
            System.out.println(car);
        }

        for(int i= 0; i < cars.length ; i++){
            System.out.println(cars[i]);
        }
    }
    
}
