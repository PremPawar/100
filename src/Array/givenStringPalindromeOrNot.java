package Array;

public class givenStringPalindromeOrNot {
    public boolean isPalindrome(String word){
        char[] array = word.toCharArray();
        int start=0;
        int end = array.length -1;
        while(start < end){
            if(array[start] != array[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args){
        givenStringPalindromeOrNot pl = new givenStringPalindromeOrNot();
        if(pl.isPalindrome("madaM")){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}
