package Demo;

public class MyBubble {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        int length = arr.length;
        for (int j = 0; j <arr.length-1; j++) {
            for (int i = 0; i < length-1-i; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
