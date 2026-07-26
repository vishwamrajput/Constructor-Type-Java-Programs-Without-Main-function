package SolvedBoardspaper.Constructor;
import java.util.*;
public class Unique
{
    Scanner in = new Scanner(System.in);
    String word;
    int len;
    Unique()
    {
        word="";
        len=0;
    }
    void acceptword()
    {
        System.out.println("Enter the word in Uppercase");
        word=in.next();
        word=word.toUpperCase();
    }
    boolean checkUnique()
    {
        char chr1,chr2;
        len=word.length();
        chr1=word.charAt(0);
        chr2=word.charAt(len-1);
        if(chr1=='A'||chr1=='E'||chr1=='I'||chr1=='O'||chr1=='U')
        {
            if(chr2=='A'||chr2=='E'||chr2=='I'||chr2=='O'||chr2=='U')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    void display()
    {
        if(checkUnique() == true)
        {    
            System.out.println("It is an unique word "+word);
        }
        else
        {
            System.out.println("It is not an unique word "+word);
        }
    }
    public static void main(String args[])
    {
        Unique ob = new Unique();
        ob.acceptword();
        ob.display();
    }
}