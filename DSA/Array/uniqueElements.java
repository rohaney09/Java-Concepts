public class uniqueElements {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,6};
        int n = arr.length;
        int i,j;
        i=0;
        System.out.print("unique values are "+ arr[0]+" ");
        for(j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
                System.out.print(arr[i]+" ");
            } 
        }
        System.out.print("size is "+(i+1));
    } 
}
