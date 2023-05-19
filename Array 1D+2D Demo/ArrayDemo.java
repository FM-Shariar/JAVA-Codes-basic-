import java.lang.*;
import java.util.Scanner;
public class ArrayDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //1st approach
        int arr1[] = new int[2];
       
        arr1[0] = 10;
        arr1[1] = 20;
        /*for(int i = 0; i<arr1.length; i++)
        {
            System.out.print("Enter element for arr1["+i+"]: ");
            arr1[i]=sc.nextInt();
        }*/
        for(int i = 0; i<arr1.length; i++)
        {
            System.out.println("arr1["+i+"]: "+arr1[i]);
        }
       
        //2nd approach
        int arr2[];
        int size = arr1[1]/arr1[0];
        arr2=new int[size];
        arr2[0] = 30;
        arr2[1] = 40;
        int j = 0;
        while(j<arr2.length)
        {
            System.out.println("arr2["+j+"]: "+arr2[j]);
            j++;
        }
       
        //3rd approach
        int arr3[] = new int[]{50, 60};
        int k = 0;
        do{
            System.out.println("arr3["+k+"]: "+arr3[k]);
            k++;
        }while(k<arr3.length);
       
        //4th approach
        int []arr4 = {70, 80};
        for(int i = 0; i<arr4.length; i++)
        {
            System.out.println("arr4["+i+"]: "+arr4[i]);
        }
       
        //2d array
        int arr5[][] = new int[][]{{100, 200}, {300, 400}};
        for(int i=0; i<arr5.length; i++)
        {
            for(int m=0; m<2; m++)
            {
                System.out.println("arr5["+i+"]["+m+"]: "+arr5[i][m]);
            }
        }
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        for(int i=0; i<2; i++)
        {
            for(int m=0; m<2; m++)
            {
                if(arr5[i][m] == target)
                {
                   
                    System.out.println("Found");
                    break;
                }
                else
                {
                    System.out.println("Not found.");
                    break;
                }
            }
        }
       
    }
}