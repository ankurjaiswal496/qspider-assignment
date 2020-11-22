//import java.util.*;
class Word
{    static void backAround(String a)
    {   String b;
        b=a.substring(a.length()-1);
       System.out.println(b+a+b);
    }
    
    public static void main(String[] args)
    {   
        backAround("cat");
        backAround("hello");
        backAround("a");
    }
   
}