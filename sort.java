import java.util.Scanner;
import java.util.Arrays;
public class sort
{
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int temp=0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){   
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]);
            }
            int k[]= new int[n];
            for(int j=0;j<n;j++)
            {
                k[j]=scan.nextInt();
            }
            Arrays.sort(k);
            for(int j=0;j<n;j++)
            {
                System.out.println(k[j]);
            }
    }
	}

