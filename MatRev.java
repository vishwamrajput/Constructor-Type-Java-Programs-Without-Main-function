package SolvedBoardspaper.Constructor;
import java.util.*;
public class MatRev
{
    Scanner in = new Scanner(System.in);
    int arr[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    void fillarray()
    {
        int i,j;
        System.out.println("Enter the number of rows");
        m =in.nextInt();
        System.out.println("Enter the number of columns");
        n=in.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
    }
    void revMat(MatRev P)
    {
        
        int i,j,k;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                k=arr[i][j];
            }
        }
    }
    public static void main(String args[])
    {
        MatRev ob = new MatRev(0,0);
        MatRev ob1 = new MatRev(0,0);
        ob.fillarray();
        ob1.revMat(ob);
        
    }
}