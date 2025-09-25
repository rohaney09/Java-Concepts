package Stack;
public class insertElement {
    int i;
    int n=10;
    int top=-1;
    int stack[] = new int[n];

    void push()
    {
        if(top==n-1)
        {
            System.out.println("Stack is overfow");
        }
        else{
            System.out.println("Enter value: ");
            i = sc.nextInt();
            top++;
            stack[top]=i;
            
        }
    }


    public static void main(String[] args) {
        // int n,i,top=-1;
        // System.out.println("Enter the size");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // System.out.println("Enter the size");
        // int stack[] = new int[n];
        // if(top==-1)
        // {
        //     System.out.println("Stack is empty");
        // }
        // if(top==n-1)
        // {
        //     System.out.println("Stack is full");
        // }
        // for(i=0;i<n;i++)
        // {
        //     System.out.println("Enter the element");
        //     stack[i]= sc.nextInt();
        //     top++;
        // }
        // for(i=0;i<n;i++)
        // {
        //     System.out.println("Element at position "+(i+1)+" is "+stack[i]);
        // }

    }
}
