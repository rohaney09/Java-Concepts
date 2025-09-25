import java.util.Scanner;

public class leftRotateByDplace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int D;

        System.out.println("Enter the D place for rotation: ");
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        D = D % n; 
        int[] temp = new int[D];

        for (int i = 0; i < D; i++) {
            temp[i] = arr[i];
        }

        for (int i = D; i < n; i++) {
            arr[i - D] = arr[i];
        }

        for (int i = 0; i < D; i++) {
           arr[n - D + i] = temp[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // for(int i=D-1;i>0;i--)
        // {
        //     arr[i-D-1]=arr[i];
        // }
        // for(int i=D ;i<n;i++)
        // {
        //     arr[i-D]=arr[i];
        // }
        // for(int i=n;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // } 
    }
}

