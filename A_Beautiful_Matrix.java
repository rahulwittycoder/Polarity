import java.util.*;
import java.io.*;
public class A_Beautiful_Matrix
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[5][5];
        int count=0;
        for(int i=0;i<5;i++) 
        {
            String row[]=br.readLine().split(" ");
            for(int j=0;j<5;j++)
            {
                arr[i][j]=Integer.parseInt(row[j]);
                if(arr[i][j]==1)
                {
                    count+=Math.abs(2-j)+Math.abs(2-i);
                }
            }
        }
        System.out.println(count);
    }
}