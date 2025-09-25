import java.util.Scanner;

public class MinElement {
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
        System.out.println("minimum value: ");
        int minFirst, minSecond, minThird ;
            minFirst = a[0];
            minSecond = Integer.MAX_VALUE;
            minThird = Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(a[i]<minFirst)
            {
                minThird = minSecond ;
                minSecond = minFirst;
                minFirst=a[i];
            }
            else if (a[i]!=minFirst && a[i]<minSecond)
            {
                minSecond = a[i];
            }
            else if (a[i]!=minFirst && a[i]!=minSecond && a[i]<minThird)
            {
                minThird = a[i];
            }
        }  
        System.out.println("minFirst"+minFirst);
         
        if (minSecond == Integer.MAX_VALUE)
        {
            System.out.println("There is no Second minimum value ");
        }
        else{
            System.out.println("minSecond"+minSecond);
        }
        if (minThird == Integer.MAX_VALUE)
        {
            System.out.println("There is no Third minimum value ");
        }
        else{
            System.out.println("minSecond"+minThird);
        }
        
        
    }
}
