import java.util.*;
class Insertion {
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
            System.out.println(a[i]);
        }
        System.out.print("enter the value to be insert: ");
        int v = sc.nextInt();
        System.out.print("enter the index no to be inserted: ");
        int m = sc.nextInt();
        int b[] = new int[n+1];
        for(i=0;i<n+1;i++)
        {
            if(i<m)
            {
                b[i]= a[i];
            }
            else if (i==m)
            {
                b[i]= v;
            }
            else
            {
                b[i] = a[i-1];
            }
        }
        System.out.println("after inserting");
        for(i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }
    }

}
