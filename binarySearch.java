import java.util.*;
import java.util.Arrays;
class binarySearch{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements in an array ");
        int n = scan.nextInt();
        System.out.println("Enter the array elements");
        int a []= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("the array elements are :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter element to search");
        int e = scan.nextInt();
        int lb = 0;
        int ub=n-1;
        int mid= (lb+ub)/2;
        while(lb<ub)
        {
            if(a[mid]<e)
            {
                lb=mid+1;
            }
            else if(a[mid] == e)
            {
                System.out.print("element found at"+ (mid +1)+ " position");
                break;
            }
            else{
                ub=mid-1;
            }
            mid=(lb+ub)/2;
        }
        if(lb>ub)
        {
            System.out.print("element not  found ");
        }


    }
}