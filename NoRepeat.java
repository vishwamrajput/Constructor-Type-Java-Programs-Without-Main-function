package SolvedBoardspaper.Constructor;
import java.util.*;
public class NoRepeat
{
    Scanner in = new Scanner(System.in);
    String word;
    int len;
    NoRepeat(String wd)
    {
        word=wd;
    }
    boolean check()
    {
        int i,j,k=0;
        char chr1,chr2;
        len=word.length();
        for(i=0;i<len;i++)
        {
            chr1=word.charAt(i);
            for(j=i+1;j<len;j++)
            {
                chr2=word.charAt(j);
                if(chr1==chr2)
                {
                    k++;
                }
                else
                {
                    continue;
                }
            }
        }
        if(k>=1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    void prn()
    {
        if(check() == true)
        {
            System.out.println("No repeated word "+word);
        }
        else
        {
            System.out.println("Repeated words "+word);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the word");
        str=in.next();
        NoRepeat ob = new NoRepeat(str);
        ob.prn();
    }
}