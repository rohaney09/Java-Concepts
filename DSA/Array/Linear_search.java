import java.util.*;
class Linear_search {
    public static void main(String[] args) {
       int search,flag=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the search element: ");
       search= sc.nextInt();
       int a[] = new int[]{10,20,30,40,50};
       for(int i=0;i<a.length-1;i++)
       {
           System.out.println(a[i]);
       }
       for(int i=0;i<a.length-1;i++)
        {
           if(search==a[i])
             {
             System.out.print("Element found at "+i+" index");
             flag=1;
             }
        }
           if(flag==0)
           {
            System.out.print("Element not found in array ");
           }
    }
}