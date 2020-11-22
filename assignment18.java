public class assignment18 {
    public String capital(String s)
    {
        StringBuilder newString=new StringBuilder(s);
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            if(newString.charAt(i)==' ')
            {
                continue;
            }
            else if(flag)
            {
                newString.setCharAt(i,Character.toUpperCase(newString.charAt(i)));
            }
            else
            {
                newString.setCharAt(i,Character.toLowerCase(newString.charAt(i)));
            }
          //  System.out.println(flag);
           flag=!flag;
            
        }
        return newString.toString();
       // System.out.println(flag);
    }
    public static void main(String[] args) {
        assignment18 ob=new assignment18();
        String a=new String();
    a=ob.capital("This is dancing Sentence");
    System.out.println(a);

    }
}
