import java.util.*;

class linearSearch{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element to be searched");
        int e = scan.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Searching the element");
        for(int i=0;i<n;i++)
        {
            if(a[i]==e)
            {
                System.out.print("Element "+ e + "is found at "+i+" position");
                break;
            }
        }
    }
}