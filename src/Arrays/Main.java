package Arrays;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Arrayss  arr= new Arrayss();
        int []numbers={10,2,9,4,5,6,7,8,7,1};
        Arrays.sort(numbers);
        arr.Traversal(numbers);
        //int result= arr.LinearSearch(numbers,2);
        int result= arr.binarySearch(numbers,10,0,numbers.length-1);
        if(result!=-1)
            System.out.println( "Value found at index:"+result);
        else
            System.out.println( "Value not found");







    }
}