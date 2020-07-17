import java.util.*;
class bubblesort{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int temp=0;
        boolean flag = false;
        System.out.println("Enter the number of elements");
        int n = scan.nextInt();
        System.out.println("Enter the array elements");
        int a []= new int[n];
        for(int i =0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                  temp=a[j+1];
                  a[j+1]=a[j];
                  a[j]=temp;
                  flag = true;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}