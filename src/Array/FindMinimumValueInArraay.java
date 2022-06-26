package Array;

public class FindMinimumValueInArraay {

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int findMinimum(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException();
        }

        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        FindMinimumValueInArraay array = new FindMinimumValueInArraay();
        int[] numbers = {10, 12, 13, 14, 5, 6, 5, 8, 9};

        System.out.println("minimum value is: " + array.findMinimum(numbers));

    }
}
