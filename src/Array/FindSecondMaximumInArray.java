package Array;

public class FindSecondMaximumInArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        FindSecondMaximumInArray array = new FindSecondMaximumInArray();
        int[] numbers = {10, 12, 13, 14, 5, 6, 5, 8, 9};

        System.out.println("second Maximum value is : " + array.secondMaximum(numbers));

    }
}
