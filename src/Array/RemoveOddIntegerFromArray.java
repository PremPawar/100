package Array;

public class RemoveOddIntegerFromArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int[] removeOdd(int[] arr){
        int evenCount=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        int[] result = new int[evenCount];
        int idx =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveOddIntegerFromArray array = new RemoveOddIntegerFromArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        array.printArray(arr);

        int[] result = array.removeOdd(arr);
        array.printArray(result);
    }
}
