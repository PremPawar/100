package Array;

public class printOneDimentionalArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printOneDimentionalArray array = new printOneDimentionalArray();
        array.printArray(new int[] {1,4,6,8,5});
    }
}
