import java.util.*;
public class Sorte 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            // cheack if the array is sorted 
            if(a[i] != i + 1)
            {
                System.out.println("array is not sorted");
                return;
            }
        }
}
}
