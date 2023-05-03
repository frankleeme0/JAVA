package Demo;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr={3,2,4,6,7};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 ={1,22,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.binarySearch(arr1, 10));
        //-插入点-1


    }
}
