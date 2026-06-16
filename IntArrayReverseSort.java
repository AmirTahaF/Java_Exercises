import java.util.Random;
import java.util.Arrays;

public class IntArrayReverseSort {
//    creat an app to sort an int array in reverse order (large to small)
//    the app should creat a random array itself
//    using bubble sort.

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArr = reverseSortedArray(unsortedArray);
        System.out.println(Arrays.toString(sortedArr));

    }

    public static int[] getRandomArray (int len){
        Random random = new Random();
        int[] randomArray = new int[len];

        for (int i = 0 ; i < len ; i++){
//            array includes number from 0 to 100
            randomArray[i] = random.nextInt(101);
        }

        return randomArray;
    }

    public static int[] reverseSortedArray(int[] unsorted){
        int[] sortedArray = Arrays.copyOf(unsorted , unsorted.length);
        boolean flag;

        do{
//           tracks whether any swap happened this pass
            flag = false;

            for (int i = 0 ; i < (sortedArray.length) - 1  ; i++ ){
                if (sortedArray[i] < sortedArray[i+1]){

                    int temp = sortedArray[i]; // to store first value
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
//                    continue the loop
                    flag = true;
                }

            }
        }while (flag);
        return sortedArray;
    }
}
