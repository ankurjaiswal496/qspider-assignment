public class plusOut {
    public String plusout(String a,String b)
    { StringBuilder c=new StringBuilder(a);
        for(int i=0;i<a.length();i++)
        {
            if(c.charAt(i)=='x' || c.charAt(i)=='y')
            {
                continue;   
            }
            else{
                c.setCharAt(i, '+');
            }

        }
        return c.toString();
    }
    public static void main(String[] args) {
        plusOut ob=new plusOut();
       String a= ob.plusout("12xy34","xy");
       System.out.println(a);
    }
    
}
