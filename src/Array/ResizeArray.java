package Array;

public class ResizeArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }


    public static void main(String args[]){
        ResizeArray ra = new ResizeArray();
//        ra.printArray(new int[] {5,9,4,6,1});
        int[] array = new int[] {5,9,4,6,1};
        ra.printArray(array);

        System.out.println("before : " + array.length);

        array = ra.resize(array, 10);

        System.out.println("after : " + array.length);
    }

}
