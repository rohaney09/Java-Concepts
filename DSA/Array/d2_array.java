import java.util.*;
class d2_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row:");
        int r = sc.nextInt();
        System.out.println("enter the cols:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              a[i][j]= sc.nextInt();
            }
        }
        System.out.println("values are: ");
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}