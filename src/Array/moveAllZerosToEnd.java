package Array;

public class moveAllZerosToEnd {
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void moveZeros(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }


    public static void main(String[] args) {
        moveAllZerosToEnd array = new moveAllZerosToEnd();
        int[] numbers = {10, 0, 13, 14, 0, 0, 5, 8, 9};
        array.printArray(numbers);
        array.moveZeros(numbers);
        array.printArray(numbers);


    }
}
