package nyc.c4q.shannonalexander_navarro.search;

/**
 * Created by shannonalexander-navarro on 11/13/16.
 */

public class BinarySearch {
    /*
 * Returns either the index of the location in the array,
 * or -1 if the array did not contain the targetValue
 */
    public static int binarySearch(int[] array, int target) {

        int min = 0;
        int max = array.length - 1;


        while (min <= max) {

            int guess = min + (max - min) / 2;
            if (array[guess] == target) {
                return guess;
            } else if (array[guess] < target) {
                min = guess + 1;

            } else if (array[guess] > target) {
                max = guess - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] n = {0, 1, 2, 4, 6, 8, 10};

        System.out.println(binarySearch(n,4));
    }
}

