import java.util.Scanner;

public class ModifyElement {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("values are: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("enter the element you want to modify: ");
        int x = sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println("enter the new value:");
                a[i] = sc.nextInt();
                break;
            }
            
        }
        System.out.println("updated:");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]);
            }
    }
}
