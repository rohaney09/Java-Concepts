import java.util.Scanner;

public class reverseArray {
     public static void main(String[] args) {
        int n,i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the limit:");
        // n = sc.nextInt();
        // int a[] = new int[n];
        // for(i=0;i<n;i++)
        // {
        //     a[i]= sc.nextInt();
        // }
        int a[] = {1,2,3,4,5};
        n = a.length;
        System.out.println("Original values are: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse values are: ");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
