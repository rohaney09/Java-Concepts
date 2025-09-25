import java.util.Scanner;

public class MaxElement {
     public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit:");
        n = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("values are: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Maximum value: ");
        int maxFirst, maxSecond, maxThird ;
            maxFirst = a[0];
            maxSecond = -1;
            maxThird = -1;
        for(i=0;i<n;i++)
        {
            if(a[i]>maxFirst)
            {
                maxThird = maxSecond ;
                maxSecond = maxFirst;
                maxFirst=a[i];
            }
            else if (a[i]!=maxFirst && a[i]>maxSecond)
            {
                maxSecond = a[i];
            }
            else if (a[i]!=maxFirst && a[i]!=maxSecond && a[i]>maxThird)
            {
                maxThird = a[i];
            }
        }  
        System.out.println("maxFirst"+maxFirst);
         
        if (maxSecond == Integer.MAX_VALUE)
        {
            System.out.println("There is no Second maximum value ");
        }
        else{
            System.out.println("maxSecond"+maxSecond);
        }
        if (maxThird == Integer.MAX_VALUE)
        {
            System.out.println("There is no Third maximum value ");
        }
        else{
            System.out.println("maxSecond"+maxThird);
        }
        
        
    }
}

