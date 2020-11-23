public class mixstring {
    public void mixString(String a,String b)
    {
        String c="";
        for(int i=0;i<a.length();i++)
        {   
            c+=a.substring(i,i+1)+ b.substring(i,i+1);
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        mixstring ob=new mixstring();
        ob.mixString("abc","xyz");
       
        

    }
    
}
