public class assignment27 {
    public boolean prefixAgain(String s,int n)
    {   String newString="";
        int j=0;
        newString=s.substring(j, n);
        for(int i=n;i<s.length();i++)
        { if(n+i<s.length())
            {if(newString.equals(s.substring(i, i+n)))
               { return true;}
            }
            

        }
        return false;
    }
    public static void main(String[] args) {
        assignment27 ob=new assignment27();
        boolean result=ob.prefixAgain("abXYabc", 1);
        boolean result1=ob.prefixAgain("abXYabc", 2);
        boolean result2=ob.prefixAgain("abXYabc", 3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
    
}
