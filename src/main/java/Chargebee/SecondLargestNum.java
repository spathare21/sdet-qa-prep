package Chargebee;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {

        // find Largest number in array

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Please enter size of array : ");

            int arrsize = s.nextInt();

            int arr[] = new int[arrsize];

            System.out.println("Please enter numbers ");

            for(int i =0; i < arrsize ; i++){
                arr[i] = s.nextInt();
            }

            getSecondLargest(arr,arr.length);

        }


        public static void getSecondLargest(int arr[], int arr_size){

            int i, first, second;

            if (arr_size < 2)
            {
                System.out.printf(" Invalid Input ");
                return;
            }

            // Sort the array
            Arrays.sort(arr);

            for (i = arr_size - 2; i >= 0; i--)
            {
                // If the element is not
                // equal to largest element
                if (arr[i] != arr[arr_size - 1])
                {
                    System.out.printf("The second largest " +
                            "element is %d\n", arr[i]);
                    return;
                }
            }

            System.out.printf("There is no second " +
                    "largest element\n");

        }

}



