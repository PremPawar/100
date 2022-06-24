package Array;

public class AddOrUpdateOneDimentionalArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 7;
        myArray[3] = 1;
        myArray[4] = 9;
        myArray[2] = 2; //updating previous value of index 2, means 7 will updated by 2
        //myArray[5] = 5; //This index is not there in array. so it will throw indexoutofboundexception
        printArray(myArray);
        System.out.println("length of array is: " + myArray.length);    //this will print length of an array
        System.out.println("Last element of array is: " + myArray[myArray.length -1]);  // this will give the last element of the array

    }

    public static void main(String[] args){
        AddOrUpdateOneDimentionalArray array = new AddOrUpdateOneDimentionalArray();
        array.arrayDemo();
    }
}
