package Constructor.programwithoutmain;
import java.util.*;
class  Prime_Factors
{
    int num[] = new int[100];
    int i,n;
    Prime_Factors()
    {
        for(i=0;i<100;i++)
        {
            num[i]=0;
        }
    }
    void readsize(int nx)
    {
        n=nx;
    }
    void getnumbers()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        for(i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
    }
    void show_primefact()
    {
        int i,j,k,c,lastf,p;
        for(i=0;i<n;i++)
        {
            p=num[i];
            System.out.println("Prime Factors of "+p+" is:");
            j=2;
            while(p>1)
            {
                if(p%j==0)
                {
                    c=0;
                    for(k=1;k<=j;k++)
                    {
                        if(j%k==0)
                        {
                            c++;
                        }
                    }
                    if(c==2)
                    {
                        System.out.print(j+" ");
                        p=p/j;
                        j--;
                    }
                }
                j++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int k;
        Scanner o = new Scanner(System.in);
        Prime_Factors ob = new Prime_Factors();
        System.out.println("Enter a number of elements in array");
        k=o.nextInt();
        ob.readsize(k);
        ob.getnumbers();
        ob.show_primefact();
    }
}