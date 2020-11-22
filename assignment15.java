public class assignment15 {
    public  void doubleChar(String s)
    {   String a=new String();
        for(int i=0;i<s.length();i++)
        {
            a=a+s.charAt(i)+s.charAt(i);
        }
        System.out.println(a);
    }
    public static void main(String[] args )
    {
        assignment15 ob=new assignment15();
        ob.doubleChar("The");
        ob.doubleChar("AAbb");
        ob.doubleChar("Hi-There");
    }
    
}
