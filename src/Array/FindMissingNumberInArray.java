package Array;

public class FindMissingNumberInArray {
    public void array(){
        int[] arr = {1, 2, 4, 5, 3, 7, 8};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int n = arr.length +1;
        int sum = n*(n+1)/2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args){
        FindMissingNumberInArray fn = new FindMissingNumberInArray();
        fn.array();
    }
}
