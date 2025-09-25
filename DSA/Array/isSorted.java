import java.util.*;
class isSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i,n;
        n=arr.length-1;
        boolean issort=true;
        for( i=1;i<n;i++)
        {
            if(arr[i]<=arr[i-1])
            {
                issort=false;
            }
        }
        if(issort)
        {   
            System.out.println("The array is sorted");
        }
        else
        {
            System.out.println("The array is not sorted");
        }
    }
}        