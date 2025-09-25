import java.util.Scanner;

class Binary_search {
    public static void main(String[] args) {
        int search, mid, start, end;
        Scanner sc = new Scanner(System.in);
        
        // Input the element to search
        System.out.print("Enter the search element: ");
        search = sc.nextInt();
        
        // Sorted array for binary search
        int[] a = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = a.length;

        start = 0;
        end = n - 1;

        // Binary search logic
        boolean found = false;
        while (start <= end) {
            mid = (start + end) / 2;

            if (a[mid] == search) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if (search < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
