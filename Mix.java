package SolvedBoardspaper.Constructor;
import java.util.*;
public class Mix
{
    Scanner in = new Scanner(System.in);
    String wrd;
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        System.out.println("Enter the word in UpperCase");
        wrd=in.next();
        len=wrd.length();
    }
    void mix_word(Mix P,Mix Q)
    {
        int i,j,k,l;
        String temp="",p="";
        k=P.len;
        l=Q.len;
        if(k<l)
        {
            p=Q.wrd.substring(k,l);
            for(i=0;i<k;i++)
            {
                temp=temp+P.wrd.charAt(i);
                for(j=0;j<l;j++)
                {
                    if(i==j)
                    {
                        temp=temp+Q.wrd.charAt(j);
                    }
                    else
                    {
                        continue;
                    }
                }
            }
            wrd=temp+p;
            System.out.println("2"+wrd+" "+p);
        }
        else
        {
            for(i=0;i<k;i++)
            {
                temp=temp+P.wrd.charAt(i);
                for(j=0;j<l;j++)
                {
                    if(i==j)
                    {
                        temp=temp+Q.wrd.charAt(j);
                    }
                    else
                    {
                        continue;
                    }
                }
            }
            wrd=temp;
            System.out.println("1"+wrd);
        }
    }
    void display()
    {
        System.out.println("The mixed word is "+wrd);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Mix ob1 = new Mix();
        Mix ob2 = new Mix();
        Mix ob3 = new Mix();
        ob1.feedword();
        ob2.feedword();
        ob3.mix_word(ob1,ob2);
        ob3.display();
    }
}