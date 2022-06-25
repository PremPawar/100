package Array;

public class ReverseOneDimentionalArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int array[], int start, int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(numbers);

        reverseArray(numbers, 0, numbers.length -1 );
        printArray(numbers);




    }
}
